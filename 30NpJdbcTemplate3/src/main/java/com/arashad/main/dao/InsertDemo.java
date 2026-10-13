package com.arashad.main.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.arashad.main.beans.Items;

@Repository
public class InsertDemo {
	
	@Autowired
	private NamedParameterJdbcTemplate npJdbcTemplate;
	
	public void insertOperation() {
	Items item=new Items();
	item.setItemid("106");
	item.setItemName("Kurta");
	item.setItemPrice("900");
	
    BeanPropertySqlParameterSource params=new BeanPropertySqlParameterSource(item);
    
    String sql_Query="insert into items values(:itemid,:itemName,:itemPrice)";
    
    int count=npJdbcTemplate.update(sql_Query, params);
    
    if(count>0) {
    	System.out.println("Sucess");
    }
    else {
    	System.out.println("Fail");
    }
	
	}

}
