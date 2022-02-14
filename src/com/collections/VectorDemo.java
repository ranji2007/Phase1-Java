package com.collections;
import java.util.Vector;
import java.util.Iterator;

public class VectorDemo {
	public static void main(String[] args) {
		
		Vector<Integer> list = new Vector<Integer>();
		System.out.println("List before adding"+" "+list.size());
		
		list.add(10);
		list.add(20);
		list.add(null);
		list.add(200);
		System.out.println("List after adding"+" "+list.size());
		System.out.println(list);
		list.add(2,40);
		list.add(3,null);
		System.out.println("List after adding two elements"+" "+list);
		System.out.println("List contains 20?"+" "+list.contains(20));
		list.remove(3);
		list.remove(0);
		System.out.println("list after removeing element"+" "+list);
		System.out.println("To get first element "+" "+list.firstElement());
		System.out.println("To get last element"+" "+list.lastElement());
		System.out.println("Element at 3rd index is"+" "+list.get(3));
		System.out.println("THe capacity of list is"+" "+list.capacity());
		System.out.println("THe element 1 at list is"+" "+list.elementAt(1));
		//Iterator
	     System.out.println("Using For each Loop");
	     for(Integer i : list)
	     {
	    	 System.out.println(i);
	     }
	  
	     System.out.println("iterate using iterator");
	     Iterator<Integer> itr = list.listIterator();
	     while(itr.hasNext())
	     {
	    	 System.out.println(itr.next());
	     }
	    	 
	}
	}
