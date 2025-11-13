package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestActivity6 {
	
	// Driver object
	WebDriver driver;
	WebDriverWait wait;
	
	// Setup function
	@BeforeClass(alwaysRun=true)
	public void setUp() {
		// Initialize driver
		driver = new FirefoxDriver();
		// open the page
		driver.get("https://training-support.net/webelements/login-form");
	}
	
	@Test
	@Parameters({ "username", "password", "message" })
	public void loginTestCase(String username, String password, @Optional("Login Success!") String message) throws InterruptedException {
        // Find user name and password fields
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
 
        // Enter credentials
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
 
        // Click the submit button
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
 
        // Wait for the success page to load
        // Thread.sleep(3000);
        wait.until(ExpectedConditions.titleContains("Success!"));
 
        // Assert login message
        String loginMessage = driver.findElement(By.cssSelector("h2.text-center")).getText();
        Assert.assertEquals("Welcome Back, Admin!", loginMessage);
    }
	
	// Teardown function
	@AfterClass(alwaysRun=true)
	public void tearDown() {
		// close the browser
		driver.quit();
	}

}
