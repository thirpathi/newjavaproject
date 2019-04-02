package com.programs;

import java.util.Arrays;

public class Anagrams {

	//Two strings are called anagrams if they contain same set of characters but in different order.
	// s1 = "Hello";
	// s2 = "llohe";

	public static void main(String[] args) {
		
		String s1 = "THIRU";
		String s2 = "UTHIR";
		
		/*s1 = s1.toLowerCase();             // if required (wantedly) we strict to Lower/Upper
		s2 = s2.toLowerCase();
		*/
		char chr1[] = s1.toCharArray();
		char chr2[] = s2.toCharArray();
		
		Arrays.sort(chr1);
		System.out.println(chr1);
		Arrays.sort(chr2);
		System.out.println(chr2);
		
		boolean status = Arrays.equals(chr1, chr2);
		if(status)
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("both are not equal");
		}
		
	}
}



/*o/p:-
hirtu
ehiprt
both are not equal
*/