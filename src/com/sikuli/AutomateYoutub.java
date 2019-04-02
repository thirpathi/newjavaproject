package com.sikuli;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Button;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;


public class AutomateYoutub
{
	public static void main(String[] args) throws InterruptedException, FindFailed
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
			//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.name("search_query")).sendKeys("gangnam style");
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@title='PSY- Gangnam Style (Official Music Video)']")).click();
		Thread.sleep(5000);
		
		Screen s=new Screen();
		Location l=new Location(200,200);
		Thread.sleep(5000);
		
		if(s.exists("pngImages\\skipAdd.png")!=null)
		{
		s.click("pngImages\\skipAdd.png");
		}
		
		Thread.sleep(5000);
		//click pause
		s.wheel(l,Button.LEFT,0);
		s.click("pngImages\\pause1.png");
		Thread.sleep(5000);
		
		//click play
		s.wheel(l,Button.LEFT,0);
		s.click("pngImages\\play1.png");
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//*[@role='button']")).click();
		//Thread.sleep(3000);

		
		//decresing value
		s.wheel(l,Button.LEFT,0);
		s.mouseMove("pngImages\\volume.png");
		Match e=s.find("pngImages\\bar.png");
		Location el1=new Location(e.getX()-10,e.getY());
		s.dragDrop(e,el1);
		Thread.sleep(5000);
		
		//incresing value
		s.wheel(l,Button.LEFT,0);
		s.mouseMove("pngImages\\volume.png");
		Location el2=new Location(e.getX()+10,e.getY());
		s.dragDrop(e,el2);
		Thread.sleep(5000);
		
		
		
		/*
		Location l1=new Location(200,200);

		//fullscreen
		s.wheel(l1,Button.LEFT,0);
		s.click("pngImages\\fullscreen.png");
		Thread.sleep(5000);
		
		//click pause
		s.wheel(l1,Button.LEFT,0);
		s.click("pngImages\\pause1.png");
		Thread.sleep(5000);
		*/
		//driver.quit();
   }

}



/*o/p:-
ok
*/