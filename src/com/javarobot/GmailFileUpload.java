package com.javarobot;
                                              // gmail [WINDOW POPUP]   "Java Robot"
                
    import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

  public class GmailFileUpload 
    {
		public static void main(String[] args) throws InterruptedException, AWTException
		{ 
			
		    WebDriver driver = new FirefoxDriver();
		    driver.manage().window().maximize();
		   
			//launch application
			driver.get("https://www.gmail.com");
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("#identifierId")).sendKeys("rudratejas@gmail.com");
			driver.findElement(By.cssSelector("#identifierNext")).click();
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("input[name='password']")).sendKeys("8352794111");
			driver.findElement(By.cssSelector("#passwordNext")).click();
			
			
	        // explicit wait - to wait for the compose button to be click-able
			WebDriverWait wait = new WebDriverWait(driver,30);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
		    // click on the compose button as soon as the "compose" button is visible
		    driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
		     
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//*[text()='COMPOSE']")).click();
		    
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@name='to']")).sendKeys("thirurudra6@gmail.com");
			driver.findElement(By.name("subjectbox")).sendKeys("wishes");
		    driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Hi sir",Keys.ENTER,"How r u",Keys.ENTER,"Bye sir");
		    
		    
		    driver.findElement(By.xpath("//*[@data-tooltip='Attach files']/descendant::*[3]")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Tulips.jpg");
		    
		    
		    
		 /* driver.findElement(By.xpath("//*[@data-tooltip='Attach files']/descendant::*[3]")).click();
			Thread.sleep(5000);
			// attach file
			StringSelection s = new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\Tulips.jpg");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
			Robot r=new Robot();
			if(System.getProperty("os.name").contains("Window"))
			{
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(5000);
			}
			else if(System.getProperty("os.name").contains("Mac"))
			{
				r.keyPress(KeyEvent.VK_META);
				r.keyPress(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_META);
				Thread.sleep(5000);
			}
			else if(System.getProperty("os.name").contains("Linux"))
			{
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(5000);
			}
			else
			{
				System.out.println("unknown platform");
				System.exit(0);
			}
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(20000);
*/
			driver.findElement(By.xpath("//*[text()='Send']")).click();
			Thread.sleep(5000);
			
			//get output message
			String x =driver.findElement(By.xpath("//*[@role='alert']/descendant::*[3]")).getText();
			System.out.println(x);
			
			//do logout
			driver.findElement(By.xpath("//*[contains(@title,'Account')]/child::*[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.linkText("Sign out")).click();
			Thread.sleep(5000);
			
			//close site
			driver.close();
		}

	}


	// output: Your message has been sent. View message (with attche files)
