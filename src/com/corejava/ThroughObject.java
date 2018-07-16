package com.corejava;

public class ThroughObject
{
int a;
String s;
public static void main(String[] args) 
{
	ThroughObject a1=new ThroughObject();
	System.out.println(a1.a+""+a1.s);
	a1.a=100;
	a1.s="hello";
	a1.a=666;
	a1.s="love";
	System.out.println(a1.a+""+a1.s);
	
	ThroughObject a2=new ThroughObject();
	System.out.println(a2.a+""+a2.s);
	a2.a=200;
	a2.s="java";
	System.out.println(a2.a+""+a2.s);
	
	ThroughObject a3=new ThroughObject();
	System.out.println(a3.a+""+a3.s);
	
	
}   
}


/*o/p:
	0null
	666love
	0null
	200java
	0null
*/