package com.gx.common.constant.facatory;

import com.gx.common.constant.base.AbstractDictMap;
import com.gx.common.constant.base.SystemDict;
import com.gx.common.exception.ToolBoxException;


/**
 * 字典的创建工厂
 *
 */
public class DictMapFactory {

    private static final String basePath = "com.stylefeng.guns.common.constant.dictmap.";

    /**
     * 通过类名创建具体的字典类
     */
    @SuppressWarnings("unchecked")
	public static AbstractDictMap createDictMap(String className) {
        if("SystemDict".equals(className)){
            return new SystemDict();
        }else{
            try {
                Class<AbstractDictMap> clazz = (Class<AbstractDictMap>) Class.forName(basePath + className);
                return clazz.newInstance();
            } catch (Exception e) {
                throw new ToolBoxException("创建字典失败!");
            }
        }
    }
}
