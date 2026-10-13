package com.arashad.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.arashad.main.dao.insertDemo;

@SpringBootApplication
public class BatchUpdateDemo1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BatchUpdateDemo1Application.class, args);
		insertDemo id = context.getBean(insertDemo.class);
		id.insertOperation();
	}

}
