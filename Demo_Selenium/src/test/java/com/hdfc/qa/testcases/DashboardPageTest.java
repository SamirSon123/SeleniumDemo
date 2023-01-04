package com.hdfc.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hdfc.qa.base.BasePage;
import com.hdfc.qa.pages.DashboardPage;
import com.hdfc.qa.pages.LoginPage;

public class DashboardPageTest extends BasePage {
	
	LoginPage loginPage;
	DashboardPage dashboardPage;
	public DashboardPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		
		initialization();
		 loginPage = new LoginPage();
		 dashboardPage = loginPage.clickOnLogin(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test
	public void clickOnProfileTest() throws IOException {
		
		dashboardPage.clickOnProfile();
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	

}
