package page_object;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class SchedulePage extends BaseClass {

	public SchedulePage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webdriver, this);
	}

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[3]/a[1]/div[1]/div[1]/div[1]")
	private WebElement schedule;

	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div[1]/div[2]/button")
	private WebElement createvent;

	@FindBy(xpath = "//body/div[@id='root']/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement titlee;

	@FindBy(xpath = "//body/div[@id='root']/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]/*[1]")
	private WebElement start;

	@FindBy(xpath = "//body/div[5]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[5]/button[1]/span[1]/p[1]")
	private WebElement startdate;

	@FindBy(xpath = "//span[contains(text(),'OK')]")
	private WebElement ok;

	@FindBy(xpath = "//div[@class='CreateEventPage_schedule__end__JkxY5']//div[1]//div[1]//div[1]//button[1]//span[1]//*[local-name()='svg']//*[name()='path' and contains(@d,'M17 12h-5v')]")
	private WebElement end;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[5]/div[6]/button[1]/span[1]/p[1]")
	private WebElement enddate;

	@FindBy(xpath = "//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiInputBase-input MuiInput-input']")
	private WebElement dpdrepeat;

	@FindBy(xpath = "//li[contains(text(),'Every day')]")
	private WebElement repeateveryday;

	@FindBy(xpath = "//span[@class='MuiButtonBase-root MuiIconButton-root jss1 MuiRadio-root MuiRadio-colorSecondary jss2 Mui-checked MuiIconButton-colorSecondary']//input[@name='mui-48678']")
	private WebElement forever;

	@FindBy(xpath = "//div[@class='CreateEventPage_plusButton__3LxsU']//*[local-name()='svg']")
	private WebElement addmembers;

	@FindBy(xpath = "//div[@class='ManageSubscribersContainer_ManageSubscribersContainer__body__3lbqx']//div[3]")
	private WebElement members;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/*[local-name()='svg'][1]")
	private WebElement closemembers;

	@FindBy(xpath = "//body/div[@id='root']/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/div[3]/div[1]")
	private WebElement notes;

	@FindBy(xpath = "//button[@class='btn btn-success']")
	private WebElement postevent;

	@FindBy(xpath = "//div[@id='notistack-snackbar']")
	private WebElement successmessage;

	@FindBy(xpath = "///body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/p[1]")
	private WebElement schedulevent;

	public void scrollDown() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) webdriver;
		js.executeScript("window.scrollBy(0,500);");
		Thread.sleep(3000);

	}

	public void clickEvent() {
		schedulevent.click();
	}

	public void clickNotes() {
		notes.click();
	}

	public void scrollUp() {
		JavascriptExecutor js = (JavascriptExecutor) webdriver;
		js.executeScript("window.scrollBy(0,-500)");
	}

	public boolean isDisplayed() {
		successmessage.isDisplayed();
		return true;
	}

	public void clickPostEvent() {
		postevent.click();
	}

	public void setNotes(String note) {
		notes.sendKeys(note);
	}

	public void closeMembers() {
		closemembers.click();
	}

	public void clickMembers() {
		members.click();
	}

	public void clickAddMembers() {
		addmembers.click();
	}

	public void clickForever() {
		forever.click();
	}

	public void repeatEveryDay() {
		repeateveryday.click();
	}

	public void dpdRepeat() {
		dpdrepeat.click();
	}

	public void clickEndDate() {
		enddate.click();
	}

	public void clickEnd() {
		end.click();
	}

	public void clickOk() {
		ok.click();
	}

	public void clickStartDate() {
		startdate.click();
	}

	public void clickStart() {
		start.click();
	}

	public void setTitle(String title) {
		titlee.sendKeys(title);
	}
	
	public void clickTitle() {
		titlee.click();
	}

	public void clickCreateEvent() {
		createvent.click();
	}

	public void clickSchedule() {
		schedule.click();
	}
}
