package com.programs;

import com.android.dx.ssa.InterferenceRegisterMapper;

public class StringIntConversion {
	
	public static void main(String[] args) {
	
	String s = "10";
	int x = 20;
	
	 // string to int conversion
	int x1 = Integer.valueOf(s);
	System.out.println(x1);
             //OR
	int x2 = Integer.parseInt(s);
	System.out.println(x2);
	
	// int to string conversion
	String s1 = String.valueOf(x);
	System.out.println(s1);
	         //OR
	String s2 = Integer.toString(x);
	System.out.println(s2);
	}

}

/*  ok
o/p:--
10
10
20
20
*/