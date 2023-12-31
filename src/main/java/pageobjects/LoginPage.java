package pageobjects;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonFunctions;

public class LoginPage extends CommonFunctions {

	@FindBy(xpath = "//input[@id='user-name']")
	public WebElement userNameTextBox;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement passwordTextBox;

	@FindBy(xpath = "//input[@id='login-button']")
	public WebElement loginButtonLoginPage;
	// To avoid duplicates of webElement definition

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}
	// Constructor returns no void type

	public void swagLabUserLogin(String username, String password) {

		elementSetValues(userNameTextBox, username, "UserName TextBox");
		elementSetValues(passwordTextBox, password, "Password TextBox");
		elementClick(loginButtonLoginPage, "User Login Button");

		// Page Factory is used to refactor/refine page objects
		// Page Factory - Initialize all the elements in a page
		// Page factory is one to one to page each pages
		// Here constructor uses
		// Page factory will always be as Constructor

	}
}
