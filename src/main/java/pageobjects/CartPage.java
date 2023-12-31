package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonFunctions;

public class CartPage extends CommonFunctions {

	@FindBy(xpath = "//button[@id='checkout']")
	public WebElement checkOutButton;

	public CartPage() {
		PageFactory.initElements(driver, this);

	}

	public void productCheckOut() {

		validateElementIsDisplayed(checkOutButton, "CheckOut Button");
		elementClick(checkOutButton, "Cart Page Check Out Button");
	}
}
