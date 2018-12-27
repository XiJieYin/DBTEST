package com.demo;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import com.alibaba.druid.proxy.jdbc.ClobProxyImpl;
import com.dbtest.demo.DBFactory;

import net.sf.json.JSONObject;
import oracle.sql.CLOB;

public class Demo {
	@SuppressWarnings("unused")
	private static Logger logger = Logger.getGlobal();

	public static void main(String[] args) throws SQLException, IOException {
		List<Map<String, Object>> modes = new ArrayList<Map<String, Object>>();
		Map<String, Object> mode1 = new HashMap<String, Object>();
		mode1.put("MODE_CODE", "demo_node_17");
		mode1.put("MODE_NAME", "符合办理条件5");
		mode1.put("COND_ID", "402");
		mode1.put("PARENT_ID", "0");
		mode1.put("END", "2");
		Map<String, Object> mode2 = new HashMap<String, Object>();
		mode2.put("MODE_CODE", "demo_node_11");
		mode2.put("MODE_NAME", "符合办理条件2");
		mode2.put("COND_ID", "402");
		mode2.put("PARENT_ID", "0");
		mode2.put("END", "2");
		Map<String, Object> mode3 = new HashMap<String, Object>();
		mode3.put("MODE_CODE", "demo_node_32");
		mode3.put("MODE_NAME", "符合办理条件3");
		mode3.put("COND_ID", "402");
		mode3.put("PARENT_ID", "0");
		mode3.put("END", "2");
		Map<String, Object> mode4 = new HashMap<String, Object>();
		mode4.put("MODE_CODE", "demo_node_31");
		mode4.put("MODE_NAME", "符合办理条件4");
		mode4.put("COND_ID", "402");
		mode4.put("PARENT_ID", "0");
		mode4.put("END", "2");
		Map<String, Object> mode5 = new HashMap<String, Object>();
		mode5.put("MODE_CODE", "demo_node_33");
		mode5.put("MODE_NAME", "符合办理条件6");
		mode5.put("COND_ID", "402");
		mode5.put("PARENT_ID", "0");
		mode5.put("END", "2");
		modes.add(mode1);
		modes.add(mode2);
		modes.add(mode3);
		modes.add(mode4);
		modes.add(mode5);

		List<Map<String, Object>> result = DBFactory.convertUp2LowerCase(
				DBFactory.getBaseDao().select("select * from ZX_PROCESS_MODE where COND_ID = 402"));
		System.out.println("数据库里面业务为402的mode的数量：" + result.size());
		for (Map<String, Object> map : modes) {
			String modeCode = map.get("MODE_CODE").toString();

			if (find(result, modeCode)) {
				String sql = "update ZX_PROCESS_MODE set MODE_CODE = '" + map.get("MODE_CODE").toString()
						+ "',MODE_NAME = '" + map.get("MODE_NAME").toString() + "',COND_ID = "
						+ map.get("COND_ID").toString() + ",PARENT_ID = "+map.get("PARENT_ID").toString()+",END = " + map.get("END").toString()
						+ " where MODE_CODE = '" + map.get("MODE_CODE").toString()+"' and COND_ID = 402";
				DBFactory.getBaseDao()
						.update(sql);
			} else {
				Integer id = DBFactory.getBaseDao().getMaxId("select SEQ_PROCESS_MODE.nextval from dual");
				System.out.println(id);
				String sql = "INSERT INTO ZX_PROCESS_MODE(id,MODE_CODE,MODE_NAME,COND_ID,PARENT_ID,END)"
						+ " VALUES("+id+",'" + map.get("MODE_CODE").toString() + "','"
						+ map.get("MODE_NAME").toString() + "'," + map.get("COND_ID").toString() + ","
						+ map.get("PARENT_ID").toString() + "," + map.get("END").toString() + ")";
				DBFactory.getBaseDao()
						.insert(sql);
			}
		}
		System.out.println("数据库里面业务为402的mode的数量（做完了更新插入，剩下的是前台没有传进来的，他们要被删掉）：" + result.size());
		String ids = "";
		for (Map<String, Object> map : result) {
			ids += map.get("id").toString() + ",";
		}
		if (ids.length() > 0) {
			ids = ids.substring(0, ids.length() - 1);
		}
		System.out.println(ids);	
		if(ids.length()>0){
			DBFactory.getBaseDao().delete("delete from ZX_PROCESS_MODE where id in(" + ids + ")");
		}
		result = DBFactory.getBaseDao().select("select * from ZX_PROCESS_MODE where COND_ID = 402");
		System.out.println("数据库里面业务为402的mode的数量(删除之后)：" + result.size());
	}

	public static Boolean find(List<Map<String, Object>> result, String modeCode) {
		int deleteIndex = 0;
		for (int i = 0; i < result.size(); i++) {
			if (result.get(i).get("mode_code").toString().equalsIgnoreCase(modeCode)) {
				deleteIndex = i;
				result.remove(deleteIndex);
				return true;
			}
		}
		return false;
	}
}