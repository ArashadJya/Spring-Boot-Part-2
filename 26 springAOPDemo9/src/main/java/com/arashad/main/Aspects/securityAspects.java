package com.arashad.main.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)

public class securityAspects {
	
	@Before("execution(* com.arashad.main.service.*.*())")
	public void security() {
		System.out.println("Security code (Before)");
	}

}
// ham chahate hai ki security wala coe pahle execute ho tomiska order 1 kar diye
