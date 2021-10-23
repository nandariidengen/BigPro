package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class BoardPage extends BaseClass {

	public BoardPage(WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(webdriver, this);
	}

	@FindBy(css = ".Button_container__1WNuB")
	private WebElement btnAddList;

	@FindBy(xpath = "//input[@name='name']")
	private WebElement txtListName;

	@FindBy(css = ".btn")
	private WebElement btnCreate;

	@FindBy(xpath = "//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")
	private WebElement lblBacklog;

	@FindBy(xpath = "//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
	private WebElement txtAddList;

	@FindBy(xpath = "//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
	private WebElement listname;

	@FindBy(xpath = "//body/div[@id='root']/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]")
	private WebElement errormessage;

	@FindBy(id = "notistack-snackbar")
	private WebElement successmessage;

	@FindBy(xpath = "//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/*[1]")
	private WebElement toggle;

	@FindBy(xpath = "//div[.='Archive This List']")
	private WebElement archive;

	@FindBy(xpath = "//body/div[@id='root']/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]")
	private WebElement archivemessage;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]")
	private WebElement titleTeams;

	public String getTitle() {
		return titleTeams.getText();
	}

	public String getArchiveMessage() {
		return archivemessage.getText();
	}

	public void clickArchive() {
		archive.click();
	}

	public void clickToggle() {
		toggle.click();
	}

	public boolean successMessage() {
		successmessage.isDisplayed();
		return true;
	}

	public String getErrorMessage() {
		return errormessage.getText();
	}

	public String getListName() {
		return listname.getText();
	}

	public void clickAddList() {
		btnAddList.click();
	}

	public void setListName(String listname) {
		txtListName.sendKeys(listname);
	}
	
	public String getTxtListName() {
		return txtListName.getText();
	}

	public void clickCreate() {
		btnCreate.click();
	}

//	public boolean isDisplayed() {
//		lblBacklog.isDisplayed();
//		listname.isDisplayed();
//		return true;
//	}
}
