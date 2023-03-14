package com.greatlearning.emailapp;

import java.util.Scanner;

public class DriverClass {
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			String firstName = "Kapil";
			String lastName = "Jangid";
			
			System.out.println("Please enter the department from the following");
			System.out.println("1. Technical");
			System.out.println("2. Admin ");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			
			int departmentOption = input.nextInt();
			String departmentName = "";
			
			switch (departmentOption){
				case 1 : {				
					departmentName = "technical";
					break;
				}
				case 2 : {				
					departmentName = "admin";
					break;
				}
				case 3 : {
					departmentName = "hr";
					break;
				}
				case 4 : {
					departmentName = "legal";
					break;
				}
				default : {
					System.out.println("Invalid Option, Please Choose only between 1 to 4 ");
					System.exit(-1);
				}
			}
			Employee employee = new Employee(firstName, lastName, departmentName);
			
			CredentialServiceImp serviceimp = new CredentialServiceImp();
			
			serviceimp.generateEmail(employee);
			String password = serviceimp.generatePassword();
			employee.setPassword(password);
			serviceimp.displaycredential(employee);
		}
	}

}
