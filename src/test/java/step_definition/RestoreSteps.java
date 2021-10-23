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

public class RestoreSteps {
	private WebDriver webdriver;
	
	public RestoreSteps() {
		super();
		this.webdriver = Hooks.webdriver;
	}
	
	@Given("User open Cicle App and click card on the Teams")
	public void openTeams() throws InterruptedException {
		DashboardPage card = new DashboardPage(webdriver);
		Thread.sleep(3000);
		card.clickCardTeams();
	}
	
	@When("User click Board and will be direct on the Board age")
	public void openBoard() throws InterruptedException {
		TeamsPage teams = new TeamsPage(webdriver);
		Thread.sleep(5000);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		teams.clickBoardTeams();
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@And("User click archive adn click switch to list")
	public void archive() throws InterruptedException {
		RestorePage restore = new RestorePage(webdriver);
		Thread.sleep(5000);
		restore.clickArchive();
		Thread.sleep(5000);
		restore.clickSwitch();
		Thread.sleep(3000);
	}
	
	@And("User click restore one of the list")
	public void restoreList() throws InterruptedException {
		RestorePage restoreList = new RestorePage(webdriver);
		Thread.sleep(3000);
		restoreList.clickRestore();
	}
	
	@Then("User see the success message")
	public void successRestore() throws InterruptedException {
		RestorePage restoreList = new RestorePage(webdriver);
		Thread.sleep(2000);
		String expectedMessage = "Unarchiving list with cards is success";
		
		String actualMessage = restoreList.getMessage();
		Thread.sleep(2000);
		Assert.assertEquals(expectedMessage, actualMessage);
		System.out.println("Passed");
	}
}
