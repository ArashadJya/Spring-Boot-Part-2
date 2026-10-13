package com.arashad.main.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.arashad.main.beans.items;

@Repository
public class insertDemo {
	
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	
	public void insertOperation() {
		items item1=new items();
		item1.setItemid("101");
		item1.setItemname("aaa");
		item1.setItemPrice("400");
		
		items item2=new items();
		item2.setItemid("102");
		item2.setItemname("bbb");
		item2.setItemPrice("500");
		
		items item3=new items();
		item3.setItemid("101");
		item3.setItemname("aaa");
		item3.setItemPrice("400");
		
		List<items> item_list=new ArrayList<>();
		item_list.add(item1);
		item_list.add(item2);
		item_list.add(item3);
		
		String sql_Query="insert into items values(?,?,?)";
		
		
		int[] count= jdbctemplate.batchUpdate(sql_Query,new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps, int index) throws SQLException {
			
				items item=item_list.get(index);
				
				ps.setString(1, item.getItemid());
				ps.setString(2, item.getItemname());
				ps.setString(3, item.getItemPrice());
				
			}
			
			@Override
			public int getBatchSize() {
				
				return item_list.size();
			}
		});
		
		for(int i:count) {
			System.out.println("Sucess "+i);
		}
		
	}

}
