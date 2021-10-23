package step_definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.DashboardPage;
import page_object.GroupChatPage;
import page_object.TeamsPage;

public class GroupChatSteps {
	private WebDriver webdriver;
	
	String expectedTitle;
	
	public GroupChatSteps() {
		super();
		this.webdriver = Hooks.webdriver;
	}
	
	@Given("User already login on the Cicle App and click card on the Teams")
	public void cicleApp() throws InterruptedException {
		DashboardPage openteams = new DashboardPage(webdriver);
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		openteams.isDisplayed();
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		expectedTitle = openteams.getTitleTeams();
		Thread.sleep(3000);
		openteams.clickCardTeams();
	}
	
	@And("User on the Teams Page")
	public void teamsPage() {
		TeamsPage teams = new TeamsPage(webdriver);
		String actualTitle = teams.getTitleTeams();
		
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	@When("User click group chat and input \"(.*)\" as a message")
	public void Message(String message) throws InterruptedException {
		GroupChatPage chat = new GroupChatPage(webdriver);
		Thread.sleep(5000);
		chat.clickGroupChat();
		Thread.sleep(3000);
		chat.setMessage(message);
		String expectedText = chat.getMessage();
		chat.clickSend();
		
		String actualText = chat.getLastText();
		Assert.assertEquals(expectedText, actualText);
	}
	
	@And("User click attach File and input \"(.*)\"")
	public void uploadFile(String image) throws InterruptedException {
		GroupChatPage upload = new GroupChatPage(webdriver);
		upload.uploadPhoto(image);
		Thread.sleep(3000);
	}
	
	@Then("Message already sent")
	public void sendMessage() throws InterruptedException {
		GroupChatPage send = new GroupChatPage(webdriver);
		String expectedMessage = "Upload attachments is success";
		String actualMessage = send.getActualMessage();
		
		Assert.assertEquals(expectedMessage, actualMessage);
	}
	
	
}
