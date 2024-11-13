package practic_W11;

import java.util.Scanner;

public class EmployeeApplication {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=0;
		
		EmployeeService employeeService=new EmployeeService();
		
//		Employee e=new Employee("kdaerakvak", Gender.FEMALE, 400, EmployeeType.FULL_TIME);
//		Employee e2=new Employee("dfsfsa", Gender.FEMALE, 400, EmployeeType.INTERNSHIP);
//		Employee e3=new Employee("kdaerakvak", Gender.MALE, 400, EmployeeType.FULL_TIME);
//		Employee e4=new Employee("kdaerakvak", Gender.FEMALE, 400, EmployeeType.PART_TIME);
		System.out.print("how many information of staff, Do you want to input: ");
		n=scanner.nextInt();
		
		
		Employee[] employees=new Employee[n+1];
		
		
		employees=employeeService.createEmployees(n);
		
		
		System.out.println("=========================");
//		for(int i=0;i<n;i++)
//			  System.out.println(employees[i]);
		
		for (Employee employee : employees) {
		    System.out.println(employee);
		}
		
		
//		for (Employee n:employees) {
//			System.out.println(n.toString());
//		}
//		
		int CountFemale= EmployeeService.countEmployeeByGender(employees,Gender.FEMALE);
		int CountMale= EmployeeService.countEmployeeByGender(employees,Gender.MALE);
		System.out.println("====================================");
		
		System.out.println("Female total is:"+CountFemale);
		System.out.println("Male total is:"+CountMale);
		
		System.out.println("====================================");
		System.out.println("Bonus of employee");
	
		for (Employee nn:employees) {
			System.out.println(nn.getName()+": "+ employeeService.calculateBonus(nn));
		}
		System.out.println("====================================");
		System.out.println("Salary of employee");
		for(Employee nn:employees) {
			System.out.println(nn.getName()+": " +employeeService.TotalPaymentOfEmployee(nn));
		}
//		
//		System.out.println("Total All of Employees: "+employeeService.TotalPaymentAllOfEmployee(employees));
		
//		for(int i=0;i<employees.length;i++) {
//			System.out.println(employeeService.calculateBonus(i)+employees[i].getSalary());
//		}
		 
	}

}
