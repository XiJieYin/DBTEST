package com.demo;

import java.util.List;
import java.util.Map;

import com.dbtest.dao.BaseDao;
import com.dbtest.demo.DBFactory;

public class Demo10 {
	
	public static void main(String[] args) {
		BaseDao baseDao = DBFactory.getBaseDao();
		List<Map<String, Object>> result = baseDao.select("select TABLE_NAME from user_tables");
//		List<Map<String, Object>> result = baseDao.select("select * from user_tables where tablespace_name = 'HZDOSPRO'");
		System.out.println(result.size());
		for (Map<String, Object> map : result) {
			String TABLE_NAME = map.get("TABLE_NAME").toString();
			boolean id = false;
			boolean guid = false;
			List<Map<String, Object>> list = baseDao.select("select t.column_name from user_col_comments t where t.table_name = '"+TABLE_NAME+"'");
			for (Map<String, Object> map2 : list) {
				String COLUMN_NAME = map2.get("COLUMN_NAME").toString();
				if (COLUMN_NAME.equalsIgnoreCase("ID")) {
					id= true;
				}
				if (COLUMN_NAME.equalsIgnoreCase("GUID")) {
					guid= true;
				}
			}
			if (id) {
				baseDao.createTriggerId(TABLE_NAME);
			}
			if (guid) {
				baseDao.createTriggerGuid(TABLE_NAME);
			}			
			//删除所有的trigger
//			baseDao.dropTrigger(TABLE_NAME);
			System.out.println(TABLE_NAME);
		}
	}
}
