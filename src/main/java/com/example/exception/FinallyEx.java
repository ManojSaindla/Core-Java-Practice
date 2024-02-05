package com.example.exception;

public class FinallyEx {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			
			int[] arr = {1,2};
			
			System.out.println(arr[2]/0);
			
		}catch( Exception e1){
			System.out.println("Catch");
			System.exit(0); /*we can avoid finally block by using this(System.exit(0)), 
			Here the thread will destroy */
		}
		finally {
			System.out.println("Finally");
		}

}
}