package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab 
{
	
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		
		 // WebDriver d = new FirefoxDriver();
		  System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
          WebDriver d = new ChromeDriver();
		  d.manage().window().maximize();
		  d.manage().deleteAllCookies();
		  d.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		  d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  d.get("https://www.seleniumhq.org/");
		  Thread.sleep(5000);
		  

		  //for using java robot
		  Robot r = new Robot();
		  r.keyPress(KeyEvent.VK_CONTROL);
		  r.keyPress(KeyEvent.VK_T);
		  r.keyRelease(KeyEvent.VK_T);
		  r.keyRelease(KeyEvent.VK_CONTROL);
		  Thread.sleep(2000);

		  ArrayList<String> tabs = new ArrayList<String> (d.getWindowHandles());
		  d.switchTo().window(tabs.get(1));    // main tab

		  d.get("https://www.google.com"); 
		  Thread.sleep(2000);
		  
		  r.keyPress(KeyEvent.VK_CONTROL);
		  r.keyPress(KeyEvent.VK_T);
		  r.keyRelease(KeyEvent.VK_T);
		  r.keyRelease(KeyEvent.VK_CONTROL);
		  Thread.sleep(2000);
		  
		  d.switchTo().window(tabs.get(2)); 
		  d.get("https://www.gmail.com"); 
		  Thread.sleep(5000);
		  
		  d.switchTo().window(tabs.get(1));
		  d.close();


		
		 /* d.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL +"t");
		  d.get("https://www.gmail.com"); 
		  Thread.sleep(5000);
		  */
	}

}

/*o\p:--
OK*/
