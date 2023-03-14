package com.greatlearning.emailapp;

import java.util.Random;

public class CredentialServiceImp
	implements ICredentialService{

	public String generatePassword() {
		
		PasswordGenerator generator = new PasswordGenerator();
		String password = generator.generate();
		
		return password;
	}

	public String generateEmail(Employee employee) {

		String firstName = employee.getFirstName();
		String lastName = employee.getLastName();
		String department = employee.getDepartmant();
		
		StringBuilder emailBuilder = new StringBuilder();
		
		emailBuilder.append(firstName.toLowerCase());
		emailBuilder.append(lastName.toLowerCase());
		emailBuilder.append("@");
		emailBuilder.append(department);
		emailBuilder.append(".abc.com");
		
		String email = emailBuilder.toString();
		employee.setEmail(email);
		return email;
		
	}

	@Override
	public void displaycredential(Employee employee) {

		/*System.out.println("Dear " + employee.getFirstName() + " your generated Credentials are as follows" );
		System.out.println("Email Address --> " + employee.getEmail());
		System.out.println("Password --> " + employee.getPassword());*/
		StringBuilder massageBuilder = new StringBuilder();
		
		massageBuilder.append("Dear "); 
		massageBuilder.append(employee.getFirstName());
		massageBuilder.append(" your generated credentials are as follows");
		
		String newline = System.getProperty("line.separator");
		massageBuilder.append(newline);
		
		massageBuilder.append("Email Address --> ");
		massageBuilder.append(employee.getEmail());
		
		massageBuilder.append(newline);
		massageBuilder.append("Password -->");
		massageBuilder.append(employee.getPassword());
		
		String finalMassage = massageBuilder.toString();
		System.out.println(finalMassage);
		
	}
	
		
	}


