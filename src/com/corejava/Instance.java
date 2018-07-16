package com.corejava;

/*public class Instance   // Instance (non-static)
{
	int count ;
	{
		count++;
		System.out.println("count is:"+count);
	}
	public static void main(String[] args) 
	{
		Instance a1=new Instance();
		Instance a2=new Instance();
		Instance a3=new Instance();
		Instance a4=new Instance();
	}
}

*/
/*o/p:-
count is:1
count is:1
count is:1
count is:1*/




public class Instance   // static (static)
{
	static int count;
	{
		count++;
		System.out.println("count is :"+count);
	}
	public static void main(String[] args) 
	{
		Instance a1=new Instance();
		Instance a2=new Instance();
		Instance a3=new Instance();
		Instance a4=new Instance();
	}
}


/*o/p:-
count is 1
count is 2
count is 3
count is 4
*/



