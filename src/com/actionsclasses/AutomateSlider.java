package com.actionsclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomateSlider 
{
	
	public static void main(String[] args) throws InterruptedException 
	 {
	 	
		WebDriver driver = new FirefoxDriver();

		driver.get("http://jqueryui.com/slider/");
		Thread.sleep(5000);
		
		//switch to frame
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		
        //Automate slider 
		WebElement e=driver.findElement(By.id("slider"));
        Actions a=new Actions(driver);
        a.dragAndDropBy(e, 50, 0).build().perform();
		Thread.sleep(5000);
        a.dragAndDropBy(e, -50, 0).build().perform();
		
        //close site
        driver.close();

	}
	
}
