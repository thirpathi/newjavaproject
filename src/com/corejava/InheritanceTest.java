package com.corejava;


class common 
{
public void login()
{
 System.out.println("common: login");
}
public void logout()
{
 System.out.println("common: logout");
}
}

class one extends common
{
	public void electronics() 
	{
      System.out.println("one: electronics");
	}
	public void display() 
	{
      System.out.println("one:welcome for flipkart for electronics");
	}
}

class two extends common
{
	public void kids() 
	{
      System.out.println("two: kids");
    }
	public void men() 
	{
      System.out.println("two: men");
	}
}


public class InheritanceTest
{

	public static void main(String[] args) 
	{
		common common=new common();
		common.login();
		common.logout();
		
		one one=new one();
		one.login();
		one.logout();
		one.display();
		one.electronics();
		
		two two=new two();
		two.login();
		two.logout();
		two.kids();
		two.men();
		
		common c=new one();
		c.login();
		c.logout();
	   // c.display();
	   // c.electronics();
		
	   //one o=new common();----> CE
		
		new common().login();
		
	}
}


/*o/p:-
common: login
common: logout

common: login
common: logout
one:welcome for flipkart for electronics
one: electronics

common: login
common: logout
two: kids
two: men

common: login
common: logout

*/