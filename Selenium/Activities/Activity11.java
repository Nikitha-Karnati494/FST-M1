package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("Page title is: "+driver.getTitle());
		
		// find the checkbox on the page
		WebElement ele=driver.findElement(By.id("checkbox"));
		System.out.println("checkbox is visible? "+ele.isDisplayed());
		
		// find and click the toggle checkbox
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		
		// Wait for checkbox to disappear
		wait.until(ExpectedConditions.invisibilityOf(ele));
		System.out.println("checkbox is visible? "+ele.isDisplayed());
		
		// Toggle the check box again
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
		System.out.println("checkbox is selected? "+ele.isSelected());
		
		driver.quit();
		
	}

}
