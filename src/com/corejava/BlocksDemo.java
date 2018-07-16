package com.corejava;

class BlocksDemoOne 
{ 
  static // static block
  {
	System.out.println("static block");  
  }
  
	//instance block
  {
	  System.out.println("instance block");
  }
  
  BlocksDemoOne()
  {
	  System.out.println("DEF constructor");
  }
}
  

  public class BlocksDemo 
  {
  
  public static void main(String[] args) 
  {
	  BlocksDemoOne b=new BlocksDemoOne();
//	  BlocksDemoOne b1=new BlocksDemoOne();

  }
}




/*o/p:-
static block
instance block
DEF constructor
instance block
DEF constructor
*/