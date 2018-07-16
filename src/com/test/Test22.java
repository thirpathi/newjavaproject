package com.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aaaNotUnderstand.DriverSetUp;

public class Test22 extends DriverSetUp
{
	public static WebDriver d;
	
	Test22()
	{
		super();
	}
	
	public void method() throws InterruptedException 
	{
	    d=new ChromeDriver();
	    d.get("http://www.gmail.com");
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor) d;
		js.executeScript("alert('Hi');");
		Thread.sleep(5000);
		d.switchTo().alert().accept();
		Thread.sleep(5000);
		
		/*js.executeScript("document.getElementsByName('Email')[0].setAttribute('disabled','');");
		Thread.sleep(5000);
		js.executeScript("document.getElementsByName('Email')[0].removeAttribute('disabled');");
		Thread.sleep(5000);
		js.executeScript("document.getElementsByName('Email')[0].value='mindq';");
*/	
	    d.close();
	}
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		Test22 t = new Test22();
		t.method();
		
	}
}



