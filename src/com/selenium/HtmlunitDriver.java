package com.selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
public class HtmlunitDriver {

	public static void main(String[] args) throws InterruptedException {
		        //System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
			    //WebDriver driver=new ChromeDriver();
				WebDriver driver = new HtmlUnitDriver();
//HtmlUnitDriver()---------here we can use html unit driver it is not part of selenium 3.0 , before selenium 3.0 it is part of selenium.
//HtmlUnitDriver()------------here how to use this concept we have to download htmlunitdriver() jar file we have to download.
				//driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 	driver.get("https://crmpro.com/");
			    System.out.println("before login title is :---"+  driver.getTitle());
				Thread.sleep(5000);
//login details:
	      	  	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Msirisha6979");
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("141001410");
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				Thread.sleep(3000);
			    System.out.println("after login title is :---" +  driver.getTitle());
//close site:						
			    Thread.sleep(3000);
    			//driver.findElement(By.xpath("//a[@href='https://www.freecrm.com/index.cfm?logout=1']")).click();
				Thread.sleep(3000);
				//driver.close();
		
	}

}


/*
o/p:-   ok
before login title is :---Free CRM in the cloud software boosts sales
after login title is :---CRMPRO*/

