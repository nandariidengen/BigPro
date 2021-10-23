package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class RestorePage extends BaseClass {

	public RestorePage(WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(xpath = "//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/*[1]")
	private WebElement btnArchive;
	
	@FindBy(xpath = "//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[1]")
	private WebElement btnSwitch;
	
	@FindBy(xpath = "//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[7]/div[2]/button[1]/div[1]")
	private WebElement restore;
	
	@FindBy(xpath = "//div[@id='notistack-snackbar']")
	private WebElement message;
	
	@FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/p[1]")
	private WebElement restorecard;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	private WebElement cardmessage;
	
	public String getCardMessage() {
		return cardmessage.getText();
	}
	
	public void clickRestoreCard() {
		restorecard.click();
	}
	
	public String getMessage() {
		return message.getText();
	}
	
	public void clickArchive() {
		btnArchive.click();
	}
	
	public void clickSwitch() {
		btnSwitch.click();
	}
	
	public void clickRestore() {
		restore.click();
	}
	
}
