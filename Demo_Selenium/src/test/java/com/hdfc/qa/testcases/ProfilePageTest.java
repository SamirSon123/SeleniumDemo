//
//ProfilePageTest
//
package com.hdfc.qa.testcases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hdfc.qa.base.BasePage;
import com.hdfc.qa.pages.DashboardPage;
import com.hdfc.qa.pages.LoginPage;
import com.hdfc.qa.pages.ProfilePage;
import com.hdfc.qa.util.TestUtil;

public class ProfilePageTest extends BasePage {

	
	LoginPage loginPage;
	DashboardPage dashboardPage;
	ProfilePage profilePage;
	WebDriverWait wait;
	
	public ProfilePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@BeforeMethod
	public void setUp() throws IOException {
		
		initialization();
		 loginPage = new LoginPage();
		 dashboardPage = loginPage.clickOnLogin(prop.getProperty("username"), prop.getProperty("password"));
		 profilePage = dashboardPage.clickOnProfile();
	}
	
	@Test
	public void clickOnLogoutTest() throws IOException {
		
		profilePage.clickOnLogout();
	}
	
	@AfterMethod
	public void tearDown() {
		
		report.endTest(test);
		report.flush();
		driver.quit();
	}
}
