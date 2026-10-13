package com.arashad.main.Aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspects {
	
	@Before("execution(* com.arashad.main.service.transactionalService.*())")
	//ham chahate hai ki transactional service class ke andar jitne bhi method hai un sabke pahle login code execute ho to class name ke aage * lagake () laga denge
    
	
	public void LoggingBefore() {
		m1();
	}

	
	@After("execution(* com.arashad.main.service.transactionalService.*())")
	//ham chahate hai ki transactional service class ke andar jitne bhi method hai un sabke pahle login code execute ho to class name ke aage * lagake () laga denge
    
	
	public void LoggingAfter() {
		m1();
	}
	
	
	
	
	public void  m1() {
		System.out.println("-----Logging code------");
		
	}
	//agar logging code before wala and after wala same ho to ham use ek akag method ke andar likh dete hai and and before and after wale method me us method ka name de dete hai

	
	
	


}
