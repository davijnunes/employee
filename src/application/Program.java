package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import entities.Employee;
import entities.EmployeeManager;
import entities.EmployeeProgrammer;


public class Program {
	
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> listOfEmployee = new ArrayList<Employee>();
		
		System.out.print("Enter a quantity of employee: ");
		int quantityOfEmployee = sc.nextInt();
		
		System.out.println();
		
		for(int i = 0; i < quantityOfEmployee; i++) {
			
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			// System.out.println("Debugging: " + hasId(listOfEmployee,id));
			
			while(hasId(listOfEmployee,id)) {
				
				// System.out.println("Debugging");
				System.out.print("Enter new id please: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			// clear buffer
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			// clear buffer
			sc.nextLine();
			
			System.out.print("Employee is of type manager or programmer: ");
			String typeOfProgrammer = sc.nextLine();
			
			if(typeOfProgrammer.equalsIgnoreCase("manager")) {
				
				Employee employee = new EmployeeManager(name,salary,id);
				listOfEmployee.add(employee);
			}
			else if(typeOfProgrammer.equalsIgnoreCase("programmer")) {
				
				Employee employee = new EmployeeProgrammer(name, salary, id);
				listOfEmployee.add(employee);
			}
			
			System.out.println();
		}
		
		System.out.print("Enter the id to increase salary: ");
		int idToIncrease = sc.nextInt();
		
		
		System.out.println();
		
		verifyToIncreaseSalary(listOfEmployee, idToIncrease);
		
		System.out.println();
		
		showListOfEmployees(listOfEmployee);
		
		
		
		
		sc.close();
	}
	
	public static boolean hasId(List<Employee> list, Integer id) {
	
		Employee emp = list.stream().filter(obj -> obj.getId().equals(id)).findFirst().orElse(null);
		
		return emp != null;
	}
	
	public static void verifyToIncreaseSalary(List<Employee> list, Integer id) {
		
		Employee employee = null;
		
		for(Employee object: list) {
			
			if(object.getId().equals(id)) {
				employee = object;
			}
		}
		
		
		if(employee != null) {
			System.out.println("Successfull salary increase");
			employee.increaseSalary();
		}
		else {
			System.out.println("id not exist");
		}
		
	}
	
	public static void showListOfEmployees(List<Employee> list) {
		for(Employee employee: list) {
			System.out.println(employee.toString());
		}
	}

}
