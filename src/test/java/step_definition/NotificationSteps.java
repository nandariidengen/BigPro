package step_definition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import page_object.DashboardPage;
import page_object.NotificationPage;

public class NotificationSteps {
	private WebDriver webdriver;

	public NotificationSteps() {
		super();
		this.webdriver = Hooks.webdriver;
	}
	
	@Given("User already on the Cicle Page")
	public void openCicle() {
		DashboardPage notif = new DashboardPage(webdriver);
		notif.isDisplayed();
	}
	
	@And("User click lbl bell and click View all notification")
	public void viewNotif() throws InterruptedException {
		NotificationPage bell = new NotificationPage(webdriver);
		Thread.sleep(10000);
		bell.clickBell();
		Thread.sleep(10000);
		bell.clickNotif();
	}
}
