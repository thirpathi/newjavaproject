package com.javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPageLevel
{

	public static void main(String[] args) throws InterruptedException
	{
      
		 System .setProperty("webdriver.chrome.driver","E:\\batch230\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     
	                  // SCROLLING PAGE LEVEL
	     driver.get("https://en.wikipedia.org/wiki/GNOME");
	     Thread.sleep(5000);
	     JavascriptExecutor js=(JavascriptExecutor)driver;
	     js.executeScript("scroll(0,4500)");
	     Thread.sleep(5000);
	     js.executeScript("scroll(800,0)"); 
	      
	     
        //        Not Working
	    /* JavascriptExecutor js=(JavascriptExecutor)driver;
	     js.executeScript("Window.scrollTo(0,document.body.scrollHeight);");
	     Thread.sleep(5000);
	     js.executeScript("Window.scrollTo(document.body.scrollHeight,0);");
             */
	     
	    
	     Thread.sleep(2000);
	     driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
