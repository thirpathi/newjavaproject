package com.examples;


class MyOwnThread extends Thread
{
  @Override
public void run() {
	  
	  for(int i=0; i<10; i++)
	  {
		  System.out.println("child Thread");
	  }
  }
  }


public class MultiThreadForThread {
	public static void main(String[] args) {
		
		MyOwnThread t = new MyOwnThread();
		t.run();
		 for(int i=0; i<10; i++)
		  {
			  System.out.println("Main Thread");
		  }
		
	}

}
