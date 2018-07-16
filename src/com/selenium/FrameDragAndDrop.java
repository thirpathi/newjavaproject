package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameDragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		     // DRAG AND DROPEBLE
      WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		d.get("http://jqueryui.com/droppable/");
		
//		d.switchTo().frame(0);                		                    //switch to frame
		WebDriverWait wait = new WebDriverWait(d,60);                  // if frame is there then only it will switch to that frame
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
		
		WebElement e1=d.findElement(By.id("draggable"));              //perform drag and drop
		WebElement e2=d.findElement(By.id("droppable"));
        Actions a=new Actions(d);
        a.dragAndDrop(e1, e2).build().perform();
        d.close();

		
		
		
		         // ONLY DRAGGABLE
		
/*      WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		d.get("http://jqueryui.com/droppable/");
		
//		d.switchTo().frame(0);                		                    //switch to frame
		WebDriverWait wait = new WebDriverWait(d,60);                  // if frame is there then only it will switch to that frame
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
		
		WebElement e=d.findElement(By.id("draggable"));              //perform dragging page
        Actions a=new Actions(d);
        a.dragAndDropBy(e,125, 150).build().perform();
        d.close();
*/
		
		
	}

}
