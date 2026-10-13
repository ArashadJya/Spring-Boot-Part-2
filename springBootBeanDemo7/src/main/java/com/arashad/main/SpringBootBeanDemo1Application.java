package com.arashad.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.arashad.main.beans.student;

@SpringBootApplication
public class SpringBootBeanDemo1Application {

	public static void main(String[] args) {
		  ApplicationContext context= SpringApplication.run(SpringBootBeanDemo1Application.class, args);
		  
		
		  
		  student std2=context.getBean(student.class);
		  std2.display();
		  
		 
	}

}
