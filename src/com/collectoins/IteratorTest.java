package com.collectoins;

import java.util.*;

public class IteratorTest {
	
public static void main(String[] args) {
		
		Set a = new HashSet();
		a.add(10);
		a.add(25);
		a.add(35);
		a.add(15);
		a.add(3);
		System.out.println(a);
		
		
		Iterator itr = a.iterator();
		
		while(itr.hasNext())
		{
			Integer i = (Integer)itr.next();
			if(i==25)
			{
				System.out.println("25 is matched");
			}
		}
	}
}




/*o/p:-
[35, 3, 25, 10, 15]
25 is matched 
*/
