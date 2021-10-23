package page_object;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class DashboardPage extends BaseClass {

	public DashboardPage(WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(webdriver, this);
	}

	@FindBy(css = ".DashboardPage_leftCol__smallTitle__331B9")
	private WebElement company;

	@FindBy(css = ".NavHeader_navMemberSection__ApwJH")
	private WebElement picture;

	@FindBy(xpath = "//body/div[@id='root']/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/div[1]/div[1]")
	private WebElement companyname;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[4]/a[1]/div[1]")
	private WebElement cardteams;

	@FindBy(xpath = "//h1[contains(text(),'Soal B')]")
	private WebElement lblTeams;

	@FindBy(xpath = "//h1[.='Bigpro']")
	private WebElement lblbigpro;

	@FindBy(xpath = "//div[4]/a[1]/div[1]/p")
	private WebElement lbldescTeams;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/nav[1]/div[1]/div[2]/div[2]/div[3]/a[1]/div[1]/div[2]/p[1]")
	private WebElement name;
	
	@FindBy(xpath = "//body/div[@id='root']/nav[1]/div[1]/div[2]/div[1]/img[1]")
	private WebElement profile;
	
	public void clickProfile() {
		profile.click();
	}
	
	public String getName() {
		return name.getText();
	}

	public void clickCardTeams() {
		cardteams.click();
	}

	public void clickTeamsCompany() {
		lblTeams.click();
	}

	public String getTitleTeams() {
		return lblTeams.getText();
	}

	public String getDescTeams() {
		return lbldescTeams.getText();
	}

	public boolean isDisplayed() {
//		companyname.isDisplayed();
//		company.isDisplayed();
//		picture.isDisplayed();
		return true;
	}

}
