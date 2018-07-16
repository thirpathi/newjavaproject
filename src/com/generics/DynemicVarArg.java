package com.generics;

import java.util.*;

public class DynemicVarArg {
	
	
	public void m1(String... s)
	{
		System.out.println("var arg method");
	
	}
	
	public void m1(HashMap h)
	{
		System.out.println(h.get("username"));
		System.out.println(h.get("password"));
	}
	
	public static void main(String[] args) {
		
		DynemicVarArg v = new DynemicVarArg();
		/*v.m1();
		v.m1("java");
		v.m1("hello","hi");
		v.m1("hello","java","selenium","hi");*/
//		v.m1(45);   //----->CE                  TO OVER COME THIS  Dynamically passing the values
		HashMap m = new HashMap();
		m.put("username", "hello");
		m.put("password", "abc123");
		v.m1(m);
	}
}


/*o/p:-
var arg method
var arg method
var arg method
var arg method
hellow
abc123
*/