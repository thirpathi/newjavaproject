package com.programs;



//  "How do you Print My Name (Thiru) 1000 Times in java without looping".
//   1. No Loops.
//   2. No recursion.


public class Print1000Times 
{
	/*
	public void p1000(){ p300(); p300(); p300(); p100();	}//1000
	public void p300() { p100(); p100(); p100();	        }//300
	public void p100() { p30(); p30(); p30(); p10();	    }//100
	public void p30()  { p10(); p10(); p10();	            }//30
	public void p10()  { p3(); p3(); p3(); p1();	        }//10
	public void p3()   { p1(); p1(); p1();              	}//3
	public void p1()   { System.out.println("thiru");	    }
	  */
	
	public void p1000(){ p500(); p500(); }
    public void p500() { p100(); p100(); p100(); p100();  p100();	}
	public void p100() { p30(); p30(); p30(); p10();	    }
	public void p30()  { p10(); p10(); p10();	            }
	public void p10()  { p3(); p3(); p3(); p1();	        }
	public void p3()   { p1(); p1(); p1();              	}
	public void p1()   { System.out.println("thiru");	    }  
  
	public static void main(String[] args) 
	{
		
		Print1000Times c = new Print1000Times();
		c.p1000();
	   // new Print1000Times().p100();
	}
}



/*
 
  public class Print1000Times 
  {
   public static void main(String[] args)           
	 {
		
   //System.out.print(String.format("%1000d",0).replace("0", "thiru\n"));                         //python

	}

}


*/




/* 
   public class Print1000Times 
{
   public static void main(String[] args)            // NOT PRINT 1000  (PRINTS 100)
	{
		
	String s1 = "thiru";
	String s3 = s1 + s1 + s1;
	String s10 = s3 + s3 + s3 + s1;
	String s30 = s10 + s10 + s10;
	String s100 = s30 + s30 + s30 + s10; 
	String s300 = s100 + s100 + s100;
	String s1000 = s300 + s300 + s300 + s100;
	
	System.out.println(s1000);
	System.out.print(s100);
	
	}

 }        	


*/








