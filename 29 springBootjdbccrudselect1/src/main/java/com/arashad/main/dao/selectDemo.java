package com.arashad.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.arashad.main.beans.items;
import com.arashad.main.mappers.ItemsRowMapper;

@Repository
public class selectDemo {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void selectOperation() {
		String sql_Query="select*from items";
		
	List<items> items_list=	jdbcTemplate.query(sql_Query, new ItemsRowMapper());
	System.out.println("Begfore");
		
	System.out.println(items_list);
	System.out.println("After");
	
	for(items item:items_list) {
		System.out.print(item.getItemid()+" "+item.getItemname()+" "+item.getItemprice());
		System.out.println("----------------------------------------");
	}
	
	}
	

}
