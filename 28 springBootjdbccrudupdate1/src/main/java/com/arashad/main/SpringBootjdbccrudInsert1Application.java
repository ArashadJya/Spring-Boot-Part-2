package com.arashad.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.arashad.main.dao.DeleteDemo;

@SpringBootApplication
public class SpringBootjdbccrudInsert1Application {

	public static void main(String[] args) {
	  ApplicationContext context= 	SpringApplication.run(SpringBootjdbccrudInsert1Application.class, args);
	  
	  DeleteDemo id=context.getBean(DeleteDemo.class);
	  id.insertOperation();
	  
	}

}
