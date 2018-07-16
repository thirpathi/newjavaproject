package com.collectoins;

import java.util.TreeMap;

public class TreeMapDemo 
{
   public static void main(String[] args) 
   {
	  TreeMap t = new TreeMap();
	  t.put(10, "hello");
	  t.put(10, "java");
	  t.put(1,5);                //---> TreeMap is based on KEY value not VALUE.SO
	  // t.put("hello", 5);     //----> Sorting means there is no String values.(Only Int)
	  t.put(100, 200);
	  System.out.println(t);  //o/p:-  {1=5, 10=java, 100=200}

   }
}






