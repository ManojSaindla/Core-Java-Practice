package com.example.multithreading.HYR;

public class TestRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Employee1 e1 = new Employee1();
		Thread t1= new Thread(e1, "T1");
		t1.start();
		
		
		Manager1 m1 = new Manager1();
		Thread t2= new Thread(m1 , "T2");
		t2.start();
		
		System.out.println(Thread.activeCount());
	}

}


class Employee1 implements Runnable{
	
	
	@Override
	public void run() {
		
		System.out.println("Hello RR " + Thread.currentThread().getId() + " >> " + Thread.currentThread().getName());
	
	}
		
}

class Manager1 implements Runnable{
	
	
	@Override
	public void run() {
		
		System.out.println("Hello Manager " + Thread.currentThread().getId() + " >> " + Thread.currentThread().getName());
	
	}


	}


