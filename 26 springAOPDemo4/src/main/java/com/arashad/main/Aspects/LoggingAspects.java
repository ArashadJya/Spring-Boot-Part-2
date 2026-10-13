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
		System.out.println("-----Logging Code Before------");
	}
	
	@After("execution(* com.arashad.main.service.transactionalService.*())")
	//ham chahate hai ki transactional service class ke andar jitne bhi method hai un sabke baad login code execute ho to class name ke aage * lagake () laga denge
    
	
	public void LoggingAfter() {
		System.out.println("-----Logging Code after------");
	}

	
	
	


}
