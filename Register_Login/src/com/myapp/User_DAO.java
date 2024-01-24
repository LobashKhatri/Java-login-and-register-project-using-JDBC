package com.myapp;

import java.lang.invoke.StringConcatFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	
	public static void loginUser(String email, String password) {
		String query="select * from user_credentials where user_mail=? and user_password=?";
		
		try {
			PreparedStatement pstm= con.prepareStatement(query);
			pstm.setString(1, email);
			pstm.setString(2, password);
			
			ResultSet resultSet= pstm.executeQuery();
			
			while(resultSet.next()) {
				String nameString= resultSet.getString(4);
				System.out.println("Welcome : "+nameString);
			}
			
			
		} catch (Exception e) {
			System.out.println("Something wrond:::::::");
			e.printStackTrace();
			
		}
		
		
	}
	
	
	

}
