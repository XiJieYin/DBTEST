package com.demo;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.alibaba.druid.proxy.jdbc.ClobProxyImpl;
import com.dbtest.demo.DBFactory;

import net.sf.json.JSONObject;
import oracle.sql.CLOB;

public class Demo2 {
	public static void main(String[] args) throws SQLException, IOException {

		 List<Map<String, Object>> list =
		 DBFactory.convertUp2LowerCase(DBFactory.getBaseDao().select("select cond.*,bis.ID bis_id,bis.BIZ_TYPE from ZX_PROCESS_COND cond left join ZX_INFOR_BIS bis on cond.BIZTYPE_ID = bis.ID where BIZ_TYPE = '注销户口'"));
		 Map<String, Object> cond = list.get(0);
		 System.out.println(cond);
		 ClobProxyImpl cp = (ClobProxyImpl)cond.get("mode_content");
		 CLOB mode_content = (CLOB)cp.getRawClob();
		 String contentStr = DBFactory.ClobToString(mode_content);
		 JSONObject Obj = JSONObject.fromObject(contentStr);
		 System.out.println(Obj);
		 JSONObject lines = JSONObject.fromObject(Obj.get("lines"));
		 System.out.println(lines);
	}
}
