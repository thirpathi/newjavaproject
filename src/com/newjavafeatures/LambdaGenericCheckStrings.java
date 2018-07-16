package com.newjavafeatures;




interface S<T1 ,T2>
{
	boolean check(T1 t1,T2 t2);
}



public class LambdaGenericCheckStrings {
	
	public static void main(String[] args) {
	/*	
		S<String , String>  s = (s1,s2)->{boolean b = s1.equalsIgnoreCase(s2);return b;};    // by using lambda expresion we redusing the lenth of the code
	    System.out.println(s.check("java", "java"));
	*/
		
		S s = (s1,s2)->{boolean b = true;     // normal programe
		if(s1==s2)
		{
			b=true;
		}
		else
		{
			b=false;
		}
		return b;};
		boolean d = s.check(90,92);            // we r using genirics, so we can use --(int or string)
	  //boolean d = s.check("java", "java123");

	
		System.out.println(d);
	
	
	
	
	
	
	}
	
	

}




/*
o/p:-
false
*/