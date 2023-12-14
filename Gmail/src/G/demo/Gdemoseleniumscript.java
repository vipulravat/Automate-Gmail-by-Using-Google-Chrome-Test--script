package G.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Gdemoseleniumscript {

		public static void main(String[] args) throws InterruptedException {
			
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vipsr\\selenium webdriver\\ChromeDriver\\chromedriver.exe");
		
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(options);
			
			driver.get("https://www.gmail.com/");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.id("identifierId")).sendKeys("vipulravat787@gmail.com");
			
			Thread.sleep(3000);
			driver.findElement(By.className("F9NWFb")).click();
			Thread.sleep(3000);
			
			String at = driver.getTitle();
		    String et = "gmail";
		    
		    
		    if(at.equalsIgnoreCase(et))
		    {
		     System.out.print("successful");
		    }
		    else
		    {
		    	System.out.print("fail");
		    }
		}
		    }