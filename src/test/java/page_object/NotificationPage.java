package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class NotificationPage extends BaseClass {
	
	public NotificationPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(xpath = "//div[@class='NavHeader_navIconSection__2A2RJ']/div[2]/div[@class='NavIcon_back__17EAr']")
	private WebElement lblbell;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/nav[1]/div[1]/div[1]/div[3]/div[3]/div[2]/button[1]")
	private WebElement viewnotif;
	
	public void clickBell() {
		lblbell.click();
	}
	
	public void clickNotif() {
		viewnotif.click();
	}

}
