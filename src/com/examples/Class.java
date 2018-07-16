package com.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class {
	
	

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Batch230\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
		Thread.sleep(5000);
		
		//click create account link
		/*driver.findElement(By.partialLinkText("Create account")).click();
		Thread.sleep(5000);*/
		
		//fill fields
		driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("gopinayaki");
		driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys("SDETE000");
		driver.findElement(By.xpath("//*[@name='Username']")).sendKeys("selebatch22222");
		driver.findElement(By.xpath("//*[@name='Passwd']")).sendKeys("batch10am");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("batch10am");
		Thread.sleep(5000);
		//select month developed by div tag
		WebElement e = driver.findElement(By.xpath("//*[@title='Birthday']"));
		Actions a = new Actions(driver);
		a.click(e).build().perform();
		Thread.sleep(5000);
		a.sendKeys("Jul").build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.ENTER).build().perform();
		//fill remaining fields
		driver.findElement(By.name("BirthDay")).sendKeys("1");
		driver.findElement(By.name("BirthYear")).sendKeys("1990");
		
		//select gender developed using div tag
		WebElement e1 = driver.findElement(By.xpath("//*[@title='Gender']"));
		a.click(e1).build().perform();
		Thread.sleep(5000);
		a.sendKeys("M").build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.ENTER).build().perform();
		
		//select country developped using div tag
		
		WebElement e2 = driver.findElement(By.xpath("//*[@title='Mobile phone']"));
		a.click(e2).build().perform();
		Thread.sleep(5000);
		a.sendKeys("I").build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		
		//fill further fields
		driver.findElement(By.name("RecoveryPhoneNumber")).sendKeys("7097586790");
		driver.findElement(By.name("RecoveryEmailAddress")).sendKeys("paraselliravi@gmail.com");
		driver.findElement(By.name("submitbutton")).click();
		Thread.sleep(5000);
		
		//scroll terms element and click iAgree button
		for(int i=0;i<=20;i++)
		{
			a.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(1000);
		}
		driver.switchTo().defaultContent();
		driver.findElement(By.name("iagreebutton")).click();
		Thread.sleep(5000);
		
		//close site
		driver.close();
		

	}

}
