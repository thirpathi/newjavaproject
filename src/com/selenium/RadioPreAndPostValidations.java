package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioPreAndPostValidations
{
	public static void main(String[] args) throws InterruptedException
	{
		 WebDriver d= new FirefoxDriver();
		  d.manage().window().maximize();
		  d.get("https://www.facebook.com");
		  
		  Thread.sleep(3000);
		 // WebDriverWait wait = new WebDriverWait(d,60);
		  WebElement radio = d.findElement(By.id("u_0_b"));	
		 // wait.until(ExpectedConditions.visibilityOf(radio));
		 //radio.click();
	    if(radio.isDisplayed() && radio.isEnabled())                  // PRE-VALIDATIONS
		  {
			  radio.click();
	     
		  String typevalue = radio.getAttribute("type");                //POST-VALIDATIONS
		  if (typevalue.equalsIgnoreCase("radio"))
		  {
			  if(radio.isSelected())
			  {
				  System.out.println("redio button is selected ");
			  }
			  else
			  {
				  System.out.println("redio button is not selected");
			  }
		  }
		  }
	    	  
		  
		  
		 // Thread.sleep(3000);
		 d.quit();
		 
	}

}
