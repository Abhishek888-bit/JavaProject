package com.pageClass;

import java.io.File;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	 static WebDriver driver;
	@FindBy (id="Log in")
     private WebElement login;
	
	
	public LoginPage(WebDriver driver) {
		
		LoginPage.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void LoginbtnClick()
	{
		login.click();
	}
}
