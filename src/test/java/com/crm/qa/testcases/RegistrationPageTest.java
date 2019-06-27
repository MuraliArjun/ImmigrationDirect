package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.RegistrationPage;
import com.crm.qa.utils.Utility;

public class RegistrationPageTest extends TestBase {

	RegistrationPage registrationPage;
	Utility utility;

	String sheetName = "registration";

	public RegistrationPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws IOException {
		initilization();
		utility = new Utility(); 
		registrationPage = new RegistrationPage();
	}
	
	//Approach #1
	@Test(dataProvider = "getCRMTestData")
	public void createNewContact(String firstname, String lastname, String email, String password, String telephone) {
		registrationPage.createNewRegistration(firstname, lastname, email, password, telephone);
		registrationPage.submitRegistration();
	}
	
	@DataProvider
	public Object[][] getCRMTestData() {
		return new Object[][] {{"test", "dcis", "test_anuk_testing2de@dcis.net", "111111", "123456789"}};
	}
	
	
	//Approach #2
/*	@DataProvider 
	public Object[][] getCRMTestData() {
		Object data[][] = Utility.getTestData(sheetName);
		return data;
	}

	@Test(dataProvider = "getCRMTestData")
	public void createNewContact(String firstname, String lastname, String email, String password, String telephone) {
		registrationPage.createNewRegistration(firstname, lastname, email, password, telephone);
		registrationPage.submitRegistration();
	}*/

	//Approach #3
	/*@Test
	public void createNewContact() {
		registrationPage.createNewRegistration("test", "dcis", "muralidharan@dcis.net", "111111", "123456789");
		registrationPage.submitRegistration();
	}*/

	@AfterMethod
	public void tearsDown() {
		driver.quit();
	}

}
