package com.aaaNotUnderstand;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotException {
	
	static WebDriver d;
	public static void screenshot(String imageName) throws IOException
	{
		 System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
		 d=new ChromeDriver();
		 TakesScreenshot ts= ((TakesScreenshot)d);
		 File src = ts.getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(src,new File("D:\\screen111\\+imageName.png"));
		  d.get("https://www.gmail.com");  

	}
	
	
	public static void main(String[] args) throws IOException {
		  
		  try {
			  d.findElement(By.xpath("//input[@id='identifier']")).sendKeys("tirupatiteja123@gmail.com");

		} catch (Exception e) 
		  {
			screenshot(e.getMessage());
		}
	}

}
