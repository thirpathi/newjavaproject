package com.practice;

	
	
	
	
	
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class Registration {

		public static void main(String[] args) throws InterruptedException {		
		//System.setProperty("webdriver.gecko.driver", "G:\\DAILYPROGRAMS\\WEBDRIVERS\\geckodriver.exe");		
		//WebDriver driver = new FirefoxDriver();
			System.setProperty("webdriver.chrome.driver","D:\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Register.html");
			driver.manage().window().maximize();
			Thread.sleep(3000);
	//close subscribe window:
			driver.findElement(By.xpath("//h2[text()='Register']")).click();
			driver.findElement(By.xpath("//label[text()='Full Name* ']")).click();		
			driver.findElement(By.xpath("//input[@type='text'][@placeholder='First Name']")).sendKeys("sree");
			driver.findElement(By.xpath("//input[@type='text'][@placeholder='Last Name']")).sendKeys("m");		
			driver.findElement(By.xpath("//textarea[@ng-model = 'Adress']")).sendKeys("123456");
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ritu.sree.siri@gmail.com");
			driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("7386547639");
			driver.findElement(By.xpath("//input[@name='radiooptions']")).click();	
			driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
			driver.findElement(By.cssSelector("div#msdd")).click();
			//driver.findElement(By.xpath("//a[contains(text(),'English')]"));
	// select the skill option:	
			driver.findElement(By.xpath("//*[@id='Skills']")).click();
			Select s = new Select(driver.findElement(By.name("Skills")));
			s.selectByValue("SQL");
	//country:
			driver.findElement(By.xpath("//select[@id='countries']")).click();
			Select c = new Select (driver.findElement(By.name("country")));
			c.selectByVisibleText("India");	
	//select country:
			driver.findElement(By.xpath("//span[text()='India']")).click();
	//select date of birth:
			Select y = new Select(driver.findElement(By.name("yearbox")));
			y.selectByVisibleText("1981");
	//select date of month:	
			Select m =new Select (driver.findElement(By.name("monthbox")));
			m.selectByVisibleText("September");
	//select date of day:	
			Select d = new Select (driver.findElement(By.name("daybox")));
			d.selectByVisibleText("6");		
			driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("123456789");
			driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("123456789");
															
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		

		
			
		}

	}

