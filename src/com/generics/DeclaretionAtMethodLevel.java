package com.generics;

import java.util.*;

public class DeclaretionAtMethodLevel {

	public <T> void m1(T t)
	{
		System.out.println(t);
	}
	
	
	public static void main(String[] args) {
		
		DeclaretionAtMethodLevel a = new DeclaretionAtMethodLevel();
		
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(20);
		a.m1(l);
		
		HashMap h = new HashMap();
		h.put("hello", "hi");
		h.put("hello", "java");
		h.put("hello", "selenium");
		h.put("java", "selenium");
		a.m1(h);
		
	}
}




/*o/p:-
[10, 20]
{java=selenium, hello=selenium}
*/