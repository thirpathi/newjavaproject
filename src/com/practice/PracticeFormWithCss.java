package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeFormWithCss
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		//WebDriver d = new FirefoxDriver();
		
		d.manage().window().maximize();
		d.get("http://toolsqa.com/automation-practice-form/");
		
		WebElement username = d.findElement(By.cssSelector("input[name='firstname']"));
		username.clear();
		username.sendKeys("THIRUPATHI");
		
		WebElement lastname = d.findElement(By.cssSelector("input[name='lastname']"));
		lastname.clear();
		lastname.sendKeys("BOLISHETTI");
	
		WebElement male = d.findElement(By.cssSelector("*[id='sex-0']"));
		male.click();
		
		WebElement exp = d.findElement(By.cssSelector("*[id='exp-3']"));
		exp.click();

		WebElement prof = d.findElement(By.cssSelector("*[id='profession-1']"));
		prof.click();
		
		WebElement tool = d.findElement(By.cssSelector("input[id='tool-2']"));
		tool.click();
		
		WebElement date = d.findElement(By.cssSelector("input[id='datepicker']"));
		date.clear();
		date.sendKeys("15-08-2017");
		
		WebElement sel = d.findElement(By.cssSelector("select[id='continents']"));
		sel.click();
		
		/*WebElement aus = d.findElement(By.cssSelector("option[text()='Australia']"));
		aus.click();*/
		
		
		Select s = new Select(d.findElement(By.cssSelector("select[id='continents']")));
		s.selectByVisibleText("Australia");
		//d.close();

	}


	
}
