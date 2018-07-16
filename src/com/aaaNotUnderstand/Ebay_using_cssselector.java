package com.aaaNotUnderstand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay_using_cssselector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*driver.get("https://ebay.com/");
		Thread.sleep(5000);
//registration:		
		driver.findElement(By.linkText("register")).click();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//img[@id='gh-logo']")).click();
	driver.findElement(By.xpath("//span[text()='Register']")).click();
		driver.findElement(By.xpath("//span[@class='gspr radio-on']")).click();
			driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("sree");
				driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("m");
						driver.findElement(By.xpath("//input[@id='email']")).sendKeys("siri.sirisha6979@gmail.com");
								driver.findElement(By.xpath("//input[@id='PASSWORD']")).sendKeys("Ms123456789");
								     driver.findElement(By.xpath("//div[@id='showPASSWORD']")).click();
										Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
		lector(".btn.btn-prim.btn-d")).click();
		Thread.sleep(5000);
		
		
		
		driver.findElement(By.cssSelector(".fld.wide.wide.fld")).sendKeys("sai");
		driver.findElement(By.cssSelector(".fld.wide.wide.fld")).sendKeys("m");
		driver.findElement(By.cssSelector(".wide.fld")).sendKeys("siri.sirisha.m@gmail.com");
		driver.findElement(By.cssSelector(".re-w3.wide.wide.fld")).sendKeys("sai123456");
       //to select checkbox:
		driver.findElement(By.cssSelector("div[id='showPASSWORD']")).click();
		driver.findElement(By.cssSe
		
		
		*/
		
		driver.get("https://abhibus.com/");
		Thread.sleep(5000);
//login details:
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.linkText("Log In / Register")).click();
		driver.findElement(By.cssSelector("input#EmailID")).sendKeys("siri.sirisha.m@gmail.com");
		driver.findElement(By.cssSelector("#LoginPassword")).sendKeys("141001410");
		driver.findElement(By.cssSelector("#SignINAjx")).click();
		Thread.sleep(5000);
		
		
		
		
		
		
		



	
	}

}
