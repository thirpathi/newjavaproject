package com.actionsclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomateCacheElement
{
	
	public static void main(String[] args) throws InterruptedException
	 {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
		
		d.get("http://www.google.co.in");
		Thread.sleep(5000);
		
        //Automate slider 
		WebElement e=d.findElement(By.name("q"));
        Actions a=new Actions(d);
        
        a.sendKeys(e, "kalam").build().perform();
		Thread.sleep(5000);
        a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(5000);
        a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(5000);
        a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(5000);
        a.sendKeys(Keys.ENTER).build().perform();
		
		
        //close site
        d.close();

	}
	
}
