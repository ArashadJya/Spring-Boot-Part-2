package com.arashad.main.Aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspects {
	
	@Around("execution(* com.arashad.main.service.transactionalService.*())")
	//ham chahate hai ki transactional service class ke andar jitne bhi method hai un sabke pahle login code execute ho to class name ke aage * lagake () laga denge
    
	
	public void LoggingBefore(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("-----Logging code (Before)------");
		joinPoint.proceed();
		//iska matalab ki method ke andar jo likha hoga wo print hoga phir aage wala print hoga
		System.out.println("-----Logging code (After)-------");
		
	}
	
	//agar ham chahate hai ki method ke  before and after dono side Logging code execute ho to ham arrount advice ka use karte hai

	
	
	
	
	
	
	
	
	


}
