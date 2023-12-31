package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonFunctions;

public class InformationCheckOutPage extends CommonFunctions {

	@FindBy(xpath = "//input[@id='first-name']")
	public WebElement firstNameDetail;

	@FindBy(xpath = "//input[@id='last-name']")
	public WebElement lastNameDetail;

	@FindBy(xpath = "//input[@id='postal-code']")
	public WebElement pinCodeDetail;

	@FindBy(xpath = "//input[@id='continue']")
	public WebElement continueButton;
	// To avoid duplicates of webElement definition

	public InformationCheckOutPage() {
		PageFactory.initElements(driver, this);

	}

	public void enterPersonalDetails() {
		elementSetValues(firstNameDetail, "Swag", "FirstName TextBox");
		elementSetValues(lastNameDetail, "Labs", "LastName TextBox");
		elementSetValues(pinCodeDetail, "524785", "PostalCode TextBox");
		elementClick(continueButton, "Continue Button");

	}
}
