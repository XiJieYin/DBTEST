package com.gx.common.utils;

import java.io.InputStream;
import java.util.Properties;

public class PropertyUtil {
	private static Properties p = null;  
	  
    public synchronized static void initP(String propertyName) throws Exception {  
        if (p == null) {  
            p = new Properties();  
  
            InputStream inputstream = PropertyUtil.class.getClassLoader()  
                    .getResourceAsStream(propertyName);//<span style="color: rgb(0, 0, 255); font-family: Arial, sans-serif, Helvetica, Tahoma; font-size: 14px; line-height: 25px;">abc.properties</span>  
            if (inputstream == null) {  
                throw new Exception("inputstream " + propertyName  
                        + " open null");  
            }  
            p.load(inputstream);  
            inputstream.close();  
            inputstream = null;  
        }  
    }  
  
    public static String getValueByKey(String propertyName, String key) {  
        String result = "";  
        try {  
            initP(propertyName);  
            result = p.getProperty(key);  
            return result;  
        } catch (Exception e) {  
            e.printStackTrace();  
            return "";  
        }  
    }  
    
    public static void main(String[] s) {  
    	
        System.out.println(getValueByKey("db.properties","url"));  
    }  
}
