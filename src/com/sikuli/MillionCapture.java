package com.sikuli;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;

public class MillionCapture
{
	public static void main(String[] args) throws InterruptedException, IOException, FindFailed 
	{
		System.setProperty("webdriver.gecko.driver","E:\\Batch230\\geckodriver.exe");	
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.millionclouds.com/");
		Thread.sleep(5000);
		
		//Get full screen capture and save
		Screen s=new Screen();
		ScreenImage si=s.capture();
		BufferedImage bi=si.getImage();
		File f1=new File("E:\\Batch230\\fullscreencapture1.png");
		ImageIO.write(bi,"png",f1);	
		Thread.sleep(5000);

		
		//Get specific element capture and save
		Match e = s.find("pngImages\\register.png");
		Region r = new Region(e.getX(),e.getY(),e.getW(),e.getH());
		ScreenImage sri = s.capture(r);
		BufferedImage bri=sri.getImage();
		File f2=new File("E:\\Batch230\\elementcapture1.png");
		ImageIO.write(bri,"png",f2);
		Thread.sleep(5000);
		
		
		
	/*	//Get region of screen capture and save
		Region r=new Region(100,200,100,100);
		ScreenImage sri=s.capture(r);
		BufferedImage bri=sri.getImage();
		File f2=new File("E:\\Batch230\\regioncapture1.png");
		ImageIO.write(bri,"png",f2);
		Thread.sleep(5000);
*/
		driver.quit();
	}
}


/*
o/p:-
       ok
*/