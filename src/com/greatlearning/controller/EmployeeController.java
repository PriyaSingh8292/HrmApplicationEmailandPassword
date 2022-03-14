package com.greatlearning.controller;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.EmployeeCredentialsService;

public class EmployeeController {
	
	public static void main(String[] args) {
		Employee employee=new Employee ("Priya", "Singh");
		
		EmployeeCredentialsService service=new EmployeeCredentialsService();
		
		Scanner s=new Scanner(System.in);
		
		String generateEmail;
		
		char[] generatePassword;
		
		System.out.println("\n 1 Technical \n 2 Admin \n 3 HR");
		
		int option=s.nextInt();
		switch (option) {
		case 1:
			
			generateEmail=service.generatemail(employee.getFirstName(), employee.getLastName(), "technical");
			generatePassword=service.generatePassword();
			service.showCredentials(employee , generateEmail , generatePassword );
			
			break;
		case 2:
			
			generateEmail=service.generatemail(employee.getFirstName(), employee.getLastName(), "Admin");
			generatePassword=service.generatePassword();
			service.showCredentials(employee , generateEmail , generatePassword );
			
			break;
		case 3:
	
			generateEmail=service.generatemail(employee.getFirstName(), employee.getLastName(), "HR");
			generatePassword=service.generatePassword();
			service.showCredentials(employee , generateEmail , generatePassword );
	
			break;
			
			default:System.out.println("\n invalid choice");
				break;
		}
	}

}
