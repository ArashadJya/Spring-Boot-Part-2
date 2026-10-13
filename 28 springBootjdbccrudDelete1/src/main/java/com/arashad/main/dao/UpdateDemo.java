package com.arashad.main.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UpdateDemo {
	
@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insertOperation() {
		String item_id="101";
		String item_name="Lungi";
		String item_price="100";
		
		try {
			String sql_query="update items set item_name = ?  where item_id=?";
			int count=jdbcTemplate.update(sql_query, item_name,item_id);
			
			if(count>0) {
				System.out.println("Updation sucess");
			}
			else {
				System.out.println("Updation failed");
			}
		}
		catch (Exception e) {
			System.out.println("Updation failed");
			e.printStackTrace();
		}
	}

}
