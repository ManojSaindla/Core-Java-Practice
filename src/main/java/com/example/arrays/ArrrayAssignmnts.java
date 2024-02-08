package com.example.arrays;

import java.util.Scanner;

import org.hibernate.internal.build.AllowSysOut;

public class ArrrayAssignmnts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the no.of rows");
	int m=sc.nextInt();
	System.out.println("Enter the no.of columns");
	int n=sc.nextInt();
	
	int a[][]=new int [m][n];
	int b[][]=new int [m][n];
	
	
	System.out.println("Enter the A Elemtns");
	
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println("Enter the B Elemtns");
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
			b[i][j]=sc.nextInt();
			
		}
	}
	
	System.out.println("Printing the A elements ");

	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
			System.out.print(a[i][j]+ "  ");	
		}
		System.out.println();
	}
	
	System.out.println("Printing the B elements ");

	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
			System.out.print(b[i][j]+ "  ");	
		}
		System.out.println();
	}
	
	System.out.println("Print the common elements ");
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
	if(a[i][j]==b[i][j]) {
		
		System.out.print(b[i][j]+ "  ");	
	}
	System.out.println();
}

	
	}
	
	}
	
	
	}
	
	


