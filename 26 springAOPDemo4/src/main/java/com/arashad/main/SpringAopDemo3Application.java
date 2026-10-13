package com.arashad.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.arashad.main.service.transactionalService;

@SpringBootApplication
public class SpringAopDemo3Application {

	public static void main(String[] args) {
	ApplicationContext contect=	SpringApplication.run(SpringAopDemo3Application.class, args);
	
	       transactionalService transction=contect.getBean(transactionalService.class);
	       transction.upiTransaction();
	       System.out.println(" ");
	       
	       transction.internetBankingTransaction();
	       System.out.println();
	       
	       transction.mobileBankingTransaction();
	       System.out.println();
	       
	       transction.walletTransaction();
	}

}
