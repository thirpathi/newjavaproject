package com.aaaNotUnderstand;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Help {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("siri.sirisha.m@gmail.com");
	   // driver.findElement(By.xpath("//*[@id='email']")).sendKeys("siri.sirisha.m@gmail.com");
	    driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("141001410");
	   driver.findElement(By.id("loginbutton")).click();
	   Thread.sleep(4000);
	   
	   
	   
	   
	   
	   
	  /* 
	   driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
	   Actions a = new Actions(driver);
	   WebElement e = driver.findElement(By.xpath("//*[@class='_54nc']"));
	   a.moveToElement(e).build().perform();
	   a.doubleClick().build().perform();
	   
	   */
	   
	   
	  /* 
	   Thread.sleep(5000);
	  // driver.switchTo().alert().dismiss();
	   
	  Alert popup = driver.switchTo().alert();
		String text = popup.getText();
		Thread.sleep(2000);
		System.out.println(text);
		driver.switchTo().alert().accept();
		
	   */
	/*   
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[text()='Siri Guptha']"));
	  driver.findElement(By.xpath(".//*[text() ='Log Out']")).click();
*/


	}

	}


