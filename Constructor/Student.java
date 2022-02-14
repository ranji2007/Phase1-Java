package com.constructor;

public class Student {
	int rollno;
	String fname;
	String lname;
	float fee;

//Default Constructor
	
	public Student(){
		
		System.out.println("this is default constructor");
	}

//parameterized constructor
	
	public Student(int rollno, String fname, String lname, float fee) {
		this.rollno = rollno;
		this.fname = fname;
		this.lname = lname;
		this.fee = fee;
	}
	public void display() {
		System.out.println("rollno is "+" "+rollno);
		System.out.println("First name is"+" "+fname);
		System.out.println("Last name is"+" "+lname);
		System.out.println("student fee is"+" "+fee);
	}
	public static void main(String[] args) {
		Student s = new Student();
		Student s1 = new Student(10,"Sridher", "babu",20000);
		s.display();
		s1.display();
	}
	

}
