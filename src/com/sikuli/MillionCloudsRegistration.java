package com.sikuli;

import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Button;
import org.sikuli.script.Screen;

public class MillionCloudsRegistration
{
	

	public static void main(String[] args)  throws Exception{ 
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.millionclouds.com");
		Thread.sleep(5000);
		
		//perform registration(sikulix)
		Screen s=new Screen();
		if(s.exists("pngImages\\register.png")!=null)
		{
	    s.click("pngImages\\register.png");
	    Thread.sleep(5000);
		}
		else
		{
		System.exit(0);	
		}
		
		//fill fields(sikulix)
		s.type("pngImages\\email.png","kalam143@gmail.com");
		Thread.sleep(5000);
		s.type("pngImages\\retypeemail.png","kalam143@gmail.com");
		Thread.sleep(5000);
		s.type("pngImages\\password.png","kalamsir111");
		Thread.sleep(5000);
		s.type("pngImages\\retypepassword.png","kalamsir111");
		Thread.sleep(5000);
		s.click("pngImages\\signup.png");
		Thread.sleep(5000);
		s.wheel(Button.WHEEL_DOWN,8);     // '5' is a maximum size
		Thread.sleep(5000);
		s.click("pngImages\\ok.png");
		Thread.sleep(5000);
		
		//close site(SWD)
		driver.quit();
		
	}
}


/*o/p:-
         ok
*/