package entities;

public class EmployeeManager extends Employee {
	
	private static final double taxRate = 0.2;
	
	
	public EmployeeManager() {	
	}
	
	public EmployeeManager(String name, Double salary, Integer id) {
		super(name,salary,id);
	}
	
	@Override
	public void increaseSalary() {
		setSalary(getSalary() * taxRate + getSalary());
	}

}
