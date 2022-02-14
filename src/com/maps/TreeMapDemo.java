package com.maps;
import java.util.TreeMap;
import java.util.Map;
public class TreeMapDemo {
	 public static void main(String[] args)
	    {
	       TreeMap<String, Integer> map = new TreeMap<>();
	        System.out.println("Before adding map"+" "+map.size());
	        map.put("vishal", 10);
	        map.put("sachin", 30);
	        map.put("vaibhav", 20);
	        map.put("babu", null);
	        //No Null keys are allowed.only null values allowed
	        //map.put(null, 40);
	        System.out.println("After adding map"+" "+map.size());
	        System.out.println(map);
	        map.put("reddy", 6);
	        System.out.println("after adding one element in map"+" "+map);
	        map.remove("vishal");
			map.remove("reddy", 6);
			System.out.println("After removeing elements in map"+" "+map);
			System.out.println("get element "+" "+map.get("ram"));
	        
	 
	        // Iterating using for each loop
	        for(Map.Entry m :map.entrySet())
			{
				System.out.println(m.getKey()+" "+m.getValue());
			}
	    }

}
