package com.arashad.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.arashad.main.dao.selectDemo;

@SpringBootApplication
public class SpringBootjdbccrudselect1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootjdbccrudselect1Application.class, args);
		selectDemo sd = context.getBean(selectDemo.class);
		sd.selectOperation();
	}

}
