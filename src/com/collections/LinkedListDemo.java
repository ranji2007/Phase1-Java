package com.collections;
import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		System.out.println("list befors adding"+" "+list.size());
		list.add(10);
		list.add(20);
		list.add(null);
		list.add(200);
		System.out.println("list after adding"+" "+list.size());
		System.out.println(list);
		list.add(2,40);
		list.add(3,null);
		System.out.println("List after adding two elements"+" "+list);
		System.out.println("List contains 10?"+" "+list.contains(10));
		list.remove(3);
		System.out.println("list after removeing element"+" "+list);
		System.out.println("To get first element "+" "+list.getFirst());
		System.out.println("To get last element"+" "+list.getLast());
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(40);
		list1.add(null);
		list1.add(300);
		if(list.equals(list1))
		{
			System.out.println("List and List1 both are same");
		}
		else
		{
			System.out.println("list and list1 both are different");
		}
	//Clone
		 LinkedList<Integer> sec_list = new LinkedList<Integer>();
	     sec_list = (LinkedList<Integer>) list.clone();
	     System.out.println("using clone");
	     System.out.println(sec_list);
	     
	//Iterator
	     System.out.println("Using For each Loop Iterator");
	     for(Integer i : list)
	     {
	    	 System.out.println(i);
	     }
	  
	     System.out.println("iterate using iterator");
	     Iterator<Integer> itr = list.descendingIterator();
	     while(itr.hasNext())
	     {
	    	 System.out.println(itr.next());
	     }
	    	 
	}

}
