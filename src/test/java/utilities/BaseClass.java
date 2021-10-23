package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver webdriver;
	public static WebDriverWait wait;
	
	public static WebDriver webDriver;

	public BaseClass(WebDriver webDriver) {
		BaseClass.webDriver = webDriver;
	}
	
	public void click(WebElement webElement) {
		webElement.click();
	}
	
	public void input(WebElement webElement) {
		webElement.clear();
		webElement.sendKeys();
	}

}
