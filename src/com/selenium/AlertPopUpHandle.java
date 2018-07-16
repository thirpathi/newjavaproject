package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopUpHandle 
{
	public static void main(String[] args) throws InterruptedException {
		
	  WebDriver d = new ChromeDriver();
	   //  d.manage().window().maximize();
	     d.manage().deleteAllCookies();
	     d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	     
	     d.get("https://mail.rediff.com/cgi-bin/login.cgi");
	     d.findElement(By.xpath("//*[@name='proceed']")).click();
	     Thread.sleep(2000);
	     
	     d.switchTo().alert().accept();               // it will also working comfortabilly 
	     
	     
	  /*   
	    // d.switchTo().alert().accept();           // but this is more efficiency
	    Alert alert = d.switchTo().alert();
	    System.out.println(alert.getText());
	    String text = alert.getText();
	    
	    if(text.equals("Please enter a valid user name"))
	    {
	    	System.out.println("correct alert message");
	    }
	    else
	    {
	    	System.out.println("in-correct alert message");

	    }

	    alert.accept();
	    System.out.println("************");
	     
	     
	     
	     */
	     
	}
}
