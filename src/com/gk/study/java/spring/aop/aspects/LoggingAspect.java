package com.gk.study.java.spring.aop.aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	/*@Before("execution(public String com.gk.study.java.spring.aop.model.Circle.getName())")
	public void LogginAdvice(){
		System.out.println("Advise run. Get method called");
	}
	*/
		
	/*@After("allGetters())")
	public void wildCardService(JoinPoint joinPoint ){
		//System.out.println("Wild AOP Service is being called");
		System.out.println(joinPoint.toString());
	}
	
	@After("allCircleMethods())")
	public void withinAnnotation(){
		System.out.println("Within annotation");
	}
	
	@After("args(name)")
	public void stringWithArgumentService(String name){
		System.out.println("String with Argument Service is being called "+ name);
	}*/
	
	/*@Around("allGetters()")
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		Object returnValue = null;
		try {
			System.out.println("before proceed...");
			returnValue = proceedingJoinPoint.proceed();
			System.out.println("after proceed...");
		} catch (Throwable e) {
			System.out.println("caught exception");
		}
		System.out.println("after finally...");
		
		return returnValue;
	}*/
	
	//@Around("@annotation(com.gk.study.java.spring.aop.aspects.Loggable)")
	@Around("allGetters()")
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		Object returnValue = null;
		try {
			System.out.println("before proceed...");
			returnValue = proceedingJoinPoint.proceed();
			System.out.println("after proceed...");
		} catch (Throwable e) {
			System.out.println("caught exception");
		}
		System.out.println("after finally...");
		
		return returnValue;
	}
	
	@Pointcut("execution(public * get*())")
	public void allGetters(){}
	
	/*@Pointcut("within(com.gk.study.java.spring.aop.model.Circle)")
	public void allCircleMethods(){}*/

}
