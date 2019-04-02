package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailTest
  {
	
    public static void main(String[] args) throws InterruptedException, AWTException
       {
	  
	PropertyConfigurator.configure("D:\\rameshsoft\\workspace\\newjavaproject\\log4j.properties");
	Logger log = Logger.getLogger("GmailTest");
    //Logger log = Logger.getLogger("GmailTest");
	 System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
     WebDriver d = new ChromeDriver();
	//WebDriver d = new FirefoxDriver();
	d.manage().timeouts().implicitlyWait(9000,TimeUnit.SECONDS);
	
	d.manage().window().maximize();
	d.get("https://www.gmail.com");
	log.info("browser is opend");
	
	WebDriverWait wait = new WebDriverWait(d,60000);
	Thread.sleep(10000);
	WebElement username = d.findElement(By.xpath("//input[@id='identifierId']"));
	wait.until(ExpectedConditions.visibilityOf(username));
	
	username.clear();
	username.sendKeys("rudratejas@gmail.com");
	log.info("username is validate");

	
	WebElement next = d.findElement(By.xpath("//div[@id='identifierNext']"));
	next.click();
	log.info("butten is working");

	
	
	WebElement password = d.findElement(By.xpath("//input[@name='password']"));
	password.clear();
	password.sendKeys("8352794111");
	log.info("password is validate");

	
	WebElement signin = d.findElement(By.xpath("//div[@id='passwordNext']"));
	signin.click();
	log.info("butten is working");

	
	//Thread.sleep(5000);
	WebDriverWait wait1 = new WebDriverWait(d,60);
	WebElement compose = d.findElement(By.xpath("//*[text()='COMPOSE']"));
	wait1.until(ExpectedConditions.visibilityOf(compose));
	compose.click();
	
	WebElement to = d.findElement(By.name("to"));
	to.sendKeys("thirurudra6@gmail.com");
	
	WebElement subject = d.findElement(By.name("subjectbox"));
	subject.sendKeys("class");
	
	 d.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Hi sir",Keys.ENTER,"How r u",Keys.ENTER,"Bye sir");
	    d.findElement(By.xpath("//*[@data-tooltip='Attach files']/descendant::*[3]")).click();
		Thread.sleep(5000);
		// attach file
		StringSelection s = new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\Tulips.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Robot r=new Robot();
		if(System.getProperty("os.name").contains("Window"))
		{
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(5000);
		}
		else if(System.getProperty("os.name").contains("Mac"))
		{
			r.keyPress(KeyEvent.VK_META);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_META);
			Thread.sleep(5000);
		}
		else if(System.getProperty("os.name").contains("Linux"))
		{
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(5000);
		}
		else
		{
			System.out.println("unknown platform");
			System.exit(0);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(20000);

		d.findElement(By.xpath("//*[text()='Send']")).click();
		Thread.sleep(5000);
		
		//get output message
		
		String x =d.findElement(By.xpath("//*[@role='alert']/descendant::*[3]")).getText();
		System.out.println(x);
		
		//do logout
		d.findElement(By.xpath("//*[contains(@title,'Account')]/child::*[1]")).click();
		Thread.sleep(5000);
		d.findElement(By.linkText("Sign out")).click();
		Thread.sleep(5000);
		
		//close site
		d.quit();
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

		
      }
  
}
