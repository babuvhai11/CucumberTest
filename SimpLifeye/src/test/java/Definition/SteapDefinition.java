package Definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Object.PageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SteapDefinition {

	public WebDriver driver;
	public PageObject lp;

	@Given("User open chrome browser")
	public void user_open_chrome_browser() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		lp = new PageObject(driver);

	}

	@When("Go to Url {string}")
	public void go_to_Url(String Url) throws Exception {
		Thread.sleep(2000);
		driver.get(Url);

	}

	@Then("User can view Login page")
	public void user_can_view_Login_page() {
		Assert.assertEquals("Simplifeye", driver.getTitle());
	}

	@When("User enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
		lp.SetEmail(email);
		lp.SetPassword(password);
	}

	@When("Click on login button")
	public void click_on_login_button() {
		lp.ClickLoginBtn();
	}

	@When("close browser")
	public void close_browser() {
		driver.close();
	}

}
