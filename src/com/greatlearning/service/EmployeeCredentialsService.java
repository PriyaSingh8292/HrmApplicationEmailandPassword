package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.com.Employee;

public class EmployeeCredentialsService {
	
	public char[] generatePassword() {
		char password[] = new char [8];
		String capitalletter="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerletter="abcdefghijklmnopqrstuvwxyz";
		String num="0123456789";
		String specialCharacters="!@#$%^&*_=+-/.?<>";
		String values=capitalletter+lowerletter+num+specialCharacters;
		
		Random random=new Random();
		for(int i=0;i<8;i++) {
			password[i]=values.charAt(random.nextInt(values.length()));
		}
		
		
		return password;
	}
	public String generatemail(String firstName, String lastname, String department)
	{
		return firstName + lastname + "@" + department + "greatlearning.com";
	}
	public void showCredentials(com.greatlearning.model.Employee employee ,String email,char[] generatedPassword) {
		
		System.out.println("\n employee : "+ employee.getFirstName());
		System.out.println("\n email :"  + email);
		System.out.println("\n generatedPassword : " + generatedPassword );
	}
	

}
