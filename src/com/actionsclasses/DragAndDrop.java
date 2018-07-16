package com.actionsclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new FirefoxDriver();
		
        //perform drag and drop
        driver.get("http://jqueryui.com/droppable/");
        Thread.sleep(5000);
        
        //switch to frame
        driver.switchTo().frame(0);
        Thread.sleep(5000);
        
        //perform drag and drop
        WebElement e1=driver.findElement(By.id("draggable"));
        WebElement e2=driver.findElement(By.id("droppable"));
        Actions a=new Actions(driver);
        a.dragAndDrop(e1, e2).build().perform();
        
        //switch to back page
       // driver.switchTo().defaultContent();
        
        //close site
        driver.close();

		
	}

}
