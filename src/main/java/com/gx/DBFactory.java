package com.gx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DBFactory {
	private static ApplicationContext context;
	static{
		context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	}

	public static ApplicationContext getContext() {
		return context;
	}
}
