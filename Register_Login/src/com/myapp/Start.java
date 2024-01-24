package com.myapp;

import java.util.Scanner;

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
				System.out.println("LOGGED IN");
				break;

			default:
				System.out.println("Invalid Input!!!!!!!!!");
				break;
			}
			
			
		}

		
		
		
		
		
		
		
	}

}
