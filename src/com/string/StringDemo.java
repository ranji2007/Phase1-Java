package com.string;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = new String("Hello Sai");
		
		System.out.println("length of string is"+" "+s1.length());
		char c = s1.charAt(3);
		System.out.println("character at index level 3 is"+" "+c);
		System.out.println("upper case:"+" "+s1.toUpperCase());
        System.out.println("Lower case: "+" "+s1.toLowerCase());		
		System.out.println("check String contains sai? "+" "+s1.contains("Sai"));
		System.out.println("Sub String "+s1.substring(3,8));
		String suffix ="s";
		System.out.println("string ending with i?"+" "+s1.endsWith(suffix));
		suffix ="i";
		System.out.println("string ending with i?"+" "+s1.endsWith(suffix));
		String result[]=s1.split(" ");
		for(String s:result)
		{
			System.out.println(s);
		}
		String s2 = new String("Hello sai");
		if(s1.equalsIgnoreCase(s2))
			System.out.println("validated");
		else
			System.out.println("Not Valid");
	}

}
