package com.searching;

public class BinarySearch {

    public static  void main(String[] args){
    	
        int[] arr = {13,16,93,21,5,66};
        int key = 66;
        int arrlength = arr.length;
        binarySearch(arr,0,key,arrlength);
    }

   public static void binarySearch(int[] arr, int lb, int key, int ub){

        int midValue = (lb+ub)/2;
        while(lb<=ub){

            if(arr[midValue]<key){

                lb = midValue + 1;
            } else if(arr[midValue]==key){
                System.out.println("Element is found at index :"+midValue);
                break;
            }
            else {

                ub=midValue-1;
            }
            midValue = (lb+ub)/2;
        }
            if(lb>ub){

                System.out.println("Element is not found");
            }

}

}
