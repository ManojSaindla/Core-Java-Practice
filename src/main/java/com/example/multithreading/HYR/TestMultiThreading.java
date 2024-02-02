package com.example.multithreading.HYR;

public class TestMultiThreading {

	public static void main(String[] args) {

//		System.out.println("Welcome to manoj world");
//		System.out.println( Thread.currentThread().getName());
//		System.out.println( Thread.currentThread().getId());
//		System.out.println( Thread.currentThread().getPriority());
//		
//		System.out.println(Thread.activeCount());
		
		
		Employee e1= new Employee("T1");
		e1.start();
		
		Manager m1 = new Manager("T2");
		m1.start();
		
		
		System.out.println(Thread.activeCount());
	}

}


class Employee extends Thread{
	
	public Employee(String Tname) {
		super(Tname);
	}
	
	@Override
	public void run() {
		
		System.out.println("Hello RR " + Thread.currentThread().getId() + " >> " + Thread.currentThread().getName());
	
	}
		
}

class Manager extends Thread{
	
	public Manager(String Tname) {
		super(Tname);
	}
	@Override
	public void run() {
		
		System.out.println("Hello Manager " + Thread.currentThread().getId() + " >> " + Thread.currentThread().getName());
	
	}
}
