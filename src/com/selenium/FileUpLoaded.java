package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpLoaded {
	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new FirefoxDriver();

        driver.get("http://demo.guru99.com/selenium/upload/");
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
        Thread.sleep(5000);

        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("C:\\newhtml.html");
        Thread.sleep(5000);


        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();
        Thread.sleep(5000);


        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
        Thread.sleep(5000);

        
        driver.close();

		
	}

}
