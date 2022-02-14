package com.collections;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		System.out.println("before adding set"+" "+set.size());
		set.add(9);
		set.add(77);
		set.add(5);
		//set.add(null);//Null not allowed
		System.out.println("after adding set"+" "+set.size());
		System.out.println(set);
		set.add(6);
		System.out.println("set after adding element"+" "+set);
		set.remove(6);
		System.out.println("after removeing one element from set"+" "+set);
	    System.out.println("set contains 77?"+" "+set.contains(77));
	    TreeSet<Integer> set1 = new TreeSet<Integer>();
	    set1.add(77);
	    set1.add(5);
	    set1.add(9);
	    System.out.println("set1 contains"+" "+set1);
	    // checking both sets are same or different
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
