package com.arashad.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.arashad.main.dao.InsertDemo;

@SpringBootApplication
public class NpJdbcTemplate1Application {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(NpJdbcTemplate1Application.class, args);
	
	InsertDemo id=context.getBean(InsertDemo.class);
	id.insertOperation();
	}

}
