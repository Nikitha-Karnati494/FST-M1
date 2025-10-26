package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity20 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/alerts");
		System.out.println("title is "+driver.getTitle());
		
		// Find the button to open a PROMPT alert and click it.
		driver.findElement(By.id("prompt")).click();
		
		// Switch the focus from the main window to the Alert box and get the text in it and print it
		Alert promptAlert = driver.switchTo().alert();
		System.out.println(promptAlert.getText());
		
		// Type "Awesome!" into the prompt.
		promptAlert.sendKeys("Awesome!");
		promptAlert.accept();
		
		System.out.println(driver.findElement(By.id("result")).getText());
		
		driver.quit();
	}

}
