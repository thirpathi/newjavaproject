package com.corejava;

import java.util.ArrayList;


public class HashCodeOfTheObject 
{
   public static void main(String[] args)
  {
     ArrayList a = new ArrayList();
     a.add(10);
     a.add(10);
     a.add(100);    
     a.add(1000);
     a.add(1000);
     a.add(100);
    // System.out.println(a.hashCode());
    
     for (int i=0; i<a.size(); i++)
     {
    	 Object d = a.get(i);
    	 System.out.println(d.hashCode());
     }
     
  }
}


/*o/p:-
10
10
100
1000
1000
100
*/