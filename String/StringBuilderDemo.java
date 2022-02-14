package com.string;

public class StringBuilderDemo {
	public static void main(String[] args) {
		
		StringBuilder s1 = new StringBuilder("Good Evening");
		System.out.println("length of string is"+" "+s1.length());
		char c = s1.charAt(5);
		System.out.println("character at index level 5 is"+" "+c);
		s1.append("Hi");
		System.out.println("after appending string"+" "+s1);
		s1.insert(8, " ");
		System.out.println("inserting space at 8th index"+" "+s1);
		s1.replace(13, 15, "hello");
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		
		System.out.println("sub string is"+" "+s1.substring(6, 10));
		
		s1.reverse();
		System.out.println(s1);
	}

}
