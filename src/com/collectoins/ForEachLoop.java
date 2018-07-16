package com.collectoins;

import java.util.ArrayList;

public class ForEachLoop {
	
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add("10");
		a.add("20");
		a.add("30");
		a.add("40");
		a.add("50");
		a.add("90");
		System.out.println(a);
		
		for(Object object:a)
		{
			String s = (String)object;
			System.out.println(s);
			if(s=="90")
			{
				System.out.println("rameshsoft");
			}
		}
	}
}
