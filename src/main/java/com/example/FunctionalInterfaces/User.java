package com.example.FunctionalInterfaces;

public class User {

	public static void main(String[] args) {
		
		Car c = new Car()
		//anonymous class 		
		{
			public void drive() {
				System.out.println(" Drive is called ");
			}
				};
c.drive();
	}

}
