package com.example.pojojavabean;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e= new Employee();
		e.setId(12);
		e.name= "MAnoj";
		e.salary=12344.44;
		
		System.out.println(e.getId());
		System.out.println(e.name);
		System.out.println(e.salary);
		
		Employee e1= new Employee();
		e1.setId(13);
		e1.name= "Dinesh";
		e1.salary=33445.44;
		
		Employee e2= new Employee();
		e2.setId(14);
		e2.name= "Saindla";
		e2.salary=8765.44;
		
		
	}

}
