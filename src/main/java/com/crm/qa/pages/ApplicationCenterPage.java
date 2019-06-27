package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ApplicationCenterPage extends TestBase{
	
	@FindBy(linkText="Sign Out")
	WebElement signout;

	public ApplicationCenterPage() {
		PageFactory.initElements(driver, this);
	}
	
	public SignOutPage signOut() {
		signout.click();
		return new SignOutPage();
	}
}
