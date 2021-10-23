package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class TeamsPage extends BaseClass {

	public TeamsPage(WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(css = ".TeamPage_TeamPage__title__xy6LC > h1")
	private WebElement teamstitle;
	
	@FindBy(xpath = "//h1[.='Soal B']")
	private WebElement titleteams;
	
	@FindBy(xpath = "//p[.='Soal untuk grup B']")
	private WebElement descteams;
	
	@FindBy(xpath = "//div[contains(@Class,'ShowLimitMembers_container')]")
	private WebElement member;
	
	@FindBy(xpath = "//div[contains(text(),'Group Chat')]")
	private WebElement groupchat;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[2]/a[1]/div[1]/div[1]/div[1]")
	private WebElement blast;
	
	@FindBy(xpath = "//div[contains(text(),'Schedule')]")
	private WebElement schedule;
	
	@FindBy(xpath = "//body/div[@id='root']/div[2]/div[1]/div[2]/div[1]/div[3]/div[4]/a[1]/div[1]/div[1]/div[1]")
	private WebElement boardsCompany;
	
	@FindBy(xpath = "//body/div[@id='root']/div[2]/div[1]/div[2]/div[1]/div[3]/div[4]/a[1]/div[1]/div[1]")
	private WebElement boardsCard;
	
	@FindBy(xpath = "//div[contains(text(),'Check-Ins')]")
	private WebElement checkin;
	
	@FindBy(xpath = "//div[contains(text(),'Docs & Files')]")
	private WebElement docsfile;
	
	
	public String getTitleGroupChat() {
		return groupchat.getText();
	}
	public String getTitleTeams() {
		return titleteams.getText();
	}
	
	public String getDescTeams() {
		return descteams.getText();
	}
	
	public void clickBoard() {
		boardsCompany.click();
	}
	
	public void clickBoardTeams() {
		boardsCard.click();
	}
	
}
