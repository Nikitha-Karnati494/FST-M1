package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		// open the page
		driver.get("https://training-support.net/webelements/dynamic-content");
		
		// page title verification
		System.out.println("page title is: "+driver.getTitle());
		
		// find and click the button
		driver.findElement(By.id("genButton")).click();
		
		// find the word element
		WebElement wordelement = driver.findElement(By.id("word"));
		
		// wait for required word
		wait.until(ExpectedConditions.textToBePresentInElement(wordelement, "release"));
		
		// print the word
		System.out.println(wordelement.getText());
		
		driver.quit();

	}

}
