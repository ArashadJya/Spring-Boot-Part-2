package com.arashad.main.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class InsertDemo {
	
	@Autowired
	private NamedParameterJdbcTemplate npJdbcTemplate;
	
	public void insertOperation() {
		MapSqlParameterSource param=new MapSqlParameterSource();
		param.addValue("key_itemId", "103");
		param.addValue("key_itemName", "pant");
		param.addValue("key_itemPrice", "2000");
		
		String sql_Query="insert into items values(:key_itemId,:key_itemName,:key_itemPrice)";
		
		int count=npJdbcTemplate.update(sql_Query, param);
		if(count>0) {
			System.out.println("success");
		}
		else {
			System.out.println("Fail");
		}
	}

}
