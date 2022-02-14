package com.arrayrotation;

public class Main {
      public static void main(String[] args) {
		
    	  ArrayRotation r = new ArrayRotation();
		
		int arr[] = { 1, 2, 3, 4, 5, 6, 7,8,9 };
		
		r.rotate(arr, 14);
		
		//printing an array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
