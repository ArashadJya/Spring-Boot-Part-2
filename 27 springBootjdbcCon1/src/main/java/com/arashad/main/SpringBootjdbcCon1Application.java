package com.arashad.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.arashad.main.dbcon.dbConnection;

@SpringBootApplication
public class SpringBootjdbcCon1Application {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(SpringBootjdbcCon1Application.class, args);
	
	   dbConnection dbcon= context.getBean(dbConnection.class);
	   dbcon.checkDBConnection();
	}

}
//Spring Boot JDBC
//                - Spring Boot JDBC provide a way to connect the spring boot application with JDBC and execute a SQL queries
