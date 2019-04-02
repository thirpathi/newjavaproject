package com.javarobot;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Calculator 
{
	public static void main(String[] args) throws InterruptedException, IOException, AWTException, HeadlessException, UnsupportedFlavorException
     {
        //lounch calculator
		Runtime.getRuntime().exec("calc.exe");
		Thread.sleep(5000);
		
		//send input1 to calculator sreen
		StringSelection x=new StringSelection("500");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x, null);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(5000);
		
		
		//click+
		r.keyPress(KeyEvent.VK_ADD);
		r.keyRelease(KeyEvent.VK_ADD);
		Thread.sleep(5000);
		
		//send input2 to calculator
		StringSelection y=new StringSelection("500");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(y, null);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		
		
		//multiply
		r.keyPress(KeyEvent.VK_MULTIPLY);
		r.keyRelease(KeyEvent.VK_MULTIPLY);
		Thread.sleep(5000);
		
	    //send input3 to calculator
	    StringSelection w=new StringSelection("2");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(w, null);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
						
		
		//click=
		r.keyPress(KeyEvent.VK_EQUALS);
		r.keyRelease(KeyEvent.VK_EQUALS);
		Thread.sleep(5000);
		
		//Get output from screen
		r.keyPress(KeyEvent.VK_CONTEXT_MENU);
		r.keyRelease(KeyEvent.VK_CONTEXT_MENU);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		//Print OutPut
		String z=(String)Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		System.out.println(z);
		
		//close calculator
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_ALT);

	}

}
//OUTPUT:2000
	
	
	
	
	
	
	


