package step_definition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_object.BoardPage;
import page_object.CardPage;
import page_object.DashboardPage;
import page_object.TeamsPage;

public class AddCardNegative {
	private WebDriver webdriver;
	
	String titleTeams;

	public AddCardNegative() {
		super();
		this.webdriver = Hooks.webdriver;
	}
	
	@Given("User already on the Cicle App and click card on the teams")
	public void openCicle() {
		DashboardPage openteams = new DashboardPage(webdriver);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		openteams.isDisplayed();
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		titleTeams = openteams.getTitleTeams();
		openteams.clickCardTeams();
	}
	
	@When("User click Board on the teams page")
	public void openTeams() throws InterruptedException {
		TeamsPage teams = new TeamsPage(webdriver);
		Thread.sleep(5000);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		teams.clickBoardTeams();
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Assert.assertEquals(titleTeams, teams.getTitleTeams());
		System.out.println("Passed");
	}
	
	@And("User add new list and input \"(.*)\" as list name")
	public void addList(String listname) throws InterruptedException {
		BoardPage list = new BoardPage(webdriver);
		Thread.sleep(3000);
		list.clickAddList();
		Thread.sleep(3000);
		list.setListName(listname);
		Thread.sleep(3000);
		list.clickCreate();
		System.out.println("CLick add list");
	}
	
	@And("User create new card and input \"(.*)\" as card name")
	public void addCard(String cardname) throws InterruptedException {
		CardPage card = new CardPage(webdriver);
		Thread.sleep(3000);
		card.clickAddCard();
		Thread.sleep(5000);
		card.setCardName(cardname);
	}
	
	@Then("User see the new card")
	public void send() throws InterruptedException {
		CardPage card = new CardPage(webdriver);
		card.successMessage();
		Thread.sleep(3000);
		System.out.println("Empty name");
	}
}
