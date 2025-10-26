package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity19 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/alerts");
		System.out.println("title is "+driver.getTitle());
		
		// Find the button to open a CONFIRM alert and click it
		driver.findElement(By.id("confirmation")).click();
		
		//Switch the focus from the main window to the Alert box and get the text in it and print it.
		Alert AlertBox = driver.switchTo().alert();
		System.out.println(AlertBox.getText());
		
		// Close the alert with Ok 
		AlertBox.accept();
		System.out.println(driver.findElement(By.id("result")).getText());
		
		// Close the alert with Cancel
		// AlertBox.dismiss();
		// System.out.println(driver.findElement(By.id("result")).getText());
		
		driver.quit();

	}

}
