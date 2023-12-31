package baseclass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TestBase {
	public static WebDriver driver;
	public JavascriptExecutor jse = (JavascriptExecutor) driver;
}
