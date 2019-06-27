package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class RegistrationPage extends TestBase{
	
	@FindBy(id="customerSignup-firstName")
	WebElement firstname;
	
	@FindBy(id="customerSignup-lastName")
	WebElement lastname;
	
	@FindBy(id="customerSignup-emailId")
	WebElement email;
	
	@FindBy(id="customerSignup-password")
	WebElement password;
	
	@FindBy(id="customerSignup-signinPhone-phone3")
	WebElement telephone;
	
	@FindBy(id="signupbutton")
	WebElement continueButton;
	
	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void createNewRegistration(String Fname, String Lname, String emailid, String pw, String phone) {

		firstname.sendKeys(Fname);
		lastname.sendKeys(Lname);
		email.sendKeys(emailid);
		password.sendKeys(pw);
		telephone.sendKeys(phone);
	}
	
	public void submitRegistration() {
		continueButton.click();
	}

}
