package com.springaop.www.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspect {

	/*
	 * This is where we add all of our related advices for logging
	 */

	// Let's start with an @Before advice
	@Before("execution(public void addAccount())")
	public void beforeAddAccountAdvice() {
		
		System.out.println("\n=======>>> Executing @Before advice on addAccount()\n");
	
	}
	
	@Before("execution(public void deleteAccount())")
	public void beforeDeleteAccountAdvice() {
		
		System.out.println("\n=======>>> Executing @Before advice on deleteAccount()\n");
	
	}

}
