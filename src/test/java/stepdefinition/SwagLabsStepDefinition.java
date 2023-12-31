package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjects.CartPage;
import pageobjects.InformationCheckOutPage;
import pageobjects.LoginPage;
import pageobjects.ProductDescriptionPage;
import pageobjects.ProductOverviewPage;
import pageobjects.ProductsListPage;
import utils.CommonFunctions;

public class SwagLabsStepDefinition extends CommonFunctions {
	@Given("^I open a browser and navigate to swaglab application$")
	public void i_open_a_browser_and_navigate_to_swaglab_application() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));

	}

	@Given("^I use username and password to login to swaglab application$")
	public void i_use_username_and_password_to_login_to_swaglab_application() {
		LoginPage loginpage = new LoginPage();
		loginpage.swagLabUserLogin("standard_user", "secret_sauce");
	}

	@And("^I select a product named SauceLabs Backpack$")
	public void i_select_a_product_named_SauceLabs_Backpack() {
		ProductsListPage productslistpage = new ProductsListPage();
		productslistpage.selectSauceLabsBackpack();
	}

	@And("^I review the selected product$")
	public void i_review_the_selected_product() {
		ProductDescriptionPage productdescriptionpage = new ProductDescriptionPage();
		productdescriptionpage.reviewProduct();
	}

	@And("^I proceed with product checkout$")
	public void i_proceed_with_product_checkout() {
		CartPage cartpage = new CartPage();
		cartpage.productCheckOut();
	}

	@And("^I enter the personal information$")
	public void i_enter_the_personal_information() {
		InformationCheckOutPage informationcheckoutpage = new InformationCheckOutPage();
		informationcheckoutpage.enterPersonalDetails();
	}

	@Then("^I review the selected product details$")
	public void i_review_the_selected_product_details() {
		ProductOverviewPage productoverviewpage = new ProductOverviewPage();
		productoverviewpage.productOverview();
	}
}
