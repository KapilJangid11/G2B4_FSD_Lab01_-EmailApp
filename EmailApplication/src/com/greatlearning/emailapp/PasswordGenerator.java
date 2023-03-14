package com.greatlearning.emailapp;

import java.util.Random;

public class PasswordGenerator {
	public String generate() {
		
		String capitalLetters = "QWERTYUIOPASDFGHJKLZXCVBNM";
		String smallLetters = "qwertyuiopasdfghjklzxcvbnm";
		String number = "1234567890";
		String specialChar = "!@#$%^&*()_";
		
		String combinedString = capitalLetters + smallLetters + number + specialChar ;
		
		Random randomObj = new Random();
		StringBuilder passwordBuilder = new StringBuilder();
		
		for(int index = 1; index<=8; index++) {
			int length = combinedString.length();
			
			
			int randomIndex = randomObj.nextInt(length);
			
			
			char charValue = combinedString.charAt(randomIndex);
			
			passwordBuilder.append(charValue);
						
		} 
		String password =
		passwordBuilder.toString();
		return password;
		
		
		
		
	}

}
