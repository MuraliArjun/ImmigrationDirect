package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ApplicationCenterPage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginpage;
	ApplicationCenterPage appcenterpage;
	
	// to initialize the Parent class constructor
	public LoginPageTest() {
		super();	
	}
	
	@BeforeMethod
	public void setup() {
		initilization();
		loginpage = new LoginPage();	
	}
	
	@Test(priority=1)
	public void loginTest() {
		appcenterpage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearsDown() {
		driver.quit();
	}

}
