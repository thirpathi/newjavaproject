package com.collectoins;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetLinkedHashSet 
{
  public static void main(String[] args) 
 {
	
	  ArrayList a = new ArrayList(); // {to get all element perpose we  are using ArrayList}
	  a.add(10);
	  a.add(30);
	  a.add(20);
	  a.add(10);
	  a.add(30);
	  a.add(10);

	  System.out.println(a);                                 //  o/p:- [10, 30, 20, 10, 30, 10]  TO GET ALL
	  
	 // HashSet h = new HashSet(a);
	 // System.out.println(h);                  // remove duplicate elements // NO DUPLICATE (ORIGINAL) [20, 10, 30]   NO INSERTION ORDER  
	  LinkedHashSet l = new LinkedHashSet();
	  l.addAll(a);
	  System.out.println(l);                            // [10, 30, 20]  INSERTION ORDER
	  
	  
	/*  HashSet h = new HashSet();
	  for (int i=0;i<a.size();i++)
	  {
		  Object o=a.get(i);
		  h.add(o);
		  System.out.println(h);
	  }
    */
     
	  LinkedHashSet h = new LinkedHashSet();               // i want duplicate elements
	  for (int i=0;i<a.size();i++)
	  {
		  Object o=a.get(i);
		 boolean b= h.add(o);
		 if(b)
		 {
			System.out.println("NO DUPLICATE"); 
		 }
		 else
		 {
			 System.out.println("It is a DUPLICATE :" +o);
		 }
	   }
  } 

}



/*o/p:-         [10, 30, 20, 10, 30, 10]
		        [10, 30, 20]
				NO DUPLICATE
				NO DUPLICATE
				NO DUPLICATE
				It is a DUPLICATE :10
				It is a DUPLICATE :30
				It is a DUPLICATE :10
*/
 

