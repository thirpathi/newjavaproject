package com.newjavafeatures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;


@FunctionalInterface
interface lambdasmall
{
int pickNumber(Collection<Integer> c);	

}


public class  SmallestLambda {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();   // collect all numbers in the list for the dublicate elements
		a.add(2);
		a.add(25);
		a.add(12);
		a.add(58);	
		a.add(58);
		a.add(78);
		
		TreeSet t = new TreeSet(a);
		ArrayList l1 = new ArrayList(t);
		System.out.println(l1); 
		
		
		lambdasmall s = c -> {int m = (Integer) l1.get(1); return m;};                      // lambda expression1
		 System.out.println(s.pickNumber(l1));  ;
	
	}
}






/* o/p:-
[2, 12, 25, 58, 78]
12
*/
