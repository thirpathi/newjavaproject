package com.aaaNotUnderstand;                   //NOT UNDERSTAND

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Screen {
	
     static WebDriver d;
     public static void screenshot(String imageName) throws IOException 
     {
    	 File src = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile(src , new File("D:\\screen123453\\gmail.png"));
     }

    
     
     public static void main(String[] args) throws IOException   {
    	 try
    	 {    	 d = new FirefoxDriver();
     		 d.get("https://www.gmail.com");
     		 Thread.sleep(5000);
    		 d.findElement(By.xpath("//*[@id='identyfier']")).sendKeys("rudratejas@gmail.com");   // NOT WORKING why
    	 }
    	 catch(Exception e)
    	 {
    		 screenshot(e.getMessage());
    	 }
	}
}
