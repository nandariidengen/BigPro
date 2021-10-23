package step_definition;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_object.BoardPage;
import page_object.DashboardPage;
import page_object.TeamsPage;

public class ArchiveListSteps {
	private WebDriver webdriver;

	String actualTitle;

	public ArchiveListSteps() {
		super();
		this.webdriver = Hooks.webdriver;
	}

	@Given("User have been sign in on the Cicle App and click card")
	public void cicleApp() {
		DashboardPage dashboardpage = new DashboardPage(webdriver);
		dashboardpage.isDisplayed();
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		actualTitle = dashboardpage.getTitleTeams();
		dashboardpage.clickCardTeams();
	}

	@When("User click Board and will be direct on the Board Page")
	public void openBoard() throws InterruptedException {
		TeamsPage teams = new TeamsPage(webdriver);
		Thread.sleep(5000);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertEquals(actualTitle, teams.getTitleTeams());
		Thread.sleep(5000);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		teams.clickBoardTeams();
	}

	@And("User create new List on the board and input \"(.*)\" as listname")
	public void addNewList(String listname) throws InterruptedException {
		BoardPage list = new BoardPage(webdriver);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		list.clickAddList();
		Thread.sleep(3000);
		list.setListName(listname);
		Thread.sleep(3000);
		list.clickCreate();
	}

	@And("User click toggle on the list and click archive this list")
	public void archiveList() throws InterruptedException {
		BoardPage archivelist = new BoardPage(webdriver);
		Thread.sleep(5000);
		archivelist.clickToggle();
		Thread.sleep(5000);
		archivelist.clickArchive();
		Thread.sleep(5000);
	}

	@Then("List will be archive")
	public void archiveSuccess() {
		BoardPage archivesuccess = new BoardPage(webdriver);
		String expectedMessage = "Archiving list with cards is success";
		
		String actualMessage = archivesuccess.getArchiveMessage();
		
		Assert.assertEquals(expectedMessage, actualMessage);
	}
}
