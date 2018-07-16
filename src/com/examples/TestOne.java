package com.examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestOne 
{
	public static void main(String[] args) 
	{
		
		WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(9000,TimeUnit.SECONDS);
		d.manage().deleteAllCookies();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/samsung-galaxy-nxt-black-16-gb/p/itmfyzyptzscnmkg?pid=MOBFYZYPVYFYNEZZ&fm=neo/merchandising&iid=M_d1a105ac-7b77-4114-9fbd-f4ad23eab4f9_1_6HJK5H34O1_MC.MOBFYZYPVYFYNEZZ&ppt=CLP&ppn=CLP:samsung-mobile-store&otracker=clp_pmu_v2_Latest+Samsung+mobiles+_3_samsu-categ-a3c72_Samsung+Galaxy+On+Nxt+%28Black%2C+16+GB%29_samsung-mobile-store_MOBFYZYPVYFYNEZZ_neo/merchandising_2&cid=MOBFYZYPVYFYNEZZ");
		
		
		
		
		
		
		//d.findElement(By.xpath("//*[@class='_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c']")).click();
		
		
		WebElement b = d.findElement(By.xpath("//*[@class='_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c']"));
		Actions a = new Actions(d);
		a.click(b).build().perform();
		
		
		
		
		
		System.out.println("test passed");
		
		
		
		
	}

}
