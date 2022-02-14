package com.synchronization;

public class TestMessage {
public static void main(String[] args) {
		
		//common object shared between 2 threads
		Sender sender=new Sender();
		
		User t1= new User("Sairam", "Hi,how is your training going on ", sender);
		
		User t2= new User("Babu", "Everything is ggood", sender);
		
		t1.start();
		t2.start();
	}

}
