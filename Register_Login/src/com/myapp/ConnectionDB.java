package com.myapp;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
	static String url="jdbc:mysql://localhost:3306/user_info";
	static String username="root";
	static String password="100units";
	
	public static Connection creatConnection() {
		Connection connection = null;
		try {
		
			connection= DriverManager.getConnection(url, username, password);
			System.out.println("Connection Established::::::::::::::::");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

}
