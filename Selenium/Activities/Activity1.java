package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) throws InterruptedException {
		
		// Initialize the web driver object
		WebDriver driver=new FirefoxDriver();
				
		//Open the Web page
		driver.get("https://training-support.net");
		
		System.out.println("Home page Title is: "+driver.getTitle());
		
		// Find and click the About us button
		driver.findElement(By.cssSelector("a.card.svelte-4bhb3l")).click();
		//driver.findElement(By.linkText("About Us")).click();
		Thread.sleep(2000);
		//print the new page title
		System.out.println("About page Title is: "+driver.getTitle());
		
		driver.quit();

	}

}
