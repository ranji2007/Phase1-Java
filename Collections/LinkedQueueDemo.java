package com.collections;
import java.util.Queue;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedQueueDemo {
	public static void main(String[] args) {
		Queue<String> list = new LinkedList<String>();
		System.out.println("beforeing adding list"+" "+list.size());
		list.add("ram");
		list.add("main");
		list.add(null);
		System.out.println("after adding list"+" "+list.size());
		System.out.println(list);
		list.add("babu");
		list.add(null);
		System.out.println("list after adding two elements"+" "+list);
		list.remove(null);
		list.remove("main");
		System.out.println("list after removeing elements"+" "+list);
		System.out.println("List contains babu?"+" "+list.contains("babu"));
		 System.out.println("list element"+" "+list.element());
		    //Iterator
			//Iterator using for loop
			  System.out.println("Using for each loop");
			   for(String s: list)
				{
					System.out.println(s);
				}
				
			   System.out.println("iterate using iterator");
				Iterator<String> itr=list.iterator();
		    
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
	}

}
