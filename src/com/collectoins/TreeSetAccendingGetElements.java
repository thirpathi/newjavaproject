package com.collectoins;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetAccendingGetElements 
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
	  System.out.println(t);            // o/p:- [10, 100, 120, 150, 200, 1000]
	  
	  ArrayList l = new ArrayList(t);
	 // l.addAll(t);                                                // added all elements o/p:- [10, 100, 120, 150, 200, 1000]
	  System.out.println(l.get(0));                              //10
	  System.out.println(l.get(2));                             //120
	  System.out.println(l.get(l.size()-1));                   //1000
	  System.out.println(l.get(4));                           //200





}
}
