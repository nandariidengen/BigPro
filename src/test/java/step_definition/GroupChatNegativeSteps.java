package step_definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_object.DashboardPage;
import page_object.GroupChatPage;

public class GroupChatNegativeSteps {
	private WebDriver webdriver;

	public GroupChatNegativeSteps() {
		super();
		this.webdriver = Hooks.webdriver;
	}
	@Given("User on the Cicle App and click card on the Teams")
	public void cardTeams() {
		DashboardPage openteams = new DashboardPage(webdriver);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		openteams.isDisplayed();
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		openteams.clickCardTeams();
	}
	@When("User open the group chat and input \"(.*)\" as a message")
	public void message(String message) throws InterruptedException {
		GroupChatPage chat = new GroupChatPage(webdriver);
		Thread.sleep(5000);
		chat.clickGroupChat();
		Thread.sleep(3000);
		chat.setMessage(message);
	}
	@Then("Cannot send message")
	public void sendMessage() throws InterruptedException {
		GroupChatPage send = new GroupChatPage(webdriver);
		Thread.sleep(3000);
		send.clickSend();
		Thread.sleep(2000);
	}
}
