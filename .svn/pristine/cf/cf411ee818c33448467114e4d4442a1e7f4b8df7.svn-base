package com.demo;

import java.util.Date;
import java.util.List;

import com.gx.DBFactory;
import com.gx.hz.dao.AnjuanVDao;
import com.gx.hz.pojo.AnjuanV;
import com.gx.hz.service.AnjuanVService;

public class Demo6 {
	public static void main(String[] args) {
		AnjuanVService anjuanVService = DBFactory.getContext().getBean(AnjuanVService.class);
		AnjuanV anjuanV = new AnjuanV("1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", new Date(), "1", "1", new Date(), "1", new Date());
		System.out.println(anjuanV);
		
		AnjuanVDao anjuanVDao = DBFactory.getContext().getBean(AnjuanVDao.class);
		System.out.println(anjuanVDao);
		anjuanVDao.insertSelective(anjuanV);
	}
}
