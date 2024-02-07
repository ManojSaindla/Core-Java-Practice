package com.example.pojojavabean;

public class Employee {

private int id;
public String name;
protected double salary;


	public Employee(int id) {
		this.id=id;
	}
	
	public Employee() {
		System.out.println("No arg constructor is called");	}

	public void setId(int id) {
		this.id=id;
	}	
	public int getId() {
		return id;
	}
}
