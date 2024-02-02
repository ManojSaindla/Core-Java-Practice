package com.example.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Program1 {

	public static void main(String[] args) throws FileNotFoundException {
System.out.println("the prgram execution starts");

//File file= new File("D:/resume.docx");
//FileInputStream fis = new FileInputStream(file);

//System.out.println(fis);

	int fnumber= 9;
	int snumber= 0;
	int res=0;
	
	try { 		//try is mandatory
	res = fnumber/snumber ;
	}
	catch(ArithmeticException ae) {  //catch block is optional when finally is present. 
	//	System.out.println(ae.toString());
	ae.printStackTrace(); //stacktrace is used to print the exception log in the console
		throw ae; //now we are sending the exception to java ,,it will handle and it will terminate the program
	}
	
	finally {  	//finally is optional
		System.out.println("finally block");
	}
	System.out.println("The result is " +res);
	
	System.out.println("the prgram execution ends");

	}

}
