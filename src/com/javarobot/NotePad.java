package com.javarobot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class NotePad 
{
	public static void main(String[] args) throws InterruptedException, IOException, AWTException 
	    {
		        //lounch notepad
				Runtime.getRuntime().exec("notepad.exe");
				Thread.sleep(5000);
				
				//send input1 to notepad sreen
				StringSelection s1=new StringSelection("I Love U Darling throws 112200 ");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
				
				Robot r=new Robot();
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(5000);
				
				//close save options
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_S);
				r.keyRelease(KeyEvent.VK_S);
				r.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(5000);
				
				//save file
				StringSelection s2=new StringSelection("E:\\batch230\\myself000000000012.txt");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s2, null);
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_V);
				r.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(5000);
				
				//click save
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(5000);
				
				
				//To shift YES---TAB
				r.keyPress(KeyEvent.VK_TAB);
				r.keyRelease(KeyEvent.VK_TAB);
				Thread.sleep(5000);


				//click ENTER
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(5000);
				
			
				//close notepad
				r.keyPress(KeyEvent.VK_ALT);
				r.keyPress(KeyEvent.VK_F4);
				r.keyRelease(KeyEvent.VK_F4);
				r.keyRelease(KeyEvent.VK_ALT);
				
				
	        }
     }
//output ok

