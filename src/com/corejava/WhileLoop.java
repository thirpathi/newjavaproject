package com.corejava;



/*public class WhileLoop {  
	
public static void main(String[] args) {  
    while(true){  
        System.out.println("infinitive while loop");  
    }  
}  
}  */

public class WhileLoop 
{  
  public static void main(String[] args) 
   { 
    int i=0;  
    while(i<=3)              //  	for( int i=0; i<=3; ++i )        //-----> (initialization ; condition ; increment/decrement)   [ i++ = ++i ]--equals
    {  
    System.out.println(i);  
    ++i;  
    }  
  }  
}  




/*
o/p:-
0
1
2
3
4
5
6
7
8
9
10
*/