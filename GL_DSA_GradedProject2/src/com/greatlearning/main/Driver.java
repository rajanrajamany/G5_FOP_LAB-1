package com.greatlearning.main;

import java.util.Scanner;
import com.greatlearning.interfaces.iCredentials;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;
public class Driver {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner userInput = new Scanner(System.in);		
		iCredentials cred= new CredentialService();
		
		String sFirstName = "Rajan";
		String sLastName = "Rajamany";
		
		Employee Emp= new Employee(sFirstName, sLastName);
		//Employee Emp= new Employee("Rajan", "Rajamany");
		
		int iDept;
		do {		
			System.out.println("Select the Department for which Credentials has to be created.");
			System.out.println("1. Technical \n" + 
							"2. Admin \n" +
							"3. Human Resource (HR) \n" +
							"4. Legal \n" +
							"5. Exit");

			
			iDept= userInput.nextInt();
			
			switch (iDept) {
			case 1: Emp.setDepartment("Technical");					
					break;
			case 2: Emp.setDepartment("Admin");		
					break;
			case 3: Emp.setDepartment("HR");
					break;
			case 4: Emp.setDepartment("Legal");
					break;
			case 5: 
					break;					
			default:
					System.out.println("Invalid Option selected. Select a valid option.");
			}		
			 
		} while (iDept!=1 && iDept!=2 && iDept!=3 && iDept!=4 && iDept!=5 );

		if (iDept!=5) {
			System.out.println("Company                : GreatLearning"); 
			System.out.println("Selected Department is : " + Emp.getDepartment() );
			System.out.println("First Name is          : " + sFirstName);
			System.out.println("Last Name is           : " + sLastName);
			Emp.setEmail( cred.generateEmailAddress(Emp.getFirstName(), Emp.getLastName(), Emp.getDepartment(), "GreatLearning"));
			Emp.setPassword(cred.generatePassword());
			
			cred.showCredentials(Emp.getEmail(),Emp.getPassword());
			System.out.println("Thank you!");
		}
		else {
			System.out.println("System Exited.");
		}
		userInput.close();
	}


}