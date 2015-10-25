package com.selenium.session4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class SelTestCase {

	WebDriver driver;
	@BeforeMethod()
	
	public void launchBrowser()
	{
		driver=new FirefoxDriver();
			
		}		
		
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
		driver.quit();
	}
}
