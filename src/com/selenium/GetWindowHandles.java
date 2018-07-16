package com.selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetWindowHandles {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\rameshsoft\\chromedriver.exe");
		//ChromeDriver d = new ChromeDriver();
		
	    WebDriver d = new FirefoxDriver();

		
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
     	d.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	
		d.get("https://www.bing.com");
		Thread.sleep(3000);
		//d.findElement(By.id("sb_form_q")).sendKeys("selenium");
		
		d.findElement(By.linkText("Outlook.com")).click();
		
        String firstwindow = d.getWindowHandle();
		//System.out.println("First window name is:"+firstwindow);
		
		Set<String> windows = d.getWindowHandles();
		
		Iterator itr = windows.iterator();
		while(itr.hasNext())
		{
			String window = (String)itr.next();
			if(!window.equalsIgnoreCase(firstwindow))
			{
				d.switchTo().window(window);
				break;
			}
		}
		
		//d.findElement(By.id("idA_PWD_ForgotPassword")).click();
		/*String secondwindow = d.getWindowHandle();
		System.out.println("Second window name is:"+secondwindow);*/
		d.quit();

	}

}
