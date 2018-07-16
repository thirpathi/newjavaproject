package com.aaaNotUnderstand;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverSetUp 
{
	
	public DriverSetUp()
	{
	System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
    WebDriver d=new ChromeDriver();
    d.manage().window().maximize();
    d.manage().deleteAllCookies();
    d.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
	}
	
}
