package step_definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.DashboardPage;
import page_object.RestorePage;
import page_object.TeamsPage;

public class RestoreCardSteps {
	private WebDriver webdriver;

	public RestoreCardSteps() {
		super();
		this.webdriver = Hooks.webdriver;
	}
	
	@Given("User already login to the Cicle and click card")
	public void openCicle() throws InterruptedException {
		DashboardPage card = new DashboardPage(webdriver);
		Thread.sleep(3000);
		card.clickCardTeams();
	}
	
	@And("User open Board Page")
	public void openTeams() throws InterruptedException {
		TeamsPage teams = new TeamsPage(webdriver);
		Thread.sleep(5000);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		teams.clickBoardTeams();
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@When("User click button archive and click restore one of the card")
	public void restoreCard() throws InterruptedException {
		RestorePage card = new RestorePage(webdriver);
		Thread.sleep(3000);
		card.clickArchive();
		Thread.sleep(3000);
		card.clickRestoreCard();
	}
	
	@Then("Card success restore")
	public void successRestore() throws InterruptedException {
		RestorePage restorecard = new RestorePage(webdriver);
		Thread.sleep(2000);
		String expectedMessage = "Unarchiving card is success";
		
		String actuakMessage = restorecard.getCardMessage();
		Thread.sleep(2000);
		Assert.assertEquals(expectedMessage, actuakMessage);
		System.out.println("Verify Passed");
	}
}
