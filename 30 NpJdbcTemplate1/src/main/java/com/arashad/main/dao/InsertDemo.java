package com.arashad.main.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class InsertDemo {
	
	@Autowired
	private NamedParameterJdbcTemplate npJdbcTemplate;
	
	public void insertOperation() {
		
		Map<String, Object> maps=new HashMap<>();
		maps.put("key_itemId", "101");
		maps.put("key_itemName", "T-Shirt");
		maps.put("key_itemPrice", "1000");
		
		String sql_Query="insert into items values(:key_itemId,:key_itemName,:key_itemPrice)";
		
		int count=npJdbcTemplate.update(sql_Query, maps);
		if(count>0) {
			System.out.println("success");
		}
		else {
			System.out.println("Fail");
		}
	}

}
