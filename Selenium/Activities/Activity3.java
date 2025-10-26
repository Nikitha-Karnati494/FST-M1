package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/login-form");
		System.out.println("Title of the page is: "+driver.getTitle());
		
		// Locating user name and password with xpath and providing the values
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		Thread.sleep(2000);
		
		String message = driver.findElement(By.xpath("//h1[contains(text(),'Success')]")).getText();
		System.out.println(message);
		
		driver.quit();

	}

}
