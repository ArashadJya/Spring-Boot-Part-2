package com.arashad.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.arashad.main.beans.student;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootBeanDemo1Application {

	@Autowired
	private student student;
	
	public static void main(String[] args) {
		  SpringApplication.run(SpringBootBeanDemo1Application.class, args);
		  
	}
		
		  @PostConstruct
		public void m1() {
	        student.display();	
		}
	

}
