package step_definition;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_object.BoardPage;
import page_object.DashboardPage;
import page_object.GroupChatPage;
import page_object.TeamsPage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddListSteps {
	private WebDriver webdriver;

	String titleTeams;

	public AddListSteps() {
		super();
		this.webdriver = Hooks.webdriver;
	}

	@Given("User already Sign In on the Cicle App")
	public void ciclePage() throws InterruptedException {
		DashboardPage dashboardpage = new DashboardPage(webdriver);
		dashboardpage.isDisplayed();
		String actualUrl = webdriver.getCurrentUrl();;
		String expectedUrl = "https://staging.cicle.app/";
		
		Assert.assertEquals(expectedUrl, actualUrl);
	}

	@When("User click card on the teams")
	public void openTeams() throws InterruptedException {
		DashboardPage card = new DashboardPage(webdriver);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		titleTeams = card.getTitleTeams();
		System.out.println(titleTeams);
		Thread.sleep(5000);
		card.clickCardTeams();
		Thread.sleep(3000);
	}

	@And("User will be direct on the Teams Page and click Board")
	public void openBoard() throws InterruptedException {
		TeamsPage teams = new TeamsPage(webdriver);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		teams.clickBoardTeams();
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Assert.assertEquals(titleTeams, teams.getTitleTeams());
		System.out.println("Passed");
	}

	@And("User Add List on the Board and input \"(.*)\" as list name")
	public void addList(String listname) throws InterruptedException {
		BoardPage list = new BoardPage(webdriver);
		Assert.assertEquals(titleTeams, list.getTitle());
		
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		list.clickAddList();
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		list.setListName(listname);
		list.clickCreate();
		
		assertTrue(list.successMessage());
	}

	@Then("List is already created")
	public void List() throws InterruptedException {
		BoardPage board = new BoardPage(webdriver);
		Thread.sleep(5000);
		String expectedList = "In Progress";
		String actualList = board.getListName();
		
		Assert.assertEquals(expectedList, actualList);
		System.out.println("Verify Passed");
	}
}
