package com.synchronization;

public class Sender {

	void send(String msg)
	{
		System.out.println("Sending message "+msg);
		try {
			Thread.sleep(1500);
			
		} catch (Exception e) {
			System.out.println("Error while sending a message");
		}
		System.out.println("Message Sent successfully");
	}
}
