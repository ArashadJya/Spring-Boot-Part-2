package com.arashad.main.dao;



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
		
items	item=	jdbcTemplate.queryForObject(sql_Query, new ItemsRowMapper());
//query for object tab use hoga jab hame database se kewal ek hi object fetch karna ho

	System.out.print(item.getItemid()+" "+item.getItemname()+" "+item.getItemprice());
	
	
	
	}
	

}
