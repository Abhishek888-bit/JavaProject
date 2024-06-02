package com.testClass;

import org.testng.annotations.Test;

import com.pageClass.DashboardPageObjectClass;

public class TestCaseLogin extends BaseClass {
	
	@Test
	public void login()
	{
		driver.get(url);
		DashboardPageObjectClass dp=new DashboardPageObjectClass(driver);
		dp.loginBtnClick();
		
	}

}
