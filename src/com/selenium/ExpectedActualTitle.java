package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExpectedActualTitle {

	public static void main(String[] args) {
		
		
		    WebDriver d = new FirefoxDriver();
			d.manage().window().maximize();
			d.manage().deleteAllCookies();
			d.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			d.get("http://jqueryui.com");
			
			//System.out.println(d.getTitle());

	        String actualTitle =  d.getCurrentUrl();
	        String expectedTitle = "http://jqueryui.com/";          //"jQuery UI";


	     
	       // actualTitle = d.getTitle();

	        
	        if(actualTitle.contentEquals(expectedTitle))
	        {
	            System.out.println("Test Passed");
	        } 
	        else 
	        {
	            System.out.println("Test Failed");
	        }
	       
	        //close Fire fox
	        d.close();

	}
	
}
