package com.statistics;

public class Main {

	public static void main(String[] args) {
		
		KthSmallest ob = new KthSmallest(); 
		
        int arr[] = {3, 57, 4, 19, 26,12}; 
        
        int left=0;//first index
        
        int n = arr.length;
        
        int right= n-1; //last index
        int k = 3; 
        
        System.out.println("K'th smallest element is "+ ob.kthSmallest(arr, left, right, k)); 
    }

}
