package com.corejava;


public class TightlyEncapslation 
{
 private int a=90;
 private String name="hello";
 
 public int getA()
 {
	return a;
}
 public String getName()
 {
	return name;
}
}

class B extends TightlyEncapslation
{
	int a=90;
}

class L extends TightlyEncapslation
{
	 int a=78;
}