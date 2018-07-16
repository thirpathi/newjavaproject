package com.corejava;

public class ToStringMethodOfObject
{
public static void main(String[] args)
{
	String s = new String("hello");
	//System.out.println(s);
	System.out.println(s.toString());
	
	Integer i= new Integer(90);
	//System.out.println(i);
	System.out.println(i.toString());
	
	StringBuffer sb = new StringBuffer("java");
	//System.out.println(sb);
	System.out.println(sb.toString());
	
	StringBuilder sb1 = new StringBuilder("don't sleep");
	//System.out.println(sb1);
	System.out.println(sb1.toString());
	
	/*
	public String toString()
	{
		return "hello selenium";
	}
	
	ToStringMethodOfObject t = new ToStrinMSethodOfObject("hello selenium");
	t.toString();
	
*/	
}
}
