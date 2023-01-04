package com.hdfc.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hdfc.qa.base.BasePage;
import com.hdfc.qa.util.TestUtil;
import com.relevantcodes.extentreports.LogStatus;

public class DashboardPage extends BasePage {

	
	@FindBy(xpath="//*[@id=\"userProfile\"]/span/div/div[2]/a")
	WebElement userProfile;
	
	@FindBy(xpath = "//input[@class='dummy-input']")
	WebElement elementToWait;
	
	public DashboardPage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
	
	public ProfilePage clickOnProfile() throws IOException {
		
		TestUtil.explicitWait(driver, userProfile);
		test.log(LogStatus.PASS, "Getting Dashboard Page successfully.");
		test.log(LogStatus.PASS, test.addScreenCapture(TestUtil.takeScreenshotAtEndOfTest(driver))+ "Test Passed.");

		TestUtil.takeScreenshotAtEndOfTest(driver); 
		userProfile.click();
		test.log(LogStatus.INFO, "Clicked on User Profile.");
		return new ProfilePage();
	}
	
	

}
