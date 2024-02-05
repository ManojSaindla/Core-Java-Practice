package com.example.classex;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("what is your name");
		String name= sc.nextLine();
		
		System.out.printf("Hey  %s , How are you ? \n" ,name);
		
		String status =sc.nextLine();
		
		System.out.println("What's your age ? ");
		
		int age= sc.nextInt();
		System.out.println("Thanks for the info");
		
		sc.close();
	}

}
