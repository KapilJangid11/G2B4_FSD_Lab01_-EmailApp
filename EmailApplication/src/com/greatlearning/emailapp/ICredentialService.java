package com.greatlearning.emailapp;

public interface ICredentialService {
	
	String generatePassword();
	String generateEmail(Employee employee);
	void displaycredential(Employee employee);
	
	

}
