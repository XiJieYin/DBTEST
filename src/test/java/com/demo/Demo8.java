package com.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.dbtest.dao.BaseDao;
import com.dbtest.demo.DBFactory;

public class Demo8 {
	public static void main(String[] args) {
		BaseDao baseDao = DBFactory.getBaseDao();
//		System.out.println(baseDao);
		List<Map<String, Object>> result = baseDao.select("select * from YY_YYSJRL_TEST");
		Map<String,Map<String,Object>> mp = new HashMap<String, Map<String,Object>>();
		Set<String> set = new HashSet<String>();
		for(int i = 1 ;i < result.size() ; i ++){
			Map<String,Object> map = result.get(i);
			String yy_time_min = map.get("YY_TIME_MIN").toString();
			String yy_time_max = map.get("YY_TIME_MAX").toString();
			Integer week = Integer.parseInt(map.get("WEEK").toString());
			Integer maxnum = Integer.parseInt(map.get("YY_MAXNUM").toString());
			String busi_no = map.get("BUSI_NO").toString();
			String busi_fwdt_code = map.get("BUSI_FWDT_CODE").toString();
			String time = yy_time_min +"-"+yy_time_max;
			String fwdt_no = busi_fwdt_code+"_"+busi_no;
			if(set.contains(fwdt_no)){
				Map<String,Object> m = mp.get(fwdt_no);
				m.put(week.toString(), maxnum);
				mp.remove(fwdt_no);
				mp.put(fwdt_no, m);
			}else{
				Map<String,Object> m = new HashMap<String, Object>();
				m.put("fwdt_no", fwdt_no);
				m.put(week.toString(), maxnum);
				m.put("time", time);
				mp.put(fwdt_no, m);
				set.add(fwdt_no);
			}
		}
		int i = 0;
		for(String f : set){
			i++;
			Map<String,Object> m = mp.get(f);
			String time = m.get("time").toString();
			String fwdt_no = m.get("fwdt_no").toString();
			String monday = m.get("0").toString();
			String tuesday = m.get("1").toString();
			String wednesday = m.get("2").toString();
			String thursday = m.get("3").toString();
			String friday = m.get("4").toString();
			String saturday = m.get("5").toString();
			String sunday = m.get("6").toString();
			String sql = "insert into YY_YWYYSJRL_COPY (id,time,monday,tuesday,wednesday,thursday,friday,saturday,sunday,FWDT_NO) values "
					+ "(" + i + ",'" + time + "','" + monday + "','" + tuesday + "','" + wednesday + "','" + thursday
					+ "','" + friday + "','" + saturday + "','" + sunday + "','"+fwdt_no+"')";
			baseDao.insert(sql);
		}
	}
}
