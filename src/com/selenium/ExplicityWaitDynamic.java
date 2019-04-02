package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWaitDynamic {
	
	
	//dynamic method to check wether that perticular element is present or not
	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();

	}
	
		public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
	       WebDriver d = new ChromeDriver();
		   d.manage().window().maximize();
		   d.manage().deleteAllCookies();
		   d.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		   d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   d.get("https://www.facebook.com"); 
		   
		   
		  // d.findElement(By.xpath("//*[@type='submit']")).click();
		   
		   WebElement e = d.findElement(By.id("u_0_9"));
		  // e.click();
		   
		   clickOn(d, e, 20);
		  /* 
		   clickOn(d, d.findElement(By.linkText("Create a Page")), 20);
		   
		  WebElement button =  d.findElement(By.xpath("//a[@role='button']"));
		  
		  if (button.isDisplayed() && button.isEnabled())
		  {
			  System.out.println("create page is succesfully opened");
		  }
		   
		  else
		  {
			  System.out.println("create page is not opened");
		  }*/
	}

}


/*o/p:-
OK 
It's working
*/