package page_object;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class GroupChatPage extends BaseClass {
	
	public GroupChatPage(WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/nav[1]/ol[1]/li[3]/a[1]/*[1]")
	private WebElement toogleSoalB;
	
	@FindBy(xpath = "//body/div[@id='root']/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/a[1]/div[1]/div[1]")
	private WebElement groupchat;
	
	@FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]")
	private WebElement txtMessage;
	
	@FindBy(xpath = "//body/div[@id='root']/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/button[1]")
	private WebElement btnSend;
	
	@FindBy(xpath = "//body/div[@id='root']/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	private WebElement msg;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]")
	private WebElement btnAttachFile;
	
	@FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/h1[1]")
	private WebElement groupchatTitle;
	
	@FindBy(id = "notistack-snackbar")
	private WebElement successupload;
	
	@FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/p[1]")
	private WebElement lasttext;
	
	public String getLastText() {
		return lasttext.getText();
	}
	
	public String getActualMessage() {
		return successupload.getText();
	}
	
	public String getGroupChatTitle() {
		return groupchat.getText();
	}
	
	public void clickAttachFile() {
		btnAttachFile.click();
	}
	
	public void uploadPhoto(String image) {
		String projectLocation = System.getProperty("user.dir");
		String path = projectLocation + "//lib//photo//";
		path = path + image;
		btnAttachFile.sendKeys(path);
	}
	
	public void clickLblSoalB() {
		toogleSoalB.click();
	}
	
	public void clickGroupChat() {
		groupchat.click();
	}
	
	public void setMessage(String message) {
		txtMessage.sendKeys(message);
	}
	
	public String getMessage() {
		return txtMessage.getText();
	}
	
	public void clickSend() {
		btnSend.click();
	}
	
	public boolean isDisplayed() {
		return msg.isDisplayed();
	}
}
