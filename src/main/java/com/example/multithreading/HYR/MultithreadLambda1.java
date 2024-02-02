package com.example.multithreading.HYR;

public class MultithreadLambda1 {

	public static void main(String[] args) {

	Runnable r1 = () -> {
		for(int i=0; i<10;i++) {
		System.out.println(" Hello " + Thread.currentThread().getName() +" -->> " +  Thread.currentThread().getId());	;
		}
		};

	Runnable r2 = () -> {
		for(int i=0; i<20;i++) {
		System.out.println(" Hi    " + Thread.currentThread().getName() +" -->> " +  Thread.currentThread().getId());;
	}
	};
	
	Thread t1 = new Thread(r1 , " T1");
	Thread t2 = new Thread(r2 , " T2");
	
	t1.start();
	t2.start();
	
//	System.out.println(Thread.activeCount());
	}
		
			

}
