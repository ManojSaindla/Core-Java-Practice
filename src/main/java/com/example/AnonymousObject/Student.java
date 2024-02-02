package com.example.AnonymousObject;

public class Student {

	String s1= " Manoj";
	void greet() {
	System.out.println(" he is greeting" +s1);
}
	
	void attend() {
		System.out.println(" he is attended" +s1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1= new Student();
		s1.attend();
	
		//anonymous object	
	new Student().greet();
		
	}

}
