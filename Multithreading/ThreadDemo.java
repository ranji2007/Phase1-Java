package com.multithreading;

public class ThreadDemo extends Thread{
	
	public void run()
	{
		for(int i=1;i<=6;i++)
		{
			System.out.println(i+" "+Thread.currentThread().getName());
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) {
		ThreadDemo t1=new ThreadDemo();
		ThreadDemo t2=new ThreadDemo();
		t1.setName("first thread");
		t2.setName("second thread");
		t1.start();
		t2.start();
	}
	

}
