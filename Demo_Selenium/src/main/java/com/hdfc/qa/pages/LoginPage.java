package com.hdfc.qa.pages;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hdfc.qa.base.BasePage;

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
		
		continuelogin.click();
		passw.sendKeys(pwd);
		secureAccessID.click();
		loginBtn.click();
		
		return new DashboardPage();
		
	}
	
	

}
