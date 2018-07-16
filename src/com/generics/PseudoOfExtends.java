package com.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




/*class Test <T extends Number>        // if T is a class, class can extends same class or child classes only. b'coz BOUNDED TYPE 
{
	
}

public class PseudoOfExtends {
	
	public static void main(String[] args) {
//      Test<String> t = new Test();  //----CE it is a Bounded Type
		Test<Number> a = new Test();        
		Test<Integer> b = new Test();
//		Test<Object> c = new Test();  //-----CE it is a Bounded Type

	}

}
*/




class Test <T extends WebDriver>    // if T is a WebDriver, class can extends same WebDriver or implementation classes only. b'coz BOUNDED TYPE 
{
	
}

public class PseudoOfExtends {
	
	public static void main(String[] args) {
//      Test<String> t = new Test(); //----CE it is a Bounded Type
		Test<WebDriver> a = new Test();        
		Test<ChromeDriver> b = new Test();
//		Test<Object> c = new Test();  //-----CE it is a Bounded Type

	}

}
