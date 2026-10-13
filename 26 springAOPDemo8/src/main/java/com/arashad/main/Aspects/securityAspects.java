package com.arashad.main.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class securityAspects {
	
	@Before("execution(* com.arashad.main.service.transactionalService.*())")
	public void security() {
		System.out.println("Security code (Before)");
	}

}
