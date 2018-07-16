package com.collectoins;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;


public class TreeSetCostumizedSorting      // OUR OWN COSTOMIZED SORTING
{
	public static void main(String[] args) 
	{
          CustomizedSorting c= new CustomizedSorting();
		  TreeSet t = new TreeSet(c);
		  t.add(100);
		  t.add(10);
		  t.add(1000);
		  t.add(120);
		  t.add(150);
		  t.add(200);
		  System.out.println(t);           
		  
	/*    ArrayList l = new ArrayList(t);
		  //l.addAll(t);                                              
		  System.out.println(l.get(0));  
		  System.out.println(l.get(2));    
		  System.out.println(l.get(l.size()-1)); 
		  System.out.println(l.get(4));   */                   
	}
}


class CustomizedSorting implements Comparator
{
public int compare( Object o1 , Object o2)
{
 Integer a=(Integer)o1;
 Integer b=(Integer)o2;
 //return a.compareTo(b);    //-----> o/p:-   [10, 100, 120, 150, 200, 1000]
 return -a.compareTo(b);    //------->o/p:-   [1000, 200, 150, 120, 100, 10]


}
}

