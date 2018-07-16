package com.generics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllElementsInFacebook {

	public static void main(String[] args) {
		
		  WebDriver d= new FirefoxDriver();
		  d.manage().window().maximize();
		  d.get("https://www.facebook.com");
		  
		  List<WebElement> radio = d.findElements(By.xpath("//*[@type='radio']"));
		  System.out.println("total radio buttons: " +radio.size());
		  
		  
		
	}
}
