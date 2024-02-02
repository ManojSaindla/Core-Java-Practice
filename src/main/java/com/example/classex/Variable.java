package com.example.classex;

public class Variable {
	
		int ID = 101; // non-static fields or instance variables
		 
		static int nid= 100; //static variable
		
		String name = "manoj"; //literal
		
		
	public static void main(String[] args) {
			int pincode = 500005; //local variable
			pincode = 500007; //the prior onw will be destroyed and new value is assigned
			
			Variable ve =new Variable();
			
			System.out.println(ve.ID);
			
			System.out.println(ve.name);
			
		//DataType VariableName = VaraibleValue 
			System.out.println(pincode);
			
			int pin; //defining
			pin= 8978;	// intialisation
			
			System.out.println(pin);
			
			mans();

	}
	public static void mans() {
		int t=9; 
		System.out.println(t); //local variable
		 String names= "manoj";
		 //variables names are case sensitive
		System.out.println(names);
		String NAMES = "SAINDLA";
		System.out.println(NAMES); 
	}

}
