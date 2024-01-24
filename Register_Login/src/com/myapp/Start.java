package com.myapp;

import java.util.Scanner;

import javax.security.auth.login.LoginContext;

public class Start {

	public static void main(String[] args) {
		boolean flag= true;
		Scanner in= new Scanner(System.in);
		
		while (flag) {
			
			System.out.println();
			System.out.println("1.Register User");
			System.out.println("2.Login User");
			System.out.println();
			System.out.println(" ENTER CHOICE: ");
			int option = in.nextInt();
			System.out.println();
			
			in.nextLine();
			
			switch (option) {
			case 1:
				System.out.println("Enter Your Name:");
				String name=in.nextLine();
				System.out.println("Enter Your Email:");
				String email=in.nextLine();
				System.out.println("Re-Enter Your Email:");
				String emailConfirm=in.nextLine();
				
				if (!email.equals(emailConfirm)) {
					System.out.println("Email Unmatched!!!!");
					break;
				}
				
				System.out.println("Enter Your Password:");
				String password=in.nextLine();
				
				User userData= new User(name, password, email);
				new User_DAO();
				User_DAO.registerUser(userData);
				
				break;

			case 2:
				System.out.println("Enter Your Email:");
				String email1= in.nextLine();
				System.out.println("Enter Password:");
				String password1=in.nextLine();
				
				new User_DAO();
				User_DAO.loginUser(email1, password1);
				
//				if (checkBoolean) {
//					System.out.println("Login Succeful:::::::::");
//				} else {
//					System.out.println("Wrond Credentials::::::");
//				}
				
				
				break;

			default:
				System.out.println("Invalid Input!!!!!!!!!");
				break;
			}
			
			
		}

		
		
		
		
		
		
		
	}

}
