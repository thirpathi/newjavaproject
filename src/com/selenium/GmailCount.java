package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GmailCount 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		  //WebDriver d = new FirefoxDriver();
		  System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
		  WebDriver d=new ChromeDriver();
		  d.manage().window().maximize();
		  d.manage().deleteAllCookies();
		  d.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		  d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  d.get("https://www.gmail.com");   
		   
		  d.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("tirupatiteja123@gmail.com");
		  d.findElement(By.xpath("//div[@id='identifierNext']")).click();
		  Thread.sleep(5000);

		   
		  d.findElement(By.xpath("//input[@name='password']")).sendKeys("8352794111");
		  d.findElement(By.xpath("//div[@id='passwordNext']")).click();
		  Thread.sleep(30000);

		  //Go to mail box 
		  WebElement t = d.findElement(By.xpath("(//*[@role='tabpanel'])[1]/descendant::table/child::tbody"));
		  
		  //Total count of mails
		  List<WebElement> r1 =t.findElements(By.tagName("tr"));
		  int tcm = r1.size();
		  System.out.println("Total count of mails...."  +tcm);
		  
		  
		/*  
		 // print table data 
		  for (WebElement tdata : d.findElements(By.tagName("tr")))
		  {
			  System.out.println(tdata.getText());
		  }
		   */
		  
		  //do logout
		d.findElement(By.xpath("//*[contains(@aria-label,'Google Account')]")).click();
		d.findElement(By.xpath("//a[contains(text(),'Sign out')]")).click();


		/* Actions a = new Actions(d);
		  WebElement e = d.findElement(By.linkText("Sign out"));
		  a.moveToElement(e).build().perform();
		  a.click(e);
		  Thread.sleep(5000);
			*/
		

		  
//		  d.close();
	}

}


/*o/p:-

Total count of mails....24*/