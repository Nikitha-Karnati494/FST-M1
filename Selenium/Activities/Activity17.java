package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/selects");
		System.out.println("title is "+driver.getTitle());
		
		// Find the select element
		WebElement selectElement = driver.findElement(By.cssSelector("select.h-80"));
		
		// Pass the WebElement to the Select object
		Select multiSelect = new Select(selectElement);
		
		// Deselect Rust first option
		multiSelect.deselectAll();
		
		// Select the "HTML" option using the visible text.
		multiSelect.selectByVisibleText("HTML");
		System.out.println(multiSelect.getFirstSelectedOption().getText());
		
		// select the 4th, 5th and 6th options using the index
		for(int i=3;i<=5;i++) {
			multiSelect.selectByIndex(i);
		}
	
		// Select the "Node" option using the value.
		multiSelect.selectByValue("nodejs");
			
		// Deselect the 5th option using index.
		multiSelect.deselectByIndex(4);
		
		// Printing all the options
		for (WebElement option:multiSelect.getAllSelectedOptions()) {
			System.out.println(option.getText());
		}
		
		driver.quit();
	}

}
