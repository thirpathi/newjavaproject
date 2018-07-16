package com.newjavafeatures;




@FunctionalInterface
interface i<T>
{
  int length(T t);	
}



public class LambdaWithGenerics 
{
	public static void main(String[] args)
	{
		
		i <String> i1 = s->{int c = s.length();
		return c;};
		
        System.out.println(i1.length("javaselenium"));
		
	}

}


/*
o/p:-
12*/