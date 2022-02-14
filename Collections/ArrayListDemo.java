package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

		public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("After before arraylist is"+list.size());
			list.add(10);
			list.add(20);
			list.add(null);
			list.add(50);
			list.add(60);
			list.add(null);
		System.out.println("After adding arraylist"+list.size());
		System.out.println(list);
		System.out.println("element at index 3 is"+list.get(3));
		list.add(3,50);
		System.out.println("after adding new element in array list is"+list);
		list.remove(5);
		list.remove(2);
		System.out.println("after removeing arraylist is"+list);
		System.out.println("list conatains 10?"+list.contains(10));
		//Iterator using for loop
	  System.out.println("Using for each loop");
	   for(Integer I: list)
		{
			System.out.println(I);
		}
		
	   System.out.println("iterate using iterator");
		Iterator<Integer> itr=list.iterator();
    
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		}
		
	}
