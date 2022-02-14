package com.multithreading;

public class SleepWaitDemo {
	private static Object lock = new Object();
	public static void main(String[] args) {
		try {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName());
			synchronized(lock)
			{
				lock.wait(3000);
				System.out.println("object is woke up after wait for 3 seconds");
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

}
