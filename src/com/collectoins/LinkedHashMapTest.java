package com.collectoins;

import java.util.LinkedHashMap;

public class LinkedHashMapTest
{
   public static void main(String[] args) 
   {
	 LinkedHashMap m = new LinkedHashMap();
	 m.put("course", "java");
	 m.put("love course", "webservices");
	 m.put(" ", "test");
	 m.put("2", "test");
	 m.put("2", "test123");
	 
      System.out.println(m);
	 
	 //System.out.println(m.get(0));
	 
	 System.out.println(m.getOrDefault(2, 56));

    
   }
}
