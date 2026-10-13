package com.arashad.main.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class insertDemo {
	
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	
	public void insertOperation() {
		
		String sql_Query1="insert into items values('101','shirt','200')";
		String sql_Query2="insert into items values('102','Ti-shirt','500')";
		String sql_Query3="insert into items values('103','pant','300')";
		
		int[] count= jdbctemplate.batchUpdate(sql_Query1,sql_Query2,sql_Query3);
		
		for(int i:count) {
			System.out.println("Sucess "+i);
		}
		
	}

}
