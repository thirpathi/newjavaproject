package com.selenium;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTab 
{
	
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		
		  WebDriver d = new FirefoxDriver();
		  d.manage().window().maximize();
		  d.manage().deleteAllCookies();
		  d.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		  d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  d.get("https://www.seleniumhq.org/");
		  Thread.sleep(5000);
		  
/*
		  //for using java robot
		  Robot r = new Robot();
		  r.keyPress(KeyEvent.VK_CONTROL);
		  r.keyPress(KeyEvent.VK_T);
		  r.keyRelease(KeyEvent.VK_T);
		  r.keyRelease(KeyEvent.VK_CONTROL);
		  
		  d.get("https://www.google.com"); 
		  Thread.sleep(5000);
 */
		  
		  
		  d.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL +"t");
		  
		  d.get("https://www.gmail.com"); 
		  Thread.sleep(5000);
		  
		  d.close();
	}

}
