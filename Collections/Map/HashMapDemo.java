package com.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		System.out.println("Before adding map"+" "+map.size());
		map.put("sai", 1);
		map.put("ram", 7);
		map.put("krishna", null);
		map.put(null, null);
		map.put("reddy", 6);
		System.out.println("after adding map"+" "+map.size());
		System.out.println(map);
		map.remove("sai");
		map.remove("reddy", 6);
		System.out.println("After removeing elements in map"+" "+map);
		System.out.println("get element "+" "+map.get("ram"));
		
		//iterate using for loop
		
		for(Map.Entry m :map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
