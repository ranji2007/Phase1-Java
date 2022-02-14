package com.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexDemo {
	public static void main(String[] args) {
		String regex = "[a-z]+";
		String input = "sai";
		Pattern pattern = Pattern.compile(regex);
		
		Matcher match = pattern.matcher(input);
		if(match.matches())
		{
			System.out.println("Pattern Matched");
		}
		else
		{
			System.out.println("Pattern Unmatched");
		}
		//Mobile Number Pattern
		String regex1 = "[987]{3}[0-9]{7}";
		String input1 = "7784527817";
        Pattern pattern1 = Pattern.compile(regex1);
		
		Matcher match1 = pattern1.matcher(input1);
		if(match1.matches())
		{
			System.out.println("Number Pattern Matched");
		}
		else
		{
			System.out.println("Number Pattern Not Matched");
		}
	}

}
