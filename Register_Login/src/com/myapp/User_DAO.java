package com.myapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class User_DAO {
	static Connection con;
	public User_DAO() {
		try {
			con= ConnectionDB.creatConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	//End of User_DAO
	
	
	public static void registerUser(User userData) {
		String query="Insert into user_credentials (use_name, user_mail, user_password) values (?,?,?)";
		try {
			PreparedStatement pstm= con.prepareStatement(query);
			
			String name= userData.getUserName();
			pstm.setString(1, name);
			pstm.setString(2, userData.getUserEmail());
			pstm.setString(3, userData.getUserPassword());
			
			pstm.execute();
			
			System.out.println(name+" Registered Succefully::::::");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	

}
