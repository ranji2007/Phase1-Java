package com.maps;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> map=new Hashtable<Integer, String>();
		System.out.println("Before adding map"+" "+map.size());
		map.put(1, "hari");
		map.put(2, "gani");
		map.put(5, "karishna");
		map.put(8, "dell");
		//map.put(null,null);
		//map.put(null, "sai");
		//map.put(8, null);
		System.out.println("after adding map"+" "+map.size());
		System.out.println(map);
		map.put(new Integer(9), "For");
		System.out.println("get element "+map.get(5));
		map.remove(8);
		System.out.println("after removeing element from map"+" "+map);
		
		//iterate using for loop
		for(Map.Entry m :map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}
}
