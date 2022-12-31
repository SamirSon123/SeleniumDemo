package com.hdfc.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hdfc.qa.base.BasePage;

public class ProfilePage extends BasePage {
	
	@FindBy(xpath = "//*[@id=\"custom-button\"]/a/button")
	WebElement logout;
	
	public ProfilePage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLogout() {
		
		logout.click();
	}
	

}
