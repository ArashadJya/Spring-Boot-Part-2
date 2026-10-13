package com.arashad.main.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.arashad.main.beans.items;

public class ItemsRowMapper implements RowMapper<items> {

	@Override
	public items mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		String item_id1=rs.getString("item_id");
		String item_name=rs.getString("item_name");
		String item_price=rs.getString("item_price");
		
		items items=new items();
		items.setItemid(item_id1);
		items.setItemname(item_name);
		items.setItemprice(item_price);
		return items;
	}
	

}
