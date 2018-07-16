package com.examples;

class MyThread extends Thread
{
  @Override
public void run() {
	  
	  for(int i=0; i<10; i++)
	  {
		  System.out.println("child Thread");
	  }
  }
  }


public class MultiThreadForRunnable {
	public static void main(String[] args) throws InterruptedException {
		
		
		
		/*System.out.println("main " +Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(4);
		System.out.println("main " +Thread.currentThread().getPriority());
		System.out.println("main " +Thread.currentThread().getName());
*/

		MyThread t = new MyThread();
		Thread t1 = new Thread(t);
		
		
		/*System.out.println("child" +t1.getPriority());
		t1.setPriority(6);
		System.out.println("child" +t1.getPriority());
		System.out.println("child" +t1.getName());
*/

		
		t1.start();
		t1.join();
		
		 for(int i=0; i<10; i++)
		  {
			  System.out.println("Main Thread");
		  }
		
	}

}
