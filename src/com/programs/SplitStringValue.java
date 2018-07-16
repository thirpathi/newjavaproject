package com.programs;

public class SplitStringValue 
{
	public static void main(String[] args) 
	{
		    //Split
		    //String x="9 3 9 2 8 4 1 1 5 4";
	    String x="i am in mindq . w r u";
		String y[]=x.split(" ");    // space is saparetor
		for (int i=0;i<y.length;i++)
		{
			System.out.println(y[i]);
		}
	     
	}

}


/*output :
i
am
in
mindq
.
w
r
u

*/