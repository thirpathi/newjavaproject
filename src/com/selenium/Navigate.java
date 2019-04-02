package com.selenium;             // How To Stimulate forward and backwadr :- By using navigate methods we can

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate
{
   public static void main(String[] args) throws InterruptedException 
	{
	  
	 // diff b/w get() & navigate() :- By using these two methods we can pass the url and open the application
	//but by using naviagte() we can open the External application.
	   
    // WebDriver d = new FirefoxDriver();
	 System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
     WebDriver d = new ChromeDriver();
     d.manage().window().maximize();
     d.manage().deleteAllCookies();
     d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
     
     d.get("https://www.gmail.com");
     Thread.sleep(5000);
     
     d.navigate().to("https://www.google.co.in");
     Thread.sleep(5000);
     
     d.navigate().back();
     Thread.sleep(5000);
     
     d.navigate().forward();
     Thread.sleep(5000);
     
     d.navigate().refresh();
     Thread.sleep(5000);
     
     d.close();
     
     
	}

}

/*o/p:-
           ok 
*/
