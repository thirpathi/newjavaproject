package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RediffTest {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
	/*	driver.get("http://www.rediff.com");
		Thread.sleep(5000);
		
		
		WebElement logo = driver.findElement(By.xpath("//*[@id='redifflogo']"));
		flag = logo.isDisplayed();
		
        //Automate slider 
		WebElement e=driver.findElement(By.linkText("Sign in"));
        Actions a=new Actions(driver);
        a.click(e).build().perform();
		Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id = 'login1']")).sendKeys("India123");
        driver.findElement(By.xpath("//*[@id = 'password']")).sendKeys("");

        driver.findElement(By.xpath("//*[@type = 'submit']")).click();

		driver.findElement(By.linkText("Create a Rediffmail account")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("sirisha");
		//driver.switchTo().activeElement().sendKeys(Keys.TAB);
		//Thread.sleep(5000);

		driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("sirisham@gmail.com");
		
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("sree123456");
		driver.findElement(By.xpath("(//*[@type='password'])[2]")).sendKeys("sree123456");

		driver.findElement(By.xpath("(//*[@type='text'])[3]")).sendKeys("tiru.sree.siri@gmail.com");
		
		driver.findElement(By.xpath("//*[@type='checkbox']")).click();;

        */
		
		
		
		
		driver.get("https://www.kmart.com");
		Thread.sleep(1000);
		
					//to move mouse on home tab key:
        WebElement home = driver.findElement(By.xpath(".//*[@id='gnf_dept_tree_item_7']/span/a[href='/home/b-1348460928' or text()='Home']"));
		Actions a = new Actions(driver);
		a.moveToElement(home).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='gnf_dept_tree_item_7_1_1']/span/a[text()='close']")).click();
				//to move moouse on kichen tab
		Thread.sleep(1000);
		WebElement kitchen = driver.findElement(By.xpath(".//*[@id='gnf_dept_tree_item_7_1_1']/span/a[text()='close']"));
		Actions k = new Actions(driver);
		k.moveToElement(kitchen).build().perform();
		//Thread.sleep(3000);
		k.doubleClick(kitchen);
		
		Thread.sleep(1000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
        
	}
	

}
