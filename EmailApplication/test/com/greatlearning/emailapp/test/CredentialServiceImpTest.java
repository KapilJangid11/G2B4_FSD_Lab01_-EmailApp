package com.greatlearning.emailapp.test;

import com.greatlearning.emailapp.CredentialServiceImp;
import com.greatlearning.emailapp.Employee;
import com.greatlearning.emailapp.PasswordGenerator;

public class CredentialServiceImpTest {
	public static void main(String[] args) {
		
		//testEmailGeneration();		
		//testPasswordGeneration();
		testDisplaycredential();
	}
		
	static void testEmailGeneration() {
	CredentialServiceImp serviceimp = new CredentialServiceImp();
	
	Employee kapil = new Employee("Kapil", "Jangid", "Technical");
	String emailAdress = serviceimp.generateEmail(kapil);
	
	System.out.println(emailAdress);
	
	CredentialServiceImp generator = new CredentialServiceImp();
	String password = generator.generatePassword();
	
	System.out.println(password);
	}
	
	static void testPasswordGeneration() {
		CredentialServiceImp serviceimp = new CredentialServiceImp();
		String password = serviceimp.generatePassword();
		//System.out.println("password --. " + password);
	}
	
	static void testDisplaycredential() {
		CredentialServiceImp serviceimp = new CredentialServiceImp();
		Employee kapil = new Employee("kapil", "Jangid", "Technical");
		serviceimp.generateEmail(kapil);
		String password = serviceimp.generatePassword();
		kapil.setPassword(password);
		serviceimp.displaycredential(kapil);
		
		
	}
}
	