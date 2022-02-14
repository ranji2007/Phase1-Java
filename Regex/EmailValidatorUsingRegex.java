package com.regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailValidatorUsingRegex {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);  
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);    
        System.out.println("Enter text:");  
        Matcher matcher = pattern.matcher(sc.nextLine());    
        if(matcher.matches())
		{
			System.out.println("Match Found");  
		}
		else
		{
			System.out.println("Match Not Found");
		}
    
    }    
}    
