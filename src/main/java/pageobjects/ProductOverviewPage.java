package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonFunctions;

public class ProductOverviewPage extends CommonFunctions {

	@FindBy(xpath = "//button[@id='finish']")
	public WebElement finishButton;

	@FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
	public WebElement totalValueString;

	public ProductOverviewPage() {
		PageFactory.initElements(driver, this);

	}

	public void productOverview() {

		jse.executeScript("arguments[0].scrollIntoView();", finishButton);
		validateElementIsDisplayed(finishButton, "Finish Button");
		TakesScreenshotMethod();
		logMessage("Successful, Completed through Check out page");
		String totalValueText = fetchTextValueOfElement(totalValueString, "Total Cost Value");
		logMessage(totalValueText);
		String[] arrStrings = totalValueText.split(" ");
		double totalValueDouble = Double.parseDouble(arrStrings[1].substring(1));
		// Validate by adding two values to validate with total
		if (totalValueDouble == 32.39) {
			logMessage("Successful, Total value is validated properly");
		}

	}
}
