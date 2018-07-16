package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWaitDynamic {
	
	
	//dynamic method to check wether that perticular element is present or not
	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();

	}
	
		public static void main(String[] args) throws InterruptedException {
		
		   WebDriver d = new FirefoxDriver();
		   d.manage().window().maximize();
		   d.manage().deleteAllCookies();
		   d.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		   d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   d.get("https://www.facebook.com"); 
		   Thread.sleep(3000);
		   
		   
		  // d.findElement(By.xpath("//*[@type='submit']")).click();
		   
		   WebElement e = d.findElement(By.xpath("//*[@type='submit']"));
		  // e.click();
		   
		   clickOn(d, e, 20);
		   
		   //clickOn(d, d.findElement(By.linkText("Create a Page")), 20);

		
	}

}
