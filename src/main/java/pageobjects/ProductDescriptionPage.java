package pageobjects;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonFunctions;

public class ProductDescriptionPage extends CommonFunctions {

	@FindBy(xpath = "//button[@id='back-to-products']")
	public WebElement backToProductsButton;

	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	public WebElement addToCartButton;

	@FindBy(xpath = "//a[@class='shopping_cart_link']/child::span[@class='shopping_cart_badge']")
	public WebElement addToCartValidate;

	public ProductDescriptionPage() {
		PageFactory.initElements(driver, this);

	}

	public void reviewProduct() {

		validateElementIsDisplayed(backToProductsButton, "Backs to Products");
		elementClick(addToCartButton, "Add To Cart Button");
		String cartValue = fetchTextValueOfElement(addToCartValidate, "Cart Price");
		int cartValueInt = Integer.parseInt(cartValue);
		if (cartValueInt == 1) {
			elementClick(addToCartValidate, "Add To Cart ProductsValidate Button");
		}

	}
}
