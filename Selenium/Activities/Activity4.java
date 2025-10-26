package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class Activity4 {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/target-practice");
		System.out.println("Title of the page is: "+driver.getTitle());
		
		// Find the 3rd header and print its text
		String thirdheadertext = driver.findElement(By.xpath("//h3[contains(text(),'#3')]")).getText();
		System.out.println(thirdheadertext);
		
		// Find the 5th header on the page and print it's color
		
		Color fifthHeaderColor = Color.fromString(driver.findElement(By.xpath("//h5[text()='Heading #5']")).getCssValue("color"));
		System.out.println(fifthHeaderColor.getColor());
		
		// Find the violet button and print its classes
        String purpleButtonClass = driver.findElement(By.xpath("//button[text()='Purple']")).getDomAttribute("class");
        System.out.println(purpleButtonClass);
        
        // Find the grey button and print its text
        String slateButtonText = driver.findElement(By.xpath("//button[contains(@class, 'slate')]")).getText();
        System.out.println(slateButtonText);
        
        driver.quit();
					
	}

}
