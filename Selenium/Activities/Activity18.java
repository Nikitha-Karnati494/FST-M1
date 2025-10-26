package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity18 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/alerts");
		System.out.println("title is "+driver.getTitle());
		
		// Find the button to open a SIMPLE alert and click it
		driver.findElement(By.id("simple")).click();
		
		// Switch the focus from the main window to the Alert box and get the text in it and print it
		Alert simpleAlert = driver.switchTo().alert();
		System.out.println(simpleAlert.getText());
		
		// click OK on the alert
		simpleAlert.accept();
		
		System.out.println(driver.findElement(By.id("result")).getText());
		
		driver.quit();
		
	}

}
