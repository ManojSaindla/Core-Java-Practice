package com.example.multithreading;

public class Threadtester {

	public static void main(String[] args) {
		
		System.out.println("thread is starting ");
//		Thread thread1 = new Thread1("thread1 ");
//		thread1.start();
		
		Thread thread2 = new Thread(new Thread2(), "thread2");
		thread2.start();
		
//		thread1.setDaemon(true);
		
		
		
		System.out.println("main is exiting");

	}

}


// https://www.youtube.com/watch?v=WldMTtUWqTg