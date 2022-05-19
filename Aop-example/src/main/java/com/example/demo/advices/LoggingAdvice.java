package com.example.demo.advices;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class LoggingAdvice {
	//If you are using slf4j u will command logger method
	//Logger logger = Logger.getAnonymousLogger();
	
	@Before("execution(* com.example.demo.*.*.*(..))")
	public void logBeforeMethod(JoinPoint jp) {
		
		//logger.info(jp.getSignature().getName() + "========Called==========");
		log.info(jp.getSignature().getName() + "========Called==========");
	}
	
	@Around("execution(* com.example.demo.services.LoanService.*(..))")
	public Object aroundAdviceMethod(ProceedingJoinPoint pjp) throws Throwable {
		
		Object[] input = pjp.getArgs();
		
		System.out.println("First Argument $$$$$$$$$$$$$$$$$:=" +input[0]);
		
		
		log.info(pjp.getSignature().getName() + "**Called**");
		
         	Integer actual =(Integer)input[0];
         		actual = actual +50;
         		Object obj = pjp.proceed(new Integer[]  {actual});
		
		
		//Object obj =pjp.proceed(new Integer[] {3450});
		
		
		Double resp = (Double)obj;
		resp = resp + 2;
		log.info(pjp.getSignature().getName() +"**Completed**");
		
		return resp;
	}

}
