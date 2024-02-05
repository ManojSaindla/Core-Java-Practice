package com.example.exception;

public class CustomException {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		try {
			System.out.println(1/0);
		} catch (ArithmeticException ae) {
			// TODO Auto-generated catch block
//			throw new ArithmeticException(" Hey Stupid ! Java will not compile ");
			
			/* 
			 * for creating login exception we are taking the example
			 */
			
			throw new LoginException(" Login is failed please check the credentials ");
		}




}

}