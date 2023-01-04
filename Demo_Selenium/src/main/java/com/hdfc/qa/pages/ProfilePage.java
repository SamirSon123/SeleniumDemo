package com.hdfc.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hdfc.qa.base.BasePage;
import com.hdfc.qa.util.TestUtil;
import com.relevantcodes.extentreports.LogStatus;

public class ProfilePage extends BasePage {
	
	@FindBy(xpath = "//*[@id=\"custom-button\"]/a/button")
	WebElement logout;
	
	@FindBy(xpath = "//*[@id=\"main\"]/div[3]/div[10]/div[3]/div/div/div/div/div/div[2]/div[3]/a[1]")
	WebElement secLogout;
	
	public ProfilePage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLogout() {
		
		logout.click();
		test.log(LogStatus.INFO, "Clicked on Logout.");
		
		TestUtil.explicitWait(driver, secLogout);
		
		secLogout.click();
		test.log(LogStatus.INFO, "Clicked on Second logout.");
		
	}
	

}
