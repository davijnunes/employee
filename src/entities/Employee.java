package entities;

public abstract class Employee {
	
	private String name;
	
	private Double salary;
	
	private Integer id;
	
	public Employee() {
	}
	
	public Employee(String name, Double salary, Integer id) {
		
		this.name = name;
		
		this.salary = salary;
		
		this.id = id;
		
	}
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public Double getSalary() {
		
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public Integer getId() {
		
		return id;
	}
	
	public void setId(Integer id) {
		
		this.id = id;
	}
	
	public abstract void  increaseSalary();
	
	@Override
	public String toString() {
		return "Id: " + id
				+ ", name: "
				+ name
				+ ", salary: $ " 
				+ String.format("%.2f", getSalary());
	}
	

}
