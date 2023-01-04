package com.hdfc.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hdfc.qa.util.TestUtil;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BasePage {
	
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriverWait wait;
	public static ExtentReports report;
	public static ExtentTest test;
	
	
	public BasePage() throws IOException {
		prop = new Properties();
		
		
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/com/hdfc/qa/config/config.properties");
		prop.load(ip);
	}
	

	@SuppressWarnings("deprecation")
	public static void initialization() {
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
			
			
			
		}
		
		report = new ExtentReports(System.getProperty("user.dir")+"\\extentreport.html");
		test = report.startTest("ExtendDemo");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		
		driver.get(prop.getProperty("url"));
		
	}

}
