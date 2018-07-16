package com.newjavafeatures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;


@FunctionalInterface
interface small
{
int pickNumber(Collection<Integer> c);	

}


public class SmallestNumber {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add(2);
		a.add(25);
		a.add(12);
		a.add(58);	
		a.add(58);
		a.add(78);
		
		TreeSet t = new TreeSet(a);
		
		ArrayList l1 = new ArrayList(t);
		System.out.println(l1);
		
		Integer i = (Integer)l1.get(1);
	    System.out.println(i);
	}
}



/*o/p:-
[2, 12, 25, 58, 78]
12
*/