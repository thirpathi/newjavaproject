package com.generics;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAllTagNamesOneByOne {

	public static void main(String[] args) throws InterruptedException {
		
		int enabledLinks = 0;
		int disabledLinks = 0;
		
		
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		d.get("https://www.google.com");
		d.findElement(By.name("q")).sendKeys("selenium by ramesh");
		d.findElement(By.xpath("//input[@value='Google Search']")).click();
		Thread.sleep(3000);
		
		d.findElement(By.linkText("Selenium : Selenium WebDriver By Ramesh Anapati")).click();
		List<WebElement> links = d.findElements(By.tagName("a"));
		int totalLinks = links.size();
		System.out.println("total links are : "+totalLinks);
		
		Iterator itr = links.iterator();
		while(itr.hasNext())
		{
			WebElement l = (WebElement)itr.next();
			if(l.isDisplayed()&&l.isEnabled())
			{
				enabledLinks++;
			}
			else
			{
				disabledLinks++;
			}
			
			System.out.println("EnabledLinks are:"+enabledLinks);
			System.out.println("DisabledLinks are:"+disabledLinks);
			
			int total = enabledLinks+disabledLinks;
			if(total==totalLinks)
			{
				System.out.println("count is matching");
			}
			else
			{
				System.out.println("count is not matching");
			}
			Thread.sleep(3000);
			d.close();
		}
	}
}
