package com.arashad.main.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.arashad.main.beans.student;

@Configuration
public class springConfigFile {

    @Bean("stdObj1")
    student createObj1() {
		student std=new student();
		std.setName("Khan");
		std.setRollno(123);
		
        return std;
	}

    @Bean
    student createObj2() {
		student std=new student();
		std.setName("Arshad Jya");
		std.setRollno(234);
		return std; 
	}

}
