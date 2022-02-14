package com.multithreading;

public class MainThreadDemo implements Runnable {
public static int count=0;
	
	public void run()
	{
		while(MainThreadDemo.count<=10)
		{
			try {
				
				System.out.println("My Thread "+ (++MainThreadDemo.count));
				Thread.sleep(1000);
				
			} catch (Exception e) {
				System.out.println("Error Occured "+e);
			}
		}
	}
	
	public static void main(String[] args) {
		MainThreadDemo  ins=new MainThreadDemo();
		Thread mythread=new Thread(ins);
		mythread.start();
		
		while(MainThreadDemo.count<=10)
		{
			try {
				
				System.out.println("Main Thread "+ (++MainThreadDemo.count));
				Thread.sleep(1000);
				
			} catch (Exception e) {
				System.out.println("Error Occured "+e);
			}
		}
		
		System.out.println("Main thread completed");
	}

}
