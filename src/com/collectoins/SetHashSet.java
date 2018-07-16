package com.collectoins;

import java.util.HashSet;

public class SetHashSet 
{
  public static void main(String[] args)
  {
	 HashSet h = new HashSet();   // there is no insertion order,where as in linkedhashset insertion order is preserved.
	 System.out.println(h.add(10));
	 System.out.println(h.add(10));  // don't get any compile time error--show it false...  
	 System.out.println(h.add("hello"));
	 System.out.println(h.add("hello"));
	 System.out.println(h.add(10.56));
	 //System.out.println("Hash code of HashSet is: " +h.hashCode());          //---->   Hash code of HashSet is: 397915267
	 System.out.println(h);
  }
}



/*o/p:- 
true
false
true
false
true
[10.56, 10, hello]--------->insertion order is not preserved

*/