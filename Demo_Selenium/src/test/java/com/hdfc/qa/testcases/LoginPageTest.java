package com.hdfc.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hdfc.qa.base.BasePage;
import com.hdfc.qa.pages.DashboardPage;
import com.hdfc.qa.pages.LoginPage;

public class LoginPageTest extends BasePage{
	
	LoginPage loginPage;

	
	public LoginPageTest() throws IOException {
		
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
		initialization();
		try {
			loginPage = new LoginPage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Login");
	}
	
	
	@Test(priority=2)
	public void loginPageTest() throws IOException {
		
		loginPage.clickOnLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
}
