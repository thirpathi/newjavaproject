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

public class MillionHighLight 
{
  public static void main(String[] args) throws InterruptedException, FindFailed, IOException 
   {
		
	System.setProperty("webdriver.gecko.driver","E:\\Batch230\\geckodriver.exe");	
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://www.millionclouds.com/");
	Thread.sleep(5000);

	//HighLight the Full screen and capture to save
	Screen s=new Screen();
	s.highlight(10,"blue");
	ScreenImage si=s.capture();
	BufferedImage bi=si.getImage();
	File f1=new File("E:\\batch230\\fullscreenHighLight.png");
	ImageIO.write(bi,"png",f1);
	Thread.sleep(5000);
	
	//HighLight the specific element and capture to save
	Match e = s.find("pngImages\\register.png");
	Region r=new Region(e.getX(),e.getY(),e.getW(),e.getH());
	r.highlight(10,"red");
	ScreenImage sri=s.capture(r);
	BufferedImage bri=sri.getImage();
	File f2=new File("E:\\batch230\\elementHighLight.png");
	ImageIO.write(bri,"png",f2);	
	Thread.sleep(5000);



	/*//HighLight the region and capture to save
	Region r=new Region(100,200,100,100);
	r.highlight(10,"red");
	ScreenImage sri=s.capture(r);
	BufferedImage bri=sri.getImage();
	File f2=new File("E:\\batch230\\regionHighLight.png");
	ImageIO.write(bri,"png",f2);	
	Thread.sleep(5000);
*/
	//Close site
	driver.close();

	}

}



/*o/p:-
             ok
    */