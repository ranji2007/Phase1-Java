package com.array;

import java.util.Scanner;

public class MultiDimentionalArrayDemo {
	
	public static void main(String[] args) {
		
		int array[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("Access first row 1 element"+" "+array[0][1]);
		
		System.out.println("Access second row 2 element"+" "+array[1][2]);
		
		System.out.println("Access third row 1 element"+" "+array[1][2]);
		for(int row=0;row<3;row++)
		{
			for(int col=0;col<3;col++)
			{
				System.out.print(array[row][col]+"\t");
			}
			
			System.out.println();
		}
	    //Another method using scanner
        int arr[][]= new int[4][4];
        System.out.println("Store element in the matrix");
		Scanner sc=new Scanner(System.in);
		for(int row=0;row<4;row++)
		{
			for(int col=0;col<4;col++)
			{	
				System.out.println("Enter Any number");
				arr[row][col]= sc.nextInt();
			}
		}
		System.out.println("Print matrix");
		for(int row=0;row<4;row++)
		{
			for(int col=0;col<4;col++)
			{
				System.out.print(arr[row][col]+"\t");
			}
			
			System.out.println();
		}
		
	}
	
}
