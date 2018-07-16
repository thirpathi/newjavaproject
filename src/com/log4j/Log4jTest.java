package com.log4j;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Log4jTest {

	 public static void main(String[] args) throws InterruptedException, AWTException
	  {
		  
		PropertyConfigurator.configure("D:\\rameshsoft\\workspace\\newjavaproject\\log4j.properties");
		Logger log = Logger.getLogger("GmailTest");
		
		WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);         //Implicit wait
		d.manage().window().maximize();
		log.info("browser is maximized");
		
		d.get("https://www.gmail.com");
		log.info("browser is opened");
		
		WebDriverWait wait = new WebDriverWait(d,60);                 // Explicit wait
		Thread.sleep(10000);
		WebElement username = d.findElement(By.xpath("//input[@id='identifierId']"));
		wait.until(ExpectedConditions.visibilityOf(username));
		
		username.sendKeys("rudra");
		Thread.sleep(3000);
		username.clear();
		log.info("clear method is working");
		
		Thread.sleep(3000);
		username.sendKeys("rudratejas@gmail.com");
		log.info("username is validate");

		
		WebElement next = d.findElement(By.xpath("//div[@id='identifierNext']"));
		next.click();
		log.info("butten is working");
		
		d.close();
		log.info("browser is closed");

	  }
}



/*o/p:-
2017-09-11 01:46:42 INFO  GmailTest:26 - browser is maximized
2017-09-11 01:46:44 INFO  GmailTest:29 - browser is opened
2017-09-11 01:46:58 INFO  GmailTest:39 - clear method is working
2017-09-11 01:47:01 INFO  GmailTest:43 - username is validate
2017-09-11 01:47:01 INFO  GmailTest:48 - butten is working
2017-09-11 01:47:01 INFO  GmailTest:51 - browser is closed

*/
