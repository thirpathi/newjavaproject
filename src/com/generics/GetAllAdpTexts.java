package com.generics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAllAdpTexts {
	
	public static void main(String[] args) {
		
		  WebDriver d= new FirefoxDriver();
		  d.manage().window().maximize();
		  d.get("https://www.adp.com");
		  
		  List<WebElement> ADPtxt = d.findElements(By.xpath("//*[contains(text(),'ADP')]"));
		  System.out.println("ADP IS :"+ ADPtxt.size());
		  
		  List<WebElement> adptxt = d.findElements(By.xpath("//*[contains(text(),'adp')]"));
		  System.out.println("adp is :"+ adptxt.size());
		
		  List<WebElement> ADPtxtadp = d.findElements(By.xpath("//*[contains(text(),'ADP') AND contains(text(),'adp')]"));
		  System.out.println("TOTAL :"+ ADPtxtadp.size());
		  
		  
		  d.close();
		
	}
}


/*o/p:-
ADP IS :78
adp is :3
TOTAL :81
*/