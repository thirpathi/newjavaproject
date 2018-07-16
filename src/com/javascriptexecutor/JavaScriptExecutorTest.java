package com.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutorTest 
{

   public static void main(String[] args) 
      {
	WebDriver d = new FirefoxDriver();
	d.manage().window().maximize();
	d.get("https://www.gmail.com");
	
	JavascriptExecutor js = (JavascriptExecutor)d;
	
	//js.executeScript("document.getElementById('identifierId').value='rameshsoftselenium';" );
	//js.executeScript("document.getElementById('identifierNext').click;" );
	
   //                             OR
	
    WebElement username = d.findElement(By.xpath("//input[@id='identifierId']"));
    js.executeScript("arguments[0].value='rudratejas@gmail.com';", username);
    
    WebElement e = d.findElement(By.xpath("//*[@id='identifierNext']"));
    js.executeScript("arguments[0].click();", e);
   
   
     }
}

 

/* o/p:-
   it's working

 */