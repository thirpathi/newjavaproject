package com.collectoins;

import java.util.Comparator;
import java.util.TreeMap;




public class TreeMapSet 
{
  public static void main(String[] args) 
  {
	  TreeMapTest t = new TreeMapTest();
	  TreeMap t1 = new TreeMap(t);
	  t1.put(1, 100);
	  t1.put(100, 1000);
	  t1.put(50, 500);
	  t1.put(25, 2500);
	  System.out.println(t1);
  }
}

class TreeMapTest implements Comparator
{
  public int compare(Object a, Object b)	
  {
	  Integer a1 = (Integer)a;
	  Integer b1 = (Integer)b;
	  return a1.compareTo(b1);	               //o/p:- {1=100, 25=2500, 50=500, 100=1000}

	 // return -a1.compareTo(b1);             //o/p:- {100=1000, 50=500, 25=2500, 1=100}

  }
}
