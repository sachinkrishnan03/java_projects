package EmployeeManagement;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {

	HashSet<Employee> empset = new HashSet<Employee>();

	Employee emp1 = new Employee(1, "Sachin", 24, "Security Analyst", "IT-SEC", 31550);
	Employee emp2 = new Employee(2, "Venkatesh", 24, "SOC Analyst", "IT-SEC", 31550);
	Employee emp3 = new Employee(3, "Vishwa", 23, "Senior Developer", "IT", 30000);
	Employee emp4 = new Employee(4, "Diksha", 23, "Junior Developer", "IT", 20000);
	
	Scanner sc = new Scanner(System.in);
	boolean found = false;
	int id;
	String name;
	int age;
	String department;
	String designation;
	double salary;

	public EmployeeService() {
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
	}

	// view all employees
	public void viewAllEmps() {
		for (Employee emp : empset) {
			System.out.println(emp);
		}
	}

	// view emp based on their id
	public void viewEmp() {
		System.out.println("Enter id: ");
		id = sc.nextInt();
		for (Employee emp : empset) {
			if (emp.getId() == id) {
				System.out.println(emp);
				found = true;
			}
		}
		if (!found) {
			System.out.println("Employee not found");
		}
	}

	// update the employee
	public void updateEmployee() {
		System.out.println("Enter id: ");
		id = sc.nextInt();
		boolean found = false;
		for (Employee emp : empset) {
			if (emp.getId() == id) {
				System.out.println("Enter name: ");
				name = sc.next();
				System.out.println("Enter new salary");
				salary =sc.nextDouble();
				emp.setName(name);
				emp.setSalary(salary);
				System.out.println("Updated details of employee are:");
				System.out.println(emp);
				found = true;
			}
		}
		if(!found) {
			System.out.println("Employee not found");
		} else {
			System.out.println("Employee details updated successfully!!");
		}
	}
	
	//delete emp
	public void deleteEmp() {
		System.out.println("Enter id");
		id = sc.nextInt();
		boolean found = false;
		Employee empdelete = null;
		for(Employee emp : empset) {
			if(emp.getId()==id) {
				empdelete = emp;
				found = true;
			}
		}
		if(!found) {
			System.out.println("Employee not found");
		} else {
			empset.remove(empdelete);
			System.out.println("Employee deleted successfully");
		}
	}
	
	//add emp
	public void addEmp() {
		System.out.println("Enter id: ");
		id = sc.nextInt();
		System.out.println("Enter name: ");
		name = sc.next();
		System.out.println("Enter age");
		age = sc.nextInt();
		System.out.println("Enter designation");
		designation = sc.next();
		System.out.println("Enter department");
		department = sc.next();
		System.out.println("Enter salary");
		salary = sc.nextDouble();
		
		Employee emp = new Employee(id, name, age, designation, department, salary);
		
		empset.add(emp);
		System.out.println(emp);
		System.out.println("Employee added successfully");
	}
}
