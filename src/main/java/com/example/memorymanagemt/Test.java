package com.example.memorymanagemt;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new Test().add(1);	
		
		int size = 10;
		for (int i=0;i<Integer.MAX_VALUE;i++) {
			int arr[] =new int[size];
			size *=10;
			System.out.println(size);
		}
		
		//1410065408
		//1000000000
	}
public void add(int i) {
	
	System.out.println(i);
	i++;
	add(i);
	/*if we got StackOverflowError we need to increase the size of the stack memory ,
	 * Intial size of Stack Memory is 1MB
	 * we can run through Run Configurations-->arguments-->Vm arguments -->  -Xss2m = 2 MB
	 */
	
}
}
