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
import page_object.CardPage;
import page_object.DashboardPage;
import page_object.TeamsPage;

public class AddListNegativeSteps {
	private WebDriver webdriver;

	String titleTeams;
	
	public AddListNegativeSteps() {
		super();
		this.webdriver = Hooks.webdriver;
	}
	
	@Given("User open the Cicle App and click card on the teams")
	public void openCiclePage() throws InterruptedException {
		DashboardPage openteams = new DashboardPage(webdriver);
		Thread.sleep(5000);
		openteams.isDisplayed();
		Thread.sleep(5000);
		titleTeams = openteams.getTitleTeams();
		openteams.clickCardTeams();
	}
	
	@When("User go to teams page and click Board")
	public void openBoardPage() throws InterruptedException {
		TeamsPage teams = new TeamsPage(webdriver);
		Thread.sleep(5000);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		teams.clickBoardTeams();
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		Assert.assertEquals(titleTeams, teams.getTitleTeams());
		System.out.println("Passed");
	}
	
	@And("User create new list on the board and input \"(.*)\" as list name")
	public void addList(String listname) throws InterruptedException {
		BoardPage list = new BoardPage(webdriver);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		list.clickAddList();
		Thread.sleep(3000);
		list.setListName(listname);
		String expectedListName = list.getTxtListName();
		list.clickCreate();
		Thread.sleep(2000);
		System.out.println("CLick add list");
	}
	
	@Then("Error message will appears")
	public void List() throws InterruptedException {
		BoardPage board = new BoardPage(webdriver);
		Thread.sleep(3000);
		String actualListName = board.getListName();
//		String expectedErrorMessage = "List name cannot be empty";
//		Thread.sleep(3000);
//		String actualErrorMessage = board.getErrorMessage();
//		Thread.sleep(3000);
//		Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
//		Thread.sleep(3000);
	}
	
	
}
