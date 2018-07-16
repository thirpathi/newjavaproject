package com.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartExample 
{
	public static void main(String[] args) throws InterruptedException 
	{
		    WebDriver driver = new FirefoxDriver();
		    driver.manage().window().maximize();
			driver.get("http://www.flipkart.com");
			
			//mouse move to element in a page
			WebElement e = driver.findElement(By.xpath("//span[text()='Electronics']"));
			Actions a = new Actions(driver);
			a.moveToElement(e).build().perform();
			a.doubleClick(e).build().perform();// click 
			
			Thread.sleep(5000);
			
			
						
			WebElement e3 = driver.findElement(By.xpath("//span[text()='Samsung']"));
			a.moveToElement(e3).build().perform();
			a.doubleClick(e3).build().perform();
			Thread.sleep(5000);
			
			/* WebElement e4 = driver.findElement(By.xpath("//div[@class='_1QaKk1']/select"));
			 e4.click();
			 e4.findElement(By.xpath("//option[@value='Min']/following-sibling::option[7]"));
			//e4.click();
			 
			 Thread.sleep(5000);

		/* WebElement e5 = driver.findElement(By.xpath("//div[@class='_3nSxeA']/select"));
			 e5.click();
			 e5.findElement(By.xpath("//option[@value='30000']")).click();
           */
     		/*Select s = new Select(driver.findElement(By.xpath("//select[@class='a_eCSK'][0]")));
			s.selectByVisibleText("7000");
			Thread.sleep(5000);

			Select s1 = new Select(driver.findElement(By.xpath("//select[@class='a_eCSK'][1]")));
			s1.selectByVisibleText("13000");*/

	         WebElement e6 = driver.findElement(By.xpath("//div[@class='_3wU53n' and text()='Samsung Galaxy J3 Pro (Gold, 16 GB)']"));
	         e6.click();

			
			
			
			
	}
     
}
