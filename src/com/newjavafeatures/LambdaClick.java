package com.newjavafeatures;    //write a lambda expression to perform click operation (OUR OWN FUNCTIONAL INTERFACE)


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

/*
@FunctionalInterface
interface Check
{
	void click(WebElement e);
}


public class LambdaClick {
	public static void main(String[] args) 
	{
		
		
		Check c = e->{if (e.isDisplayed() && e.isEnabled())
			{
			e.click();
			}
		else
		{
			System.out.println("element not enabled");
		}
		}; 
		
		
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.gmail.com");
		WebElement e = d.findElement(By.xpath("//input[@id='identifierId']"));
		c.click(e);

	}

}
*/


@FunctionalInterface
interface G<T>
{
void vasu(WebElement e , String t);	
}


public class LambdaClick {
	public static void main(String[] args) throws InterruptedException 
	{
		G  g = (WebElement e , String t)->{if (e.isDisplayed() && e.isEnabled())
			{
			  e.click();
		      e.clear();
		      e.sendKeys("rudratejas");
			}
		else
		{
			System.out.println("element not enabled");
		}
		}; 
		
		
		FirefoxDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.gmail.com");
		Thread.sleep(5000);
		WebElement e = d.findElement(By.xpath("//input[@id='identifierId']"));
	    g.vasu(e, "rudratejas");
	    
	    d.close();

	}

}





