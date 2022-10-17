package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSteps {
	private WebDriver driver;

	@Given("^Open Facebook application$")
	public void openFacebookApplication() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Then("^Verify Email texbox is displayed$")
	public void verifyEmailTexboxIsDisplayed() {
		Assert.assertTrue(driver.findElement(By.id("email")).isDisplayed());

	}

	@Then("^Verify Password textbox is displayed$")
	public void verifyPasswordTextboxIsDisplayed() {
		Assert.assertTrue(driver.findElement(By.id("pass")).isDisplayed());

	}

	@Then("^Close application$")
	public void closeApplication() {
		driver.quit();
	}
}
