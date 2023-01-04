package com.hdfc.qa.util;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hdfc.qa.base.BasePage;

public class TestUtil extends BasePage{
	
	public TestUtil() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public static long PAGE_LOAD_TIMEOUT = 40;
	public static long IMPLICIT_WAIT = 10;
	public static WebDriverWait wait;
	
	public static String takeScreenshotAtEndOfTest(WebDriver driver) throws IOException {
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File(System.getProperty("user.dir") + "/screenshots/" +System.currentTimeMillis() + ".png");
		String absPath = destFile.getAbsolutePath();
		FileUtils.copyFile(srcFile,destFile );
		return absPath;
	}
	
	public static void explicitWait(WebDriver driver,WebElement ele) {
		
		 wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.visibilityOf(ele));
	}

	

}
