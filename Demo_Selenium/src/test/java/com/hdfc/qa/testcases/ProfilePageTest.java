package com.hdfc.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hdfc.qa.base.BasePage;
import com.hdfc.qa.pages.DashboardPage;
import com.hdfc.qa.pages.LoginPage;
import com.hdfc.qa.pages.ProfilePage;

public class ProfilePageTest extends BasePage {

	
	LoginPage loginPage;
	DashboardPage dashboardPage;
	ProfilePage profilePage;
	
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
		
		driver.quit();
	}
}
