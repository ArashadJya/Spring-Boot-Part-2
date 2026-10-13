package com.arashad.main.Aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspects {
	
	@Before("execution(* com.arashad.main.service.transactionalService.upiTransaction()) || "+ "execution(* com.arashad.main.service.transactionalService.internetBankingTransaction())")
	//agar hame do method ke andar same code provide karna hop t aise karenge
    
	
	public void Logging() {
		System.out.println("-----Logging Code------");
	}

	
	
	


}
