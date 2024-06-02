package com.pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPageObjectClass {
	
	WebDriver driver;
	
	@FindBy(xpath = "(//a[@title=\"Login to your account\"])[1]")
	private WebElement MainLogin;

	
	
	   public DashboardPageObjectClass(WebDriver driver) {
		   
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
		   
		
	}
	   
	   
	   public void loginBtnClick()
	   {
		   MainLogin.click();
	   }
}
