package com.example.multithreading.HYR;

public class MultithreadMethods {

	public static void main(String[] args) throws InterruptedException {

		Runnable r1 = () -> {
			for(int i=0; i<10;i++) {
//			System.out.println(" Hello " + Thread.currentThread().getName() +" -->> " +  Thread.currentThread().getId());	;
			}
			};

		Runnable r2 = () -> {
			for(int i=0; i<20;i++) {
//			System.out.println(" Hi    " + Thread.currentThread().getName() +" -->> " +  Thread.currentThread().getId());;
		}
		};
		
		Thread t1 = new Thread(r1 , " T1");
		Thread t2 = new Thread(r2 , " T2");
		
		System.out.println(t1.getState());
		
		t1.start();
		System.out.println(t1.getState());
		
//		t1.join();  //It is used to execute one by one thread
		t1.sleep(10000); // we can stop t1 thread for 10 secs 
		t2.start();
		System.out.println(t1.getState());
		
//		System.out.println(Thread.activeCount());
		}
						

}
