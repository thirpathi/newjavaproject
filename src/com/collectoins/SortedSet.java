package com.collectoins;

import java.util.ArrayList;


public class SortedSet {
	public static void main(String[] args)
	{
	
	ArrayList b = new ArrayList();
	b.add(1);
	b.add(2);
	b.add(3);
	b.add(4);
	b.add(5);
	System.out.println(b);
	System.out.println(b.hashCode());
	
	
	
	for (int i = 0; i < b.size(); i++)
	{
		Object d = b.get(i);
		System.out.println("Hashcode" + d.hashCode());
	}
	}

}

	
/*O/P:-
	        [1, 2, 3, 4, 5]
			29615266
			Hashcode1
			Hashcode2
			Hashcode3
			Hashcode4
			Hashcode5
*/

	
	
	
	
	
