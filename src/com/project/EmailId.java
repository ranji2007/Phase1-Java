package com.project;
import java.util.Scanner;
public class EmailId {
	public static void main(String[] args) {
        String s1[]={"babu@gmail.com","ram22@gmail.com","sai44@gmail.com","abc@yahoo.com"};
        boolean found = false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter mail id");
        String s = sc.nextLine();
        for(int i=0;i<s1.length;i++){
        	if(s1[i].equalsIgnoreCase(s))
        	{
        		found = true;
        		break;
        	}        	
        	
         }
        if(found)
        	System.out.println("Authenticated");
        	else
        	System.out.println("Invalid User");
        
 	}
}

