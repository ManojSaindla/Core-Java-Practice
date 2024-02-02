package com.example.memorymanagemt;

public class Employee {

	int orgId= 8789;
	String OrgName="Manoj Tutorial";
	String ceo= "Manoj";
	int noOfDepts = 3;
	static double networth= 500.00;
	
	public static void main(String[] args) {

		int eid = 101;
		String empName = "RR";
		double salary = 5000;
		
		Employee e1 = new Employee();
		e1.getorgId();
		
		System.out.println(Employee.getnetworth());
		
		Employee e2 = new Employee();
		e2.deleteEemployee();
		
		
		
	}
	
	public int getorgId() {
		return orgId;
	}

	public static double getnetworth() {
	return networth;
}
	
	public void deleteEemployee() {
		//delete employee
	}
	
	
}
