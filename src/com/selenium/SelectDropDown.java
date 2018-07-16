package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver d= new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com");
		
		WebElement day = d.findElement(By.xpath("//*[@id='day']"));
		Select s = new Select(day);
		
		//boolean b = s.isMultiple();
		if (s.isMultiple())
		{
			System.out.println("it is multiple select dropdown");
		}
		else
		{
		  System.out.println("it is single select dropdown");
		}

		String tagName = day.getTagName();
		System.out.println("tagname:" +tagName);
		 if (tagName.equalsIgnoreCase("select"))
		 {
			
			 s.selectByIndex(26);
			 Thread.sleep(5000);
			 s.selectByIndex(16);
			 Thread.sleep(5000);
			 s.selectByIndex(12);
			 Thread.sleep(5000);
			 WebElement element = s.getFirstSelectedOption();    //which one is above the code that will be working 
			 System.out.println(element.getText());
			 Thread.sleep(5000);
			
			 //s.selectByVisibleText("26");
		 }
		 else
		 {
			 d.findElement(By.xpath("//*[id='day']/option[6]")).click();
		 }
		 
		 Thread.sleep(5000);
		 d.close();

		
	}

}


/*o/p:-
it is single select dropdown
tagname:select
26*/