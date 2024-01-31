package EmployeeManagement;

import java.util.Scanner;
public class Main {
	
	EmployeeService service = new EmployeeService();
	static boolean ordering = true;
	public static void menu () {
		System.out.println(
				"****** Welcome to employee management system ******"
				+ "\n1. Add employee"
				+ "\n2. View employee"
				+ "\n3. Update employee"
				+ "\n4. Delete employee"
				+ "\n5. View all employee"
				+ "\n6. Exit"
				);
	} 
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		EmployeeService service = new EmployeeService();
		
		do {
			menu();
			System.out.println("Enter your choice :");
			int choice = sc.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("Add employee");
				service.addEmp();
				break;
				
			case 2: 
				System.out.println("View employee");
				service.viewEmp();
				break;
				
			case 3:
				System.out.println("Update employee");
				service.updateEmployee();
				break;
				
			case 4:
				System.out.println("Delete employee");
				service.deleteEmp();
				break;
				
			case 5:
				System.out.println("View all employee");
				service.viewAllEmps();
				break;
				
			case 6:
				System.out.println("Thank you for using application");
				System.exit(0);
				
			default:
				System.out.println("Please enter valid choice");
				break;
				
			}
		}while(ordering);
	}
}
