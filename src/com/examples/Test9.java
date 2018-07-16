package com.examples;                     // way2sms

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test9 {

	
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\Batch230\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//launch application
		driver.get("http://site24.way2sms.com/content/index.html");
		Thread.sleep(5000);
		
		//fill fields
		driver.findElement(By.name("username")).sendKeys("9553253836");
		driver.findElement(By.name("password")).sendKeys("c6928t");
		driver.findElement(By.id("loginBTN")).click();
		Thread.sleep(5000);
		
		//skip for email verification
		
		//driver.findElement(By.xpath("//Input[@value='Skip']")).click();
		//Thread.sleep(5000);
		
		//click on send free sms button
		
		//driver.findElement(By.xpath("//Input[@value='Send Free SMS']")).click();
		//Thread.sleep(5000);
		
		//click on send sms button
		
		//driver.findElement(By.id("sendSMS")).click();
		driver.findElement(By.xpath("//a[text()='Send SMS']")).click();
		Thread.sleep(5000);
		
		// switching to frame and filling fields
		driver.switchTo().frame("frame");
		driver.findElement(By.name("mobile")).sendKeys("8501865735");
		driver.findElement(By.name("message")).sendKeys("Hi -->gudmorning");
		driver.findElement(By.name("Send")).click();
		Thread.sleep(5000);
		//switch to frame and get message
		/*String x = driver.findElement(By.xpath("//div[@class='wrap MES']/descendant::span[6]")).getText();
		System.out.println(x);
	*/	
		//do logout
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@class='out louti']")).click();
		Thread.sleep(5000);
		//close site
		driver.quit();

	}

}
// output: Message has been submitted successfully.
