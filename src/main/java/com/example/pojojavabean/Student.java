package com.example.pojojavabean;

import java.io.Serializable;

/* where we wil have 2 layers one is application code and another is DB layer ,,
 * We need to send the application data (Obj) to DB then we need to send through Streams ,
 *  so we need to implement the Serializle interface 
 * If we want to get data from DB to Appplicatn code then we can De-serialize it.
 * So we need to use Java Bean over POJO class.
 */

public class Student implements Serializable{
	
	private int id;
	private String name;
	private double marks;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	
	
	public Student() {
		
	}
	public Student(int id,String name) {
		
	}

}
