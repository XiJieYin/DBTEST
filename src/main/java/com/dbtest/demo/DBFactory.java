package com.dbtest.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Clob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dbtest.dao.BaseDao;

import oracle.sql.BLOB;

public class DBFactory {
	private static BaseDao baseDao;
	private static ApplicationContext context;
	static{
		context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		baseDao = context.getBean(BaseDao.class);
	}
	public static BaseDao getBaseDao() {
		return baseDao;
	}	

	public static ApplicationContext getContext() {
		return context;
	}


	public static List<Map<String, Object>> convertUp2LowerCase(List<Map<String, Object>> list){
		List<Map<String, Object>> infoList = new ArrayList<Map<String,Object>>();
		/*默认返回的可能是大写的Key，这个改不了，只能手动转*/
		for (Map<String, Object> map : list) {
			Map<String, Object> info = new HashMap<String, Object>();
			for(String key : map.keySet()){
				Object value = map.get(key);
				info.put(key.toLowerCase(), value);
			}
			infoList.add(info);
		}
		return infoList;
	}
	
	// 将字CLOB转成STRING类型 
    public static String ClobToString(Clob clob) throws SQLException, IOException { 
    	
        String reString = ""; 
        java.io.Reader is = clob.getCharacterStream();// 得到流 
        BufferedReader br = new BufferedReader(is); 
        String s = br.readLine(); 
        StringBuffer sb = new StringBuffer(); 
        while (s != null) {// 执行循环将字符串全部取出付值给StringBuffer由StringBuffer转成STRING 
            sb.append(s); 
            s = br.readLine(); 
        } 
        reString = sb.toString(); 
        return reString; 
    } 
    /**
 	 * 将blob转化为byte[],可以转化二进制流的
 	 * 
 	 * @param blob
 	 * @return
 	 */
 	private byte[] blobToBytes(BLOB blob) {
 		InputStream is = null;
 		byte[] b = null;
 		try {
 			is = blob.getBinaryStream();
 			b = new byte[(int) blob.length()];
 			is.read(b);
 			return b;
 		} catch (Exception e) {
 			e.printStackTrace();
 		} finally {
 			try {
 				is.close();
 				is = null;
 			} catch (IOException e) {
 				e.printStackTrace();
 			}
 		}
 		return b;
 	}

}
