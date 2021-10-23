package page_object;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class CardPage extends BaseClass {

	public CardPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(css = "[data-rbd-draggable-id='6172b6c5bc729e485075f5ac'] .ListContainer_ListContainer__buttonBottom__2kZAI")
	private WebElement btnAddCard;
	
	@FindBy(css = "[placeholder='Card name']")
	private WebElement txtAddCard;
	
	@FindBy(css = ".btn-success")
	private WebElement addCard;
	
	@FindBy(xpath = "//body/div[@id='root']/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]")
	private WebElement successmessage;
	
	@FindBy(id = "editCardMenu")
	private WebElement lblEdit;
	
	public void clickCard() {
		lblEdit.click();
	}
	
	public void clickAddCard() {
		btnAddCard.click();
	}
	
	public void setCardName(String cardname) {
		txtAddCard.sendKeys(cardname);
	}
	
	public void clickBtnAddCard() {
		addCard.click();
	}
	
	public boolean successMessage() {
		successmessage.isDisplayed();
		return true;
	}
	
	
	

}
