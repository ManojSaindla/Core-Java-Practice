package com.example.InterfacesEx;

public class User {

	public static void main(String[] args) {
		
		Apple ap = new Apple();
		ap.copy();
		ap.paste();
		ap.cut();
		ap.keyboard();
		ap.print();
		
		Lenova lv = new Lenova();
		lv.copy();
		lv.cut();
		lv.print();
		
		
		Laptop.type();
		
	}

}
