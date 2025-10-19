package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) throws InterruptedException {
		
		// Initialize the web driver object
		WebDriver driver=new FirefoxDriver();
						
		//Open the Web page
		driver.get("https://training-support.net/webelements/login-form");
		
		System.out.println("Title is: "+driver.getTitle());
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.cssSelector("button.svelte-1pdjkmx")).click();
		Thread.sleep(2000);
		String msg=driver.findElement(By.cssSelector("h2.text-gray-800")).getText();
		System.out.println(msg);
		driver.quit();

	}

}
