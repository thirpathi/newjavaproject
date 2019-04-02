package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class WebDriverMethods
{
  public static void main(String[] args)
  {
	//WebDriver d=new FirefoxDriver();
	System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
    WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.gmail.com");
	
	String Url=d.getCurrentUrl();
	System.out.println("url is:"+Url);
	
	String windowName=d.getWindowHandle();
	System.out.println("window name is:"+windowName);
	
	String title=d.getTitle();
	System.out.println("title of the page is:"+title);
	
	String Pagesource=d.getPageSource();
	System.out.println("pagesource is:"+Pagesource);
    	
	d.close();
	
	
	
	
	/*
	WEBDRIVER METHODS:----
	d.manage().window().maximize();
	d.get
	d.getScree
	d.getPosition
	d.getTitle()
	d.getCurrentUrl()
	Driver.getPageSource()
	d.getWindowHandle()
	getWindowHandeles();
	navigate();
	d.close(); ----it is close all opened windows in currently working browser only.
    d.quit();  ----it is also close all opened windows and browsers too.
	*/
	
  }
}
 

/*
o/p:-
url is:https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin
  
window name is:{f5210ee1-b801-4735-9fda-bd4edb16818f}
  
title of the page is:Gmail

  */