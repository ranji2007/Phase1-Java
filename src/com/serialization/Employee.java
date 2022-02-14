package com.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
		private int id;
		private String name;
		private transient String email;//don't serialize this value
		
		public Employee(int id,String name, String email)
		{
			this.id=id;
			this.name=name;
			this.email=email;

		}
		
		public void display()
		{
			System.out.println(id+" "+name+" "+email);
		}
		
		public static void main(String[] args) {
			
			Employee e1= new Employee(1, "test", "test@123.com");
			e1.display();
		}

}
