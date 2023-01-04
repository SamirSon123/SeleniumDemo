package com.hdfc.qa.pages;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hdfc.qa.base.BasePage;
import com.relevantcodes.extentreports.LogStatus;

public class LoginPage extends BasePage {
	
	

	@FindBy(xpath = "//input[@id='liabiltyLoginCustId']")
	WebElement custid;
	
	@FindBy(xpath = "//*[@id='continuelogin']")
	WebElement continuelogin;
	
	@FindBy(xpath = "//*[@id='keyboard']")
	WebElement passw;
	
	@FindBy(xpath = "//input[@id='secureAccessID']")
	WebElement secureAccessID;
	
	@FindBy(xpath = "//*[@id='loginBtn']")
	WebElement loginBtn;
	
public LoginPage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle() {
		
		return driver.getTitle();
	}
	
	public DashboardPage clickOnLogin(String un, String pwd ) throws IOException {
		
		custid.sendKeys(un);
		test.log(LogStatus.INFO, "CustID is Entered.");
		
		continuelogin.click();
		test.log(LogStatus.INFO, "Click on Continue.");
		
		passw.sendKeys(pwd);
		test.log(LogStatus.INFO, "Password is Entered.");
		
		secureAccessID.click();
		test.log(LogStatus.INFO, "Check box is clicked.");
		
		loginBtn.click();
		test.log(LogStatus.INFO, "Click on Login.");

		
		return new DashboardPage();
		
	}
	
	

}
