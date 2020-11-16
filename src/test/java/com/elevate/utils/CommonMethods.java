package com.elevate.utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.elevate.testbase.PageInitializer;
import com.elevate.utils.Constants;

public class CommonMethods extends PageInitializer {
	
	/**
	 * Method that clears and sends keys
	 * 
	 * @param element
	 * @param text
	 */
	public void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}
	
	public static WebDriverWait getWaitObject() {
		WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT_TIME);
		return wait;
	}
	
	public static WebElement waitForClickability(WebElement element) {
		return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}

	public static WebElement waitForVisibility(WebElement element) {
		return getWaitObject().until(ExpectedConditions.visibilityOf(element));
	}

	public static void click(WebElement element) {
		waitForClickability(element);
		element.click();
	}
	
	/**
	 * This Method will take a screenshot
	 * 
	 * @param filename
	 */
	public static byte[] takeScreenshot(String filename) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] picBytes=ts.getScreenshotAs(OutputType.BYTES);
		File file = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile=Constants.SCREENSHOT_FILEPATH+filename+getTimeStamp()+".png";
		try {
			FileUtils.copyFile(file, new File(destinationFile));
		} catch (Exception ex) {
			System.out.println("Cannot take screenshot!");
		}
		
		return picBytes;
	}
	
	public static String getTimeStamp() {
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyy_MM_dd_HH_mm_ss");
		return sdf.format(date.getTime());
		
	}
	
	

}
