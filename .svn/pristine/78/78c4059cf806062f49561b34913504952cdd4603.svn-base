package com.gx.common.constant.facatory;

import java.lang.reflect.Method;

import com.gx.common.exception.ToolBoxException;

/**
 * 字段的包装创建工厂
 *
 */
public class DictFieldWarpperFactory {

    public static Object createFieldWarpper(Object field, String methodName) {
        IConstantFactory me = ConstantFactory.me();
        try {
            Method method = IConstantFactory.class.getMethod(methodName, field.getClass());
            Object result = method.invoke(me, field);
            return result;
        } catch (Exception e) {
            try {
                Method method = IConstantFactory.class.getMethod(methodName, Integer.class);
                Object result = method.invoke(me, Integer.parseInt(field.toString()));
                return result;
            } catch (Exception e1) {
                throw new ToolBoxException("包装字典属性失败!");
            }
        }
    }

}
