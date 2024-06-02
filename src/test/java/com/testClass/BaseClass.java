package com.testClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import com.UtilitiesClass.ReadConfig;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	ReadConfig rd=new ReadConfig();
	
	String url=rd.getBaseUrl();
	String browser=rd.getBrowser();
	@BeforeClass
	public void SetUp()
	{
		switch(browser.toLowerCase())
		{
		case "chrome":
		driver=new ChromeDriver();
		break;
		case "firefox":
	    driver=new FirefoxDriver();
	    break;
		case "edge":
		driver=new EdgeDriver();
		break;
		default:
			driver=null;
			break;
			
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	 
		
		
	}
	
	public void TearUp()
	{
		driver.close();
	}
}
	


