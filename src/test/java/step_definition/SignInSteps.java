package step_definition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_object.DashboardPage;

public class SignInSteps {
	private WebDriver webdriver;

	public SignInSteps() {
		super();
		this.webdriver = Hooks.webdriver;
	}

	@Given("User on the Cicle App Page")
	public void openCicleApp() {
		DashboardPage dashboard = new DashboardPage(webdriver);
		dashboard.isDisplayed();
		String expectedTitle = "Home";
		String actualTitle = webdriver.getTitle();

		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Assert passed");
	}

	@When("User Sign In with Google Account")
	public void signIn() throws InterruptedException {
		DashboardPage account = new DashboardPage(webdriver);
		account.clickProfile();
		System.out.println("profile");
		Thread.sleep(5000);
		String expectedProfile = "Christin Nanda";
		Thread.sleep(5000);
		String actualProfile = account.getName();
		Thread.sleep(5000);
		Assert.assertEquals(expectedProfile, actualProfile);

	}

	@Then("User will be direct on the dashboard")
	public void dashboardCicleApp() throws InterruptedException {
		DashboardPage dashboard = new DashboardPage(webdriver);
		dashboard.isDisplayed();
	}

}
