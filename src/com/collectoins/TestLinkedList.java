package com.collectoins;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList
{
	
	public static void main(String[] args) 
	{
	
	LinkedList<String> ll = new LinkedList<String>();
	
	ll.add("Test");
	ll.add("QTP");
	ll.add("QA");
	
	System.out.println(ll);
	
	
	ll.addFirst("raja");
	ll.addLast("shek");
	ll.addLast("she");
	
	
	
	
	

	ll.set(4, "anil");
	//ll.removeLast();
	//ll.removeFirst();
	
	ll.set(0, "ra");

	System.out.println(ll);
	
	
	//how to print all the values of linked list
	//using for loop
	System.out.println("**********for loop***********");
	for (int i=0; i<ll.size(); i++)
	{
		System.out.println(ll.get(i));
		
	}
	
	
	//using advanced for loop ---For-Each loop
	System.out.println("**********for-each loop***********");
	for(String str:ll)
	{
		System.out.println(str);
	}
	
	
	//using iterator 
	System.out.println("**********iterator***********");
	Iterator<String> it = ll.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
		
	}
	
	
	
	//using while loop	 
	System.out.println("**********while loop***********");
	int i=0;
	while(i<ll.size())
	{
		System.out.println(ll.get(i));
		i++; 
	}

	
	


	

	
	}

}
