package com.gx.common.log;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import com.gx.common.utils.SpringFactory;

/**
 * 被修改的bean临时存放的地方
 *
 */
@Component
public class LogObjectHolder implements Serializable{

    /**
	 * Comments for <code>serialVersionUID</code>
	 * 
	 */
	
	private static final long serialVersionUID = -5865827898931067699L;
	
	private Object object = null;

    public void set(Object obj) {
        this.object = obj;
    }

    public Object get() {
        return object;
    }

    public static LogObjectHolder me(){
        LogObjectHolder bean = SpringFactory.getBean(LogObjectHolder.class);
        return bean;
    }
}
