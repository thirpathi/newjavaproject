package com.practice;                                  //automation-practice-form

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeFormWithXpath 
{
	public static void main(String[] args) throws InterruptedException
{
		
		PropertyConfigurator.configure("D:\\rameshsoft\\workspace\\newjavaproject\\log4j.properties");
		Logger log = Logger.getLogger("GmailTest");
		
		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		//WebDriver d = new FirefoxDriver();
		
		JavascriptExecutor js = (JavascriptExecutor)d;
		d.manage().window().maximize();
		log.info("1 browser is maximized");
		
		d.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		d.get("http://toolsqa.com/automation-practice-form/");
		log.info("2 site is opened");

		WebElement firstname = d.findElement(By.xpath("//input[@name='firstname']"));
		firstname.clear();
		firstname.sendKeys("THIRUPATHI");
		log.info("3 first name is working");

		WebElement lastname = d.findElement(By.xpath("//input[@name='lastname']"));
		lastname.clear();
		lastname.sendKeys("BOLISHETTI");
		log.info("4 last name is working");

		 WebElement male = d.findElement(By.xpath("//input[@id='sex-0']"));
		 js.executeScript("arguments[0].click();", male);
		log.info("5 male button is working");
		/*WebElement male = d.findElement(By.xpath("//input[@id='sex-0']"));
		male.click();
*/
		 WebElement exp = d.findElement(By.xpath("//input[@id='exp-3']"));
		 js.executeScript("arguments[0].click();", exp); 
		log.info("6 exp button is working");
		/*WebElement exp = d.findElement(By.xpath("//input[@id='exp-3']"));
		exp.click();
*/
		 WebElement prof = d.findElement(By.xpath("//input[@id='profession-1']"));
		 js.executeScript("arguments[0].click();", prof);
		log.info("7 prof button is working");
/*  	WebElement prof = d.findElement(By.xpath("//input[@id='profession-1']"));
	    prof.click();
*/
		 WebElement tool = d.findElement(By.xpath("//input[@id='tool-2']"));
		 js.executeScript("arguments[0].click();", tool);
		log.info("8 tool button is working");
/*      WebElement tool = d.findElement(By.xpath("//input[@id='tool-2']"));
		tool.click();
*/
		WebElement date = d.findElement(By.xpath("//input[@id='datepicker']"));
		date.clear();
		date.sendKeys("12-10-2017");
		log.info("9 date button is working");
		
		 WebElement sel = d.findElement(By.xpath("//select[@id='continents']"));
		 js.executeScript("arguments[0].click();", sel);
		log.info("10 sel button is working");

/*      WebElement sel = d.findElement(By.xpath("//select[@id='continents']"));
		sel.click();
*/
		WebElement aus = d.findElement(By.xpath("//option[text()='Australia']"));
		aus.click();
		log.info("11 aus button is working");
		
		Thread.sleep(10000);
		
		//d.close();
		log.info("driver is closed");

    }
	
}



/*o/p:-
                ok
*/