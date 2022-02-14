package com.string;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("hello good afternoon");
		
		System.out.println("length of string is"+" "+s1.length());
		char c = s1.charAt(13);
		System.out.println("character at index level 13 is"+" "+c);
		s1.append("Welcome");
		System.out.println(s1);
		s1.insert(10, " ");
		System.out.println("inserting space at 10th index"+" "+s1);
		s1.replace(11, 15, "Hi");
		System.out.println(s1);
		System.out.println("sub string is"+" "+s1.substring(8, 15));
		
		s1.reverse();
		System.out.println(s1);
	}

}
