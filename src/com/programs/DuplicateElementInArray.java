package com.programs;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray
{
	public static void main(String[] args) 
	{

		String names[] = {"raju", "rani", "ramu", "chinni", "mani", "thiru", "chinni"};
		//String names[] = {"1", "2", "3", "4", "4", "3", "2"};
		
		Set<String> store = new HashSet<String>();
		for(String name : names)
		{
		if(store.add(name) == false)
		{
			System.out.println("duplicate element is :::" + name);
		}
		
	    }
	}
}


/*o/p:-
duplicate element is :::chinni
*/