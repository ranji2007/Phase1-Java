package com.array;
import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		int array[] = {12,15,61,30,67,40};
		System.out.println("Element at no 4 is"+" "+array[4]);
		
		System.out.println("length of an array is"+" "+array.length);
		
		System.out.println("using for loop");
		 for (int i=0;i<array.length;i++)
		 {
			 System.out.println(array[i]);
		 }
		 System.out.println();
		// another method using scanner 
		 // Taking elements from the user
		 int arr[]=new int[6];
		 System.out.println("Store elements in this array dynamically");
		 Scanner scan=new Scanner(System.in);
			
			for(int i=0;i<arr.length;i++)
			{
				System.out.println("Enter any number");
				arr[i]=scan.nextInt();
			}
			
			System.out.println("Let's print elements of array");
			for(int a:arr)
			{
				System.out.println(a);
			}
		
	}

}
