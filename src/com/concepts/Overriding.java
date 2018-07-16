package com.concepts;

public class Overriding {

	
	
	/*
	06. Method overriding in java with example
	Declaring a method in subclass which is already present in parent class is known as method overriding

	Rules for Method Overriding:

	1.      applies only to inherited methods
	2.      object type (NOT reference variable type) determines which overridden method will be used at runtime
	3.      Overriding method can have different return type
	4.      Overriding method must not have more restrictive access modifier
	5.      Abstract methods must be overridden
	6.      Static and final methods cannot be overridden
	7.      Constructors cannot be overridden
	8.      It is also known as Runtime polymorphism.


	Example:

	One of the simplest example – Here Boy class extends Human class. Both the classes have a common method void eat(). Boy class is giving its own implementation to the eat() method or in other words it is overriding the method eat().

	class Human{
	   public void eat()
	   {
	      System.out.println("Human is eating");
	   }
	}
	class Boy extends Human{
	   public void eat(){
	      System.out.println("Boy is eating");
	   }
	   public static void main( String args[]) {
	      Boy obj = new Boy();
	      obj.eat();
	   }
	}

	Output:
	Boy is eating


	Advantage of method overriding
	The main advantage of method overriding is that the class can give its own specific implementation to a inherited method without even modifying the parent class(base class). 

	Method Overriding in dynamic method dispatch
	Dynamic method dispatch is a technique which enables us to assign the base class reference to a child class object. As you can see in the below example that the base class reference is assigned to child class object.

	class ABC{
	   public void disp()
	   {
	      System.out.println("disp() method of parent class");
	   }
	   public void abc()
	   {
	      System.out.println("abc() method of parent class");
	   }         
	}
	class Test extends ABC{
	   public void disp(){
	      System.out.println("disp() method of Child class");
	   }
	   public void xyz(){
	      System.out.println("xyz() method of Child class");
	   }
	   public static void main( String args[]) {
	      //Parent class reference to child class object
	      ABC obj = new Test();
	      obj.disp();
	      obj.abc();
	   }
	}

	Output:
	disp() method of Child class
	abc() method of parent class

	Super keyword in Overriding

	super keyword is used for calling the parent class method/constructor. super.methodname() calling the specified method of base class while super() calls the  constructor of base class. Let’s see the use of super in Overriding.

	class ABC{
	   public void mymethod()
	   {
	       System.out.println("Class ABC: mymethod()");
	   }         
	}
	class Test extends ABC{
	   public void mymethod(){
	      //This will call the mymethod() of parent class
	      super.mymethod();
	      System.out.println("Class Test: mymethod()");
	   }
	   public static void main( String args[]) {
	      Test obj = new Test();
	      obj.mymethod();
	   }
	}

	Output:

	Class ABC: mymethod()
	Class Test: mymethod()
*/
	
	
	
	
	
	
	
	
	
	
}
