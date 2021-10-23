package step_definition;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_object.DashboardPage;
import page_object.SchedulePage;

public class ScheduleSteps {
	private WebDriver webdriver;

	public ScheduleSteps() {
		super();
		this.webdriver = Hooks.webdriver;
	}

	@Given("User open cicle App and click card on the Teams")
	public void openCicle() throws InterruptedException {
		DashboardPage card = new DashboardPage(webdriver);
		Thread.sleep(3000);
		card.clickCardTeams();
	}
	
	@When("User click Schedule and user will be direct on the schedule page")
	public void schedule() throws InterruptedException {
		SchedulePage schedule = new SchedulePage(webdriver);
//		Thread.sleep(3000);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		webdriver.get("https://staging.cicle.app/schedules/615e9f8ed3cd8545cd3ca508");
		Thread.sleep(5000);
		schedule.clickSchedule();
	}
	
	@And("User click create event")
	public void event() throws InterruptedException {
		SchedulePage event = new SchedulePage(webdriver);
		Thread.sleep(3000);
//		event.clickEvent();
//		event.clickCreateEvent();
		webdriver.get("https://staging.cicle.app/schedules/615e9f8ed3cd8545cd3ca508/create");
		Thread.sleep(3000);
	}
	
	@And("User fills in the data event and input \"(.*)\" as notes")
	public void createEvent(String title) throws InterruptedException {
		SchedulePage createvent = new SchedulePage(webdriver);
//		Thread.sleep(3000);
//		createvent.clickTitle();
//		createvent.clickTitle();
//		Thread.sleep(3000);
//		createvent.setTitle(title);
//		Thread.sleep(3000);
//		createvent.clickStart();
//		createvent.clickStartDate();
//		createvent.clickEnd();
//		createvent.clickEndDate();
//		createvent.dpdRepeat();
//		createvent.repeatEveryDay();
//		createvent.clickForever();
//		createvent.clickAddMembers();
//		Thread.sleep(3000);
//		createvent.clickMembers();
//		Thread.sleep(3000);
//		createvent.closeMembers();
		Thread.sleep(3000);
//		createvent.clickNotes();
		createvent.setNotes(title);
		Thread.sleep(3000);
		createvent.clickPostEvent();
	}
	
//	@Then("Event will be created")
//	public void EventPage() throws InterruptedException {
//		SchedulePage eventpage = new SchedulePage(webdriver);
//		Thread.sleep(3000);
//		assertTrue(eventpage.isDisplayed());
//	}
}
