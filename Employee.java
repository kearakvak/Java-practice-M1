package practic_W11;

public class Employee {
	private static int nextId = 1;
	private int id=0;
	private String name;
	private Gender gender;
	private double salary;
	private EmployeeType employeeType;
	

    public Employee() {
        this.id = nextId++;  // Assign the current nextId and then increment it for the next employee
    }
    public Employee(int id,String name, Gender gender, double salary,EmployeeType employeeType) {
    	this.id=id;
    	this.name=name;
    	this.gender=gender;
    	this.salary=salary;
    	this.employeeType=employeeType;
    }

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + ", employeeType="
				+ employeeType + "]";
	}



	public int getID() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public Gender getGender(){
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender=gender;
	}
	public double getSalary() {
		return salary;		
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public EmployeeType getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType=employeeType;
	}
	
	
}
