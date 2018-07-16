package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTotalCounts {
	public static void main(String[] args) throws InterruptedException {
		
		
          System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
		  WebDriver d = new ChromeDriver();
		  d.manage().window().maximize();
		  d.manage().deleteAllCookies();
		  d.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		  d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  d.get("https://www.gmail.com");   
		   
		  d.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("rudratejas@gmail.com");
		  d.findElement(By.xpath("//div[@id='identifierNext']")).click();
		  Thread.sleep(5000);

		   
		  d.findElement(By.xpath("//input[@name='password']")).sendKeys("8352794111");
		  d.findElement(By.xpath("//div[@id='passwordNext']")).click();
		  Thread.sleep(5000);

		  //Go to mail box 
		  WebElement t = d.findElement(By.xpath("(//*[@role='tabpanel'])[1]/descendant::table/child::tbody"));
		  
		  
		  //Total count of mails
		  List<WebElement> r1 =t.findElements(By.tagName("tr"));
		  int tcm = r1.size();
		  System.out.println("Total count of mails...."  +tcm);

		  
		  //Total count of unread mails
		  List<WebElement> r2 =t.findElements(By.xpath("//*[@class='zA zE']"));
		  int tcum = r2.size();
		  System.out.println("Total count of unread mails...."  +tcum);

		  
		  //Total count of read mails
		  List<WebElement> r3 =t.findElements(By.xpath("//*[starts-with(@class,'zA yO')]"));
		  int tcrm = r3.size();
		  System.out.println("Total count of read mails...."  +tcrm);

		  
		  //do logout
		  d.findElement(By.xpath("//*[contains(@title,'Account')]/child::*[1]")).click();
		  Thread.sleep(5000);
		  d.findElement(By.linkText("Sign out")).click();
		  Thread.sleep(5000);
			
		  
		  //close site
		  d.quit();
		  
	}

}


/*
 o/p:-
 
Total count of mails....24
Total count of unread mails....5
Total count of read mails....19

*/


