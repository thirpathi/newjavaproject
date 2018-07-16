package com.programs;

public class FebonacisSeries 
{
	
	public static void main(String[] args) 
	{
		//int x,y,z;
		int x=0;
		int y=1;
		int z=x+y;
		System.out.print(x+" "+y+" "+z+" ");
		for(int i=0;i<=5;i++)
		{
			x=y;
			y=z;
			z=x+y;
			System.out.print(z+" ");
		}
	}
}



/*o/p:-
0 1 1 2 3 5 8 13 21 34 55 89 144 */
