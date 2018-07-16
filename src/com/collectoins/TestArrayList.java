package com.collectoins;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList<E> 
{
	
	/*String Name;
	int Age;
	String Depart;
	
	TestArrayList(String name, int age, String depart)
	{
		this.Name = name;
		this.Age = age;
		this.Depart = depart;
	}
	*/
	
	public static void main(String[] args)
	{
		
	Employee v1 = new Employee("ram", 26, "dev");
	Employee v2 = new Employee("ramesh", 27, "dev");
	Employee v3 = new Employee("tejas", 28, "dev");

	
	
	ArrayList<Employee>  ar1 = new ArrayList<Employee>();
	ar1.add(v1);
	ar1.add(v2);
	ar1.add(v3);
	
	
	Iterator<Employee> it = ar1.iterator();
	while(it.hasNext())
	{
		Employee emp = it.next();
	    System.out.println(emp.Name);
	    System.out.println(emp.Age);
	    System.out.println(emp.Depart);
	}
	
	
	System.out.println("*******************************************");
	
	
	ArrayList<String>  ar2 = new ArrayList<String>();
	ar2.add("java");
	ar2.add("selinium");
	ar2.add("testing");
	
	
	ArrayList<String>  ar3 = new ArrayList<String>();
	//ar3.addAll(ar2);
    ar3.add("Driver");
	ar3.add("QA");
	ar3.add("testing");



	System.out.println(ar3);
	
	
	System.out.println("**********");
	
	for(int i=0; i<ar3.size(); i++)
	{
		System.out.println(ar3.get(i));
	}
	
	System.out.println("**********");

	ar2.retainAll(ar3);

	for(int i=0; i<ar2.size(); i++)
	{
		System.out.println(ar2.get(i));
	}
	
	
	
	
	}	

}
