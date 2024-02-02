package com.example.InterfacesEx;

public interface Laptop {
	
	public void copy();
	
	public void paste();
	
	public void cut();
	
	public void keyboard();
	
	default void print() {
		Commoncode();
		System.out.println("Laptop is printing");
	}

	static void type() {
		Commoncode();
		System.out.println(" Laptop is typing ");
	}
	
	static private void Commoncode() {
		
		System.out.println(" Commoncode ");

	}
}
