package com.arashad.main.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.arashad.main.beans.Address;
import com.arashad.main.beans.student;

@Configuration
public class springConfigFile {

	@Bean
   Address createObj1() {
	   Address addr=new Address();
	   addr.setHouseno(123);
	   addr.setCity("Gorakhpur");
	   addr.setPincode(274402);
	   return addr;
   }

    @Bean
    student createObj2() {
		student std=new student();
		std.setName("Arshad Jya");
		std.setRollno(234);
		std.setAddress(createObj1());
		return std; 
	}

}
