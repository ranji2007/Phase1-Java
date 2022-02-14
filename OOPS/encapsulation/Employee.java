package com.encapsulation;

public class Employee {
	private int id;
	private String name;
	private String email;
	
	public int getId() {
		return id;
	}
	//get always return a value of same type of that variable
	//set method always a void type with one parameter
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(666);
		e.setName("sairam");
		e.setEmail("sai@gmail.com");
		System.out.println("Employee Id is"+" "+e.getId());
		System.out.println("Employee name is"+" "+e.getName());
		System.out.println("Employee email is"+" "+e.getEmail());

	}

}
