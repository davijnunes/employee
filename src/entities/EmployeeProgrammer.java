package entities;

public class EmployeeProgrammer extends Employee {
	
	public static final double taxRate = 0.3;
	
	public EmployeeProgrammer() {
	}
	
	public EmployeeProgrammer(String name, Double salary, Integer id) {
		
		super(name,salary,id);
	}
	
	@Override
	public void increaseSalary() {
		
		setSalary(getSalary() * taxRate + getSalary());
	}

}
