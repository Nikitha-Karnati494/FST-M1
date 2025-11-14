package stepDefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TSHomepageSteps extends BaseClass {
	
	@Given("user is on the TS home page")
	public void openHomePage() {
		// open the TS home page
		driver.get("https://training-support.net");
		// Assertion
		Assertions.assertEquals(driver.getTitle(), "Training Support");
	}
	
	@When("user clicks on the About us link")
	public void clikAboutUsLink() {
		// locate about us link and click it
		driver.findElement(By.linkText("About Us")).click();
	}

	@Then("they are redirected to another page")
	public void verifyAboutPage() {
		wait.until(ExpectedConditions.titleIs("About Training Support"));
		String pageHeading = driver.findElement(By.cssSelector("h1.text-center")).getText(); 
		System.out.println("New page title is: " + pageHeading);
		assertEquals(pageHeading, "About Us");
	}
}
