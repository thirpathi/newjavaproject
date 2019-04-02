package com.corejava;

                                         // partial implementation with constructors  
abstract class AbstractOne {

	public AbstractOne() {
		System.out.println("AbstractOne default constructor");
	}

	public void m1() {
		System.out.println("m1");
	}

	abstract public void m2();

	abstract public void display();
}

abstract class AbstractTwo extends AbstractOne {

	int a;

	public AbstractTwo() {
		this(10);
		System.out.println("AbstractTwo default constructor");
	}

	public AbstractTwo(int a) {
		System.out.println("AbstractTwo perameter constructor");
	}

	@Override
	public void m2() {
		System.out.println("m2");
	}

	public void m3() {
		System.out.println("123456789m3");
	}

}

class AbstractThree extends AbstractTwo {

	public AbstractThree() {
		System.out.println("AbstractThree default constructor");
	}

	@Override
	public void display() {
		System.out.println("display");
	}

	public void m4() {
		System.out.println("m4");
	}

	public void m5() {
		System.out.println("m5");
	}

}

public class AbstractWithConstructors {
	public static void main(String[] args) {
		// AbstractOne a=new AbstractOne(); //----->CE (Abstruct class)
		// AbstractTwo a=new AbstractTwo(); //----->CE (Abstruct class)
		AbstractThree a = new AbstractThree(); // not abstruct class(fully
												// implimentation class)
		a.m1();
		a.m2();
		a.m3();
		a.m4();
		a.m5();
		AbstractOne b = new AbstractThree();
		b.m1();
		b.m2();
		b.display();

	}

}



/*o/p:-
AbstractOne default constructor
AbstractTwo perameter constructor
AbstractTwo default constructor
AbstractThree default constructor
m1
m2
m3
m4
m5
AbstractOne default constructor
AbstractTwo perameter constructor
AbstractTwo default constructor
AbstractThree default constructor
m1
m2
display
*/