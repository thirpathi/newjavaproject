package com.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogin 
{
	public static void main(String[] args)
	{
		
		Logger log = Logger.getLogger("FacebookLogin");
		PropertyConfigurator.configure("log4j.properties");

		WebDriver d = new FirefoxDriver();
		log.info("firefox opened");
		
		d.manage().window().maximize();
		log.info("window maximize");

		d.get("https://www.facebook.com/");
		log.info("facebook site is opened");

		
		WebElement username = d.findElement(By.xpath("//input[@id='email']"));
		username.clear();
		username.sendKeys("9059995897");
		log.info("entered username is valid");

		
		WebElement password = d.findElement(By.xpath("//input[@id='pass']"));
		password.clear();
		password.sendKeys("8352794111");
		log.info("entered password is valid");

		
		WebElement login = d.findElement(By.xpath("//input[@type='submit']"));
		login.click();
		log.info("click on login button");


		
	}

}


/*o/p:-
2018-04-01 10:36:10 INFO  FacebookLogin:19 - firefox opened
2018-04-01 10:36:10 INFO  FacebookLogin:22 - window maximize
2018-04-01 10:36:12 INFO  FacebookLogin:25 - facebook site is opened
2018-04-01 10:36:12 INFO  FacebookLogin:31 - entered username is valid
2018-04-01 10:36:12 INFO  FacebookLogin:37 - entered password is valid
2018-04-01 10:36:20 INFO  FacebookLogin:42 - click on login button
*/
