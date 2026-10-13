package com.arashad.main.dbcon;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class dbConnection {
	
	@Autowired
	private DataSource datasource;
	
	public void checkDBConnection() {
	try {
		Connection con=	datasource.getConnection();
		
		if(con!=null) {
			System.out.println("Connection created sucessfully");
		}
		else {
			System.out.println("Connection failed");
		}

	}
	catch (Exception e) {
		System.out.println("Connection failed");
	       e.printStackTrace();
	}
	}

}
