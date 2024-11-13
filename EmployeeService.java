package practic_W11;

import java.util.Scanner;

public class EmployeeService {
	Scanner scanner=new Scanner(System.in);


	public Employee[] createEmployees(int n) {
		Employee[] employees=new Employee[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("\nEmloyees :" +(i+1));
		
		employees[i]=createEmployee();
		}

		return employees;
	}
	
	public Employee createEmployee() {
		Employee employee=new Employee();
		employee.setName( inputData("Name"));
		employee.setSalary(Double.parseDouble(inputData("Salary: ")) );
		inputDataGender(employee);
		inputDataTypeOfEmployee(employee);
		return employee;
	}
	
	public String inputData(String name) {
		System.out.print("Please input the "+ name+": ");
		return scanner.next();
	}
	public void inputDataGender(Employee employee) {
		String gender;
		gender=this.inputData("Gender (m/f)").toLowerCase();
		if(gender.equals("m") || gender.equals("male"))
			employee.setGender(Gender.MALE);
		
		else if(gender.equals("f") || gender.equals("female"))
			employee.setGender(Gender.FEMALE);
		else {System.out.println("GGGGGGGGGGGGGGGGGGGG");
			
		}
	}
	
	public void inputDataTypeOfEmployee(Employee employee) {
		int employeetype;
		System.out.println("1/ Fulltime \n 2/ Patetime \n 3/ Intership");
		employeetype=Integer.parseInt(this.inputData("EmployeeType"));
		switch (employeetype) {
		 case 1:{
			employee.setEmployeeType(EmployeeType.FULL_TIME);break;
		}case 2:{
			employee.setEmployeeType(EmployeeType.PART_TIME);break;
		}case 3:{
			employee.setEmployeeType(EmployeeType.INTERNSHIP);break;
		}
		default:{
			System.out.println("EEEEEEEEEEEETTTTTTTTTTTTT");
			break;
		}
		
		}
	}
	
//	public Employee createEmployee() {
//
//		String gender;
//		int employeetype;
//		
//		System.out.print("Please input the Name: ");
//		employee.setName(scanner.next());
//		
//		System.out.print("Please input the Gender: ");
//		gender=scanner.next();
//		gender.toLowerCase();
//		if(gender.equals("m") || gender.equals("male"))
//			employee.setGender(Gender.MALE);
//		
//		else if(gender.equals("f") || gender.equals("female"))
//			employee.setGender(Gender.FEMALE);
//		else {System.out.println("GGGGGGGGGGGGGGGGGGGG");
//			
//		}
//
//		
//		System.out.print("Please input the Salary: ");
//		employee.setSalary(scanner.nextInt());
//		
//	
//		System.out.println("1/ Fulltime \n 2/ Patetime \n 3/ Intership");
//		System.out.print("Please input the EmployeeType: ");
//		employeetype=scanner.nextInt();
//		//employee.setName(scanner.next());
//		switch (employeetype) {
//		case 1:{
//			employee.setEmployeeType(EmployeeType.FULL_TIME);break;
//		}case 2:{
//			employee.setEmployeeType(EmployeeType.FULL_TIME);break;
//		}case 3:{
//			employee.setEmployeeType(EmployeeType.FULL_TIME);break;
//		}
//		default:{
//			System.out.println("EEEEEEEEEEEETTTTTTTTTTTTT");
//			break;
//		}
//		
//		}
//		
//		return employee;
//	}
	
	public double calculateBonus(Employee employess) {
		double bonus=0;
		
		switch(employess.getEmployeeType()) {
		case FULL_TIME : {
			bonus=employess.getSalary()*0.05;
			break;
		}
		case PART_TIME:bonus=employess.getSalary()*0.03;break;
		case INTERNSHIP:bonus=employess.getSalary()*0.02;
		}
		
		return bonus;
	}
	
	public double TotalPaymentOfEmployee(Employee employee) {
		double payment=calculateBonus(employee)+employee.getSalary();
		
		return payment;
	}
	
	public double TotalPaymentAllOfEmployee(Employee[] employees) {
		double allofSalary=0;
		for (Employee n:employees)
			allofSalary+=n.getSalary();
			
		
		return allofSalary;
	}
	
	public static int countEmployeeByGender(Employee[] employees,Gender gender) {
		int count=0;
		for(Employee e:employees) {
			if(e.getGender().equals(gender)) {
				count++;
			}
		}
		return count;
	}
	

}
