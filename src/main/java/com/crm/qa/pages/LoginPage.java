package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Object Repository using @FindBy Annotation (page factory annotation)
	@FindBy(id="loginEmail")
	WebElement username;
	
	@FindBy(id="loginPassword")
	WebElement password;
	
	@FindBy(id = "sbutton")
	WebElement submitButton;
	
	
    //Initializing the page object 
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public ApplicationCenterPage login(String un, String pw) {
		username.sendKeys(un);
		password.sendKeys(pw);
		submitButton.click();
		return new ApplicationCenterPage();
	}
}
