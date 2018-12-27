package com.demo;

import java.util.List;
import java.util.Map;

import com.dbtest.dao.BaseDao;
import com.dbtest.demo.DBFactory;

public class Demo9 {
	public static void main(String[] args) {
		BaseDao baseDao = DBFactory.getBaseDao();
		List<Map<String, Object>> result = baseDao.select("select t.table_name,f.comments from user_tables t inner join user_tab_comments f on t.table_name = f.table_name");
		System.out.println(result.size());
		int count = 0;
		for (Map<String, Object> map : result) {
			String TABLE_NAME = map.get("TABLE_NAME").toString();
			boolean flag = false;
			List<Map<String, Object>> list = baseDao.select("select t.column_name from user_col_comments t where t.table_name = '"+TABLE_NAME+"'");
			for (Map<String, Object> map2 : list) {
				String COLUMN_NAME = map2.get("COLUMN_NAME").toString();
				if (COLUMN_NAME.equalsIgnoreCase("GUID")) {
					flag= true;
				}
			}
			if (flag) {
				continue;
			}
			String sql = "alter table "+TABLE_NAME+" add (GUID varchar2(255))";
			System.out.println(sql);
			baseDao.update(sql);
			count++;
		}
		System.out.println("更新了"+count+"个表");
	}
}
