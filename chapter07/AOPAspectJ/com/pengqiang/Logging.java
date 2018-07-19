package com.pengqiang;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {
	@Pointcut("execution(* com.pengqiang.*.*(..))")
	private void selectAll() {
		
	}

	@Before("selectAll()")
	public void beforeAdvice() {
		System.out.println("going to setup student profile.");
	}
	
	@After("selectAll()")
	public void afterAdvice() {
		System.out.println("has setup student profile.");
	}
	
	@AfterReturning(pointcut="selectAll()",returning="result")
	public void afterReturningAdvice(Object result) {
		System.out.println("result is: " + result.toString());
	}
	
	@AfterThrowing(pointcut="selectAll()",throwing="ex")
	public void afterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("thers is exception: " + ex.toString());
	}
}
