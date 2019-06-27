package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ApplicationCenterPage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignOutPage;

public class ApplicationCenterPageTest extends TestBase{
	
	LoginPage loginpage;
	ApplicationCenterPage appcenter;
	SignOutPage signout;
	
	public ApplicationCenterPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initilization();
		loginpage = new LoginPage();
		appcenter = new ApplicationCenterPage();
		appcenter = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println(">>>>>>>>>>> In AppCenter Page");
		
	}
	
	
	@Test(priority=1)
	public void SignOutTest() {
		signout = appcenter.signOut();
		System.out.println(">>>>>>>>>>> In SignOut Page");
	}
	
	@AfterMethod
	public void tearsDown() {
		driver.quit();
	}

}
