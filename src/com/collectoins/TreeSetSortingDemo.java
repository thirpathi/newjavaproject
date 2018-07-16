package com.collectoins;

import java.util.TreeSet;

public class TreeSetSortingDemo 
{
   public static void main(String[] args) 
   {
	  TreeSet t = new TreeSet();
	  t.add(100);
	  t.add(10);
	  t.add(1000);
	  t.add(120);
	  t.add(150);
	  t.add(200);
	  //t.add("java"); //---->RE
	  /*[Exception java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
         at java.lang.String.compareTo(Unknown Source)]
      */
	  System.out.println(t);          // o/p:- [10, 100, 120, 150, 200, 1000]

   }
}
