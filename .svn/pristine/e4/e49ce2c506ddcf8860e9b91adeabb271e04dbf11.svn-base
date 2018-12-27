package com.gx.common.constant.facatory;

import org.springframework.stereotype.Component;

import com.gx.common.utils.SpringFactory;

/**
 * 常量的生产工厂
 *
 */
@Component
public class ConstantFactory implements IConstantFactory {


    public static IConstantFactory me() {
        return SpringFactory.getBean("constantFactory");
    }



}
