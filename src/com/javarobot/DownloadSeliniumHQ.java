package com.javarobot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DownloadSeliniumHQ 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
		driver.get("http://www.seleniumhq.org");
		Thread.sleep(5000);
		
        driver.findElement(By.linkText("Download")).click();
        Thread.sleep(5000);
        
        driver.findElement(By.linkText("3.9.1")).click();
        Thread.sleep(5000);
        
        Robot r = new Robot();
     /*   r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(5000);
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(5000);
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(5000);
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(5000);
        
        
        */
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        driver.quit();

	}

}


//output: it's working