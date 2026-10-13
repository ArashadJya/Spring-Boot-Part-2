package com.arashad.main.Aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspects {
	
	@Before("execution(* com.arashad.main.service.transactionalService.*(..))")
	//agar ham chahate hai ki method ka parameter kisi bhi type ka sara method ke aage loging advice wala code execute ho to ham () ke andar .. ka use kar denge
    
	
	public void Logging() {
		System.out.println("-----Logging Code------");
	}

	
	
	


}
