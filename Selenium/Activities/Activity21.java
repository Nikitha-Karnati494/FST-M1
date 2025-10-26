package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity21 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/tabs");
		System.out.println("title is "+driver.getTitle());
		
		// printing the handle of current tab
		System.out.println("current handle is "+driver.getWindowHandle());
		
		// Find the button to open a new tab and click it.
		driver.findElement(By.xpath("//button[text()='Open A New Tab']")).click();
		// wait for the second tab to open 
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		// print the handles of all open tabs
		System.out.println("all open handles are "+driver.getWindowHandles());
		
		// Switch focus to the latest/newest tab
		for (String handle:driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		
		// print the current window handle
		System.out.println("current handle is "+driver.getWindowHandle());
		// print the title and message from new page
		System.out.println("title: "+driver.getTitle());
		System.out.println(driver.findElement(By.cssSelector("h2.text-gray-800")).getText());

		driver.quit();
		
	}

}
