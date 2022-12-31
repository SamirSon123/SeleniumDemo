package com.hdfc.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hdfc.qa.base.BasePage;

public class DashboardPage extends BasePage {


	
	@FindBy(xpath="//*[@id=\"userProfile\"]/span/div/div[2]/a")
	WebElement userProfile;
	
	public DashboardPage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
	
	public ProfilePage clickOnProfile() throws IOException {
		
		userProfile.click();
		return new ProfilePage();
	}
	
	

}
