package com.collections;
import java.util.Queue;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		Queue<String> list = new PriorityQueue<String>();
		System.out.println("list Before adding queue"+" "+list.size());
		list.add("sai");
		list.add("reddy");
		//Priority queue doesn't allow null values
		//list.add(null);
		list.add("Bye");
		System.out.println("List after adding queue"+" "+list.size());
		System.out.println(list);
		list.add("welcome");
		list.add("Good");
		System.out.println("list after adding two elements in queue"+" "+list);
	    list.remove("Bye");
	    System.out.println("list after removeing elements in queue"+" "+list);
	    System.out.println("List contains Good?"+" "+list.contains("Good"));
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
