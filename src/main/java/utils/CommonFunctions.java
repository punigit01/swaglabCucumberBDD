package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import baseclass.TestBase;

public class CommonFunctions extends TestBase {
	public void TakesScreenshotMethod() {
		try {
			String filepath = System.getProperty("user.dir") + "\\screenshots\\SwagLabScreenshot-" + TimeStamp()
					+ ".png";
			File sourceFile;
			sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(sourceFile, new File(filepath));
		} catch (Exception e) {
			logErrorMessage(e.toString());
		}

	}

	public String TimeStamp() throws IOException {
		Date dt = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("YYYY-MM-dd-hh-mm-ss");
		return sf.format(dt);
	}

	// Common method for click
	public void elementClick(WebElement element, String elementName) {
		try {
			element.click();
			logMessage("I Clicked on " + elementName);
		} catch (Exception e) {
			logErrorMessage(e.toString());
		}
	}

	// Common method for sendkeys values
	public void elementSetValues(WebElement element, String elementValue, String elementName) {
		try {
			element.sendKeys(elementValue);
			logMessage(elementValue + " sent to " + elementName);
		} catch (Exception e) {
			logErrorMessage(e.toString());
		}
	}

	public void logMessage(String message) {
		System.out.println(message);

	}

	public void logErrorMessage(String errMessage) {
		System.err.println(errMessage);
		TakesScreenshotMethod();
		throw new RuntimeException(errMessage);
	}

	public String fetchTextValueOfElement(WebElement element, String elementName) {
		String text = "";
		try {
			text = element.getText();
			logMessage("The value " + text + " is fetched from " + elementName + " name");

		} catch (Exception e) {
			logErrorMessage(e.toString());
		}
		return text;
	}

	public void validateElementIsDisplayed(WebElement element, String elementName) {
		try {
			if (element.isDisplayed()) {
				logMessage(elementName + " is displayed");
			} else {
				logErrorMessage(elementName + " is not displayed");
			}
		} catch (Exception e) {
			logErrorMessage(e.toString());
		}
	}

}
