package com.example.FunctionalInterfaces;

//we can have n number of methods other than abstract methods i.e with private , public , default 

//FI should not be more than one Abstract method

@FunctionalInterface
public interface FunctionalInterfaceEx {
	
	
	public void read();	
	public static void play() {

		System.out.println("he is playing");
	}
	default void walk() {
		
		System.out.println("he is walking");
	}

	private void breaks() {
		
		System.out.println("he is breaking");
	}
	}


