package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot
{
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();	
		d.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		d.get("https://www.gmail.com");
		
/*      File src = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("D:\\screen111\\gmail.png"));
*/        
		
		
        FileUtils.copyFile(((TakesScreenshot)d).getScreenshotAs(OutputType.FILE),new File("D:\\screen8777\\gmail.png"));
        Thread.sleep(5000);
        
        d.close();
        
        

	}

}


/*
o/p:-
        ok
*/