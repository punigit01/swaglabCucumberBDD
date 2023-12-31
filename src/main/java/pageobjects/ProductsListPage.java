package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonFunctions;

public class ProductsListPage extends CommonFunctions {

	@FindBy(xpath = "//span[text()='Products']")
	public WebElement productElementLandingPage;

	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
	public WebElement selectedProduct;

	@FindBy(xpath = "//input[@id='login-button']")
	public WebElement loginButtonNotLoggedIn;

	public ProductsListPage() {
		PageFactory.initElements(driver, this);

	}

	// click, SendKeys, screenshots, isDisplayed are reusable

	public void selectSauceLabsBackpack() {
		validateElementIsDisplayed(productElementLandingPage, "Product Page");
		elementClick(selectedProduct, "Products Element");

	}
}
