package com.example.Abstracts;

public abstract class SampleAC implements Laptop {

	
	public void cut() {
		
		System.out.println("It is cutting ");
		
	}

	
	public void paste() {
		
		System.out.println("It is pasting ");
	}

	
	public abstract void add();

}
