package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllWebPagesLinks {
	
	  static int linkCount = 0;

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
		  WebDriver d=new ChromeDriver();
		  d.manage().window().maximize();
		  d.manage().deleteAllCookies();
		  d.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		  d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  d.get("https://www.gmail.com"); 
		  
		  
		  for (WebElement links : d.findElements(By.tagName("a")))
		  {
			  System.out.println(links.getText());
			linkCount++;
		  }
		   
		System.out.println("Total links on page :" +linkCount);
		
	}
	
}

/*o/p:--
ok
Learn more
Help
Privacy
Terms
Total links on page :4*/
