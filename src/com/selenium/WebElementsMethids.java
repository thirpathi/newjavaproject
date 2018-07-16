package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementsMethids 
{
	public static void main(String[] args) throws InterruptedException
	{

		 WebDriver d = new FirefoxDriver();
		 d.manage().window().maximize();
		 d.get("https://www.gmail.com");
		 
		 WebElement e = d.findElement(By.id("identifierId"));
		 Thread.sleep(3000);
		 Point p = e.getLocation();                                                                 //getLocation()
		 System.out.println(p.getX()+"..."+p.getY());         //getX(), getY() are methods
		 System.out.println(p.x+"....."+p.y);                // x , y are constant variablesS
		   
		/* Dimension d1 = e.getSize();                                                              //getSize()
		 System.out.println(d1.height+"..."+d1.width);
		 
		 String text = e.getText();                                                                 //getText()
		 System.out.println("text is:"+text);
		 */
		 
		//  String name = e.getAttribute("name");                                                      //getAttribute()
		 //System.out.println(name);
		 
		 String tagname = e.getTagName();                                                           //getTagName()
		 System.out.println(tagname);

		 boolean a = e.isDisplayed();                                                               //isDisplayed()
		 boolean b = e.isEnabled();                                                                 //isEnabled()
		 if (a&&b)
		 {
			 System.out.println("displayed and enabled");
		 }
		 else
		 {
			 System.out.println("not displayed and enabled");
		 }
		 
		 
		 
		/* 
	    WEBELEMENTS METHODS:---	
		 e.clear();
		 e.sendKeys(keysToSend);
		 e.click();
		 e.getSize();
		 e.getText();
		 e.getTagName();
		 e.getAttribute();
		 e.isDisplayed();
		 e.isEnabled();
		 e.isSelected();
		 e.getLocation();
		 
		 d.findElement(by);
		 d.findElements(by);
		 
		 */
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
	}

}
