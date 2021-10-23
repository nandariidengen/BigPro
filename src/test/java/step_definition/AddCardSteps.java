package step_definition;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_object.BoardPage;
import page_object.CardPage;
import page_object.DashboardPage;
import page_object.TeamsPage;

public class AddCardSteps {
	private WebDriver webdriver;

	String titleTeams;

	public AddCardSteps() {
		super();
		this.webdriver = Hooks.webdriver;
	}

	@Given("User login into the cicle app and click card on the teams")
	public void openDashboard() {
		DashboardPage openteams = new DashboardPage(webdriver);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		openteams.isDisplayed();
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		titleTeams = openteams.getTitleTeams();
		openteams.clickCardTeams();
	}

	@When("User direct into teams page and click Board")
	public void openTeams() throws InterruptedException {
		TeamsPage teams = new TeamsPage(webdriver);
		Thread.sleep(5000);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		teams.clickBoardTeams();
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Assert.assertEquals(titleTeams, teams.getTitleTeams());
		System.out.println("Passed");
	}
	
	@And("User create new list and input \"(.*)\" as list name")
	public void addList(String listname) throws InterruptedException {
		BoardPage list = new BoardPage(webdriver);
		Thread.sleep(10000);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		list.clickAddList();
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		list.setListName(listname);
		list.clickCreate();
		System.out.println("CLick add list");
	}
	
	@And("User click add Card on the List and input \"(.*)\" as card name")
	public void addCard(String cardname) throws InterruptedException {
		CardPage card = new CardPage(webdriver);
		WebDriverWait wait = new WebDriverWait(webdriver, 5);
		Thread.sleep(5000);
//		card.clickCard();
		card.clickAddCard();
		Thread.sleep(3000);
		card.setCardName(cardname);
		Thread.sleep(3000);
		card.clickBtnAddCard();
	}
	
	@Then("Card already created")
	public void card() {
		CardPage succes =  new CardPage(webdriver);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		succes.clickBtnAddCard();
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertTrue(succes.successMessage());
	}

}
