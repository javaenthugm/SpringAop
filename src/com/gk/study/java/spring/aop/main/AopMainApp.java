package com.gk.study.java.spring.aop.main;

import java.io.FileNotFoundException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.study.java.spring.aop.services.ShapeService;

public class AopMainApp {
	
	public static void main(String args[]) throws FileNotFoundException{
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService service = ctx.getBean("shapeService", ShapeService.class);
		//service.getCircle().setName("Dummy Name");
		//System.out.println(service.getCircle().getName());
		//System.out.println(service.getTriangle().getName());
		service.getCircle();
	}

}
