package com.selenium;                //GmailTestValidations                      

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTestValidations 
{

   public static void main(String[] args) throws InterruptedException 
	{
	   WebDriver d = new FirefoxDriver();
	   d.manage().window().maximize();
	   d.manage().deleteAllCookies();
	   d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   d.get("https://www.gmail.com");   
	   /*String atualTitle = d.getTitle();
	   String expectedTitle = "Gmail";
	   */   

	// gmail page is opend or not
	  WebElement emailorphTxt = d.findElement(By.xpath("//input[@id='identifierIdNext']"));
	    if (emailorphTxt.isDisplayed())
	    {
	      System.out.println("gmail page is opend");
	    }
	    
	    if (emailorphTxt.isDisplayed() && emailorphTxt.isEnabled())
	    {
	    	emailorphTxt.clear();
	    	emailorphTxt.sendKeys("rudratejas@gmail.com");
	    }
	    else
	    {
	    	System.out.println("email or phone not enabled");
	    }
	    
	    
      WebElement emailorphNextBtn = d.findElement(By.xpath("//*[@id='identifierNext']"));
		 if (emailorphNextBtn.isDisplayed() && emailorphNextBtn.isEnabled())
		 {
			 emailorphNextBtn.click();
		 }
		 else
		 {
			 System.out.println("emailorphNextBtn is not enabled");
		 }
		 
		 Thread.sleep(5000);
		 
      WebElement profileIdentifierTxt = d.findElement(By.xpath("//div[@id='profileIdentifier']"));
        if(profileIdentifierTxt.isDisplayed() && profileIdentifierTxt.isEnabled())
        {
        	String emailText = profileIdentifierTxt.getText();
        if (emailText.equalsIgnoreCase("rudratejas@gmail.com"))
        {
        	System.out.println("our entered gmail is currect");
        }
        else
		 {
			 System.out.println("our entered gmail is  not currect");
		 }
        
        }
        
        
        
	    else
	    {
	    	System.out.println(" gmail page is not opend");
	    }
	   
	}

}





/*o/p:-
gmail page is opend
our entered gmail is currect
*/