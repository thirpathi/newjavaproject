package com.corejava;



class ConstructorOne
{
	int a;
	String s;
 public ConstructorOne(int a, String s)
 {
	 this.a=a;
	 this.s=s;
 }
public void display() 
{
 System.out.println(a+""+s);
}		
}

public class ConstutorForDefaultVariables
{
public static void main(String[] args)
{
	ConstructorOne c=new ConstructorOne(89,"java");
	c.display();
	
	ConstructorOne c1=new ConstructorOne(90,"selinium");
	c1.display();
}
}


/*o/p:
	89java
	90selinium
*/
