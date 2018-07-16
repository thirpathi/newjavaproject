package com.programs;

public class StringIsImmutable {

	
	public static void main(String[] args) {
		
		String s1 = "Hello";   // allways String is immutable
		s1.concat("thiru");
		System.out.println(s1);
		
 /*     String s2 = "hellothiru";
		
		if (s1.equalsIgnoreCase(s2))
		{
			System.out.println("String is mutable");
		}
		else
		{
			System.out.println("String is  immutable");
		}
*/		
		StringBuffer sb = new StringBuffer("java");       // StringBuffer is mutable
		sb.append("selenium");
		System.out.println(sb);
		
	}

}




/*o/p:-
Hello
String is  immutable
javaselenium
*/