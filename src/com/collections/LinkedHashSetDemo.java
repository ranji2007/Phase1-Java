package com.collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		System.out.println("Beforeing adding set"+" "+set.size());
		set.add("apple");
		set.add("banana");
		set.add(null);
		set.add("banana");
		set.add("cherry");
		set.add("almond");
		
		System.out.println("after adding set: "+set.size());
		System.out.println(set);
		set.add("mango");
		set.add(null);//null contains only one time
		System.out.println("after adding elements in set"+" "+set);
		System.out.println("Contains "+set.contains("cherry"));
		
		set.remove(null);
		System.out.println("after removeing null in set"+" "+set);
		//for each loop
		       System.out.println("iterator using for each loop");
				for(String s:set)
				{
					System.out.println(s);
				}
				
				System.out.println("iterate using iterator");
				Iterator<String> itr=set.iterator();
				
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
  }
}
