package com.actionsclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateMethods 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new FirefoxDriver();


        // Navigate methods
        driver.get("https://www.gmail.com");
        driver.navigate().to("https://www.google.co.in/");
        Thread.sleep(5000);
        
        driver.navigate().back();
        Thread.sleep(5000);
        
        driver.navigate().forward();
        Thread.sleep(5000);
        
        driver.navigate().refresh();
        Thread.sleep(5000);
        
        driver.findElement(By.cssSelector("input[aria-label='Search']")).sendKeys("kalam");
        driver.close();

		
	}

}
