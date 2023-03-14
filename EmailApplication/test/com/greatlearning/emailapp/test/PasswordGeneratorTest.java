package com.greatlearning.emailapp.test;

import com.greatlearning.emailapp.PasswordGenerator;

public class PasswordGeneratorTest {
	public static void main(String[] args) {
		
		PasswordGenerator generator = new PasswordGenerator();
		String password = generator.generate();
		System.out.println("Password --> " + password);
		
	}

}
