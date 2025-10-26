package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println(driver.getTitle());
		
		// find the text field
		WebElement textbox = driver.findElement(By.id("textInput"));
		System.out.println("is textbox enabled? "+textbox.isEnabled());
		
		driver.findElement(By.id("textInputButton")).click();
		System.out.println("is textbox enabled? "+textbox.isEnabled());
		
		textbox.sendKeys("test string");
		System.out.println(textbox.getDomProperty("value"));
		
		driver.quit();
	}

}
