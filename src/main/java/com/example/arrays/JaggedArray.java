package com.example.arrays;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[3][];
		
		a[0]=new int[2];
		a[1]=new int[5];
		a[2]=new int[3];
	
	//It is a jagged array where no of columns will be different.
	
		a[0][0]=1;
		a[0][1]=2;
		
		a[1][0]=3;
		a[1][1]=4;
		a[1][2]=5;
		a[1][3]=6;
		a[1][4]=7;
		
		a[2][0]=8;
		a[2][1]=9;
		a[2][2]=1;
		
	for(int i =0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++) {
				
				System.out.print(a[i][j] + "  ");
			}
			
			System.out.println();
		}
		

		System.out.println( );
		
		
		int b[][]= {{1,2},{1,2,3,4,5,6},{5,9}};
		
		
for(int i =0;i<b.length;i++) {
			
			for(int j=0;j<b[i].length;j++) {
				
				System.out.print(b[i][j] + "  ");
			}
			
			System.out.println();
		}
		
		
	
		
	}

}
