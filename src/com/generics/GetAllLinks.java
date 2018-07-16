package com.generics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetAllLinks {

   public static void main(String[] args) throws InterruptedException {
	
	  int enabledLinks =0;
	  int disabledLinks =0;
	  WebDriver d= new ChromeDriver();
	  d.manage().window().maximize();
	  d.get("https://www.google.com");
	  
	  WebElement e = d.findElement(By.id("lst-ib"));
	  e.sendKeys("selenium by ramesh");
	  
	  d.findElement(By.xpath("//input[@value='Google Search']")).click();
	  Thread.sleep(5000);
	  d.findElement(By.linkText("Selenium : Selenium WebDriver By Ramesh Anapati")).click();
	  
	  WebDriverWait wait = new WebDriverWait(d,89);
	  List<WebElement> links = d.findElements(By.tagName("a"));
	  
	  wait.until(ExpectedConditions.visibilityOfAllElements(links));
	  
	  System.out.println("total links are:" +links.size());
	  
	  Iterator<WebElement> itr = links.iterator();
	  while(itr.hasNext())
	  {
		  WebElement l = itr.next();
		  if (l.isDisplayed()&&l.isEnabled())
		  {
			  enabledLinks++;
		  }
		  else
		  {
			  disabledLinks++;
		  }
	  }
	  System.out.println("enabled are :" +enabledLinks);
	  System.out.println("disabled are:" +disabledLinks);
}
}

