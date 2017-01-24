package com.gk.study.java.spring.aop.aspects;


import org.aspectj.lang.ProceedingJoinPoint;


public class LoggingAspectXml {
	
	
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		Object returnValue = null;
		try {
			System.out.println("from xml config before proceed...");
			returnValue = proceedingJoinPoint.proceed();
			System.out.println("from xml config after proceed...");
		} catch (Throwable e) {
			System.out.println("from xml config caught exception");
		}
		System.out.println("from xml config after finally...");
		
		return returnValue;
	}
	
}
