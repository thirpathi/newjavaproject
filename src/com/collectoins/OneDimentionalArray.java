package com.collectoins;


public class OneDimentionalArray 
{
    public static void main(String[] args)
   {
	
   int a[] = new int[15];       //size is fixed
   
   a[0]=12;
   a[1]=91;
   a[2]=121;
 //a[3]="hello";          // b'coz initialization is int so NOT ALLOWS STRING VALUES
   a[3]='a';
 //a[15]=222;            // RE:- java.lang.ArrayIndexOutOfBoundsException: 15
   
   System.out.println(a.length);
   
   
   

    for (int i=0; i<a.length; i++)
    {
      System.out.println(a[i]);	
    }

   }

 }

/*
o/p:-
12
91
121
97
0
0
0
0
0
0
0
0
0
0
0
*/