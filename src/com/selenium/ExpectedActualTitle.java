package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExpectedActualTitle {

	public static void main(String[] args) {
		
		
		  //WebDriver d = new FirefoxDriver();
		    System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
            WebDriver d = new ChromeDriver();
			d.manage().window().maximize();
			d.manage().deleteAllCookies();
			d.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			d.get("http://jqueryui.com");
			
			System.out.println("Title is .." +d.getTitle());

	        String actualUrl =  d.getCurrentUrl();
	        String expectedUrl = "http://jqueryui.com/";          //"jQuery UI";

	        if(actualUrl.contentEquals(expectedUrl))
	        {
	            System.out.println("Test Passed");
	        } 
	        else 
	        {
	            System.out.println("Test Failed");
	        }
	        
	        System.out.println("  So actualUrl is.."  +d.getCurrentUrl() );
	        System.out.println("  expectedUrl is..  http://jqueryui.com/ ");

	       
	        //close Fire fox
	        d.close();

	}
	
}


/*o/p:-
OK
Title is ..jQuery UI
Test Passed
  So actualUrl is..http://jqueryui.com/
  expectedUrl is..  http://jqueryui.com/ 
*/
