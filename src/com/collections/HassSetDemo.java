package com.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HassSetDemo {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		System.out.println("before adding set"+" "+set.size());
		set.add(10);
		set.add(66);
		set.add(4);
		set.add(null);
		System.out.println("after adding set"+" "+set.size());
		System.out.println(set);
		set.add(6);
		set.add(null);//null allowed only once
		System.out.println("set after adding two elements"+" "+set);
		set.remove(6);
		System.out.println("after removeing one element from set"+" "+set);
	    System.out.println("set contains 66?"+" "+set.contains(66));
	    HashSet<Integer> set1 = new HashSet<Integer>();
	    set1.add(null);
	    set1.add(66);
	    set1.add(4);
	    set1.add(10);
	    System.out.println("set1 contains"+" "+set1);
	    // checking both lists are same or different
	    if(set.equals(set1))
		{
			System.out.println("set and set1 both are same");
		}
		else
		{
			System.out.println("set and set1 both are different");
		}
	    //Iterator
	    System.out.println("Using for each loop");
		   for(Integer i: set)
			{
				System.out.println(i);
			}
			
		   System.out.println("iterate using iterator");
			Iterator<Integer> it=set1.iterator();
	    
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
	    
	}

}
