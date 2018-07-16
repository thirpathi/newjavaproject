package com.collectoins;

import java.util.TreeSet;

public class TreeSetTest 
{
   public static void main(String[] args) 
   {
	   TreeSet t = new TreeSet();            //TreeSet & TreeMap allows only Homogenious AND these two are by default SORTING ORDER
	  // t.add(null);                       // nullpointerException b'coz we didnt passing any value
	   t.add(10);
	   t.add(5);
	  // t.add("java");                   //TreeSet & TreeMap allows only Homogenious
	   System.out.println(t);

	   
	   
   }
}



/*
o/p:-
[5, 10]
*/