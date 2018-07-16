package com.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingElementLevel 
{
	
	
	public static void main(String[] args) throws InterruptedException
	{
		
  
		   System .setProperty("webdriver.chrome.driver","E:\\batch230\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	     
	     
           // SCROLLING ELEMENT LEVEL
           driver.get("https://en.wikipedia.org/wiki/GNOME");
           JavascriptExecutor je=(JavascriptExecutor)driver;
           je.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.partialLinkText("Xfce")));


      //               OR

           /*  driver.get("https://en.wikipedia.org/wiki/GNOME");
           WebElement e=driver.findElement(By.partialLinkText("Xfce"));
           JavascriptExecutor js=(JavascriptExecutor)driver;
           js.executeScript("arguments[0].scrollIntoView();",e);

       */
           Thread.sleep(2000);
           driver.close();      
		
		
		
		
		
	}
	


}
