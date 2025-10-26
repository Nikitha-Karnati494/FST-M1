package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity22 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://training-support.net/webelements/popups");
		System.out.println("title of the page is: "+driver.getTitle());
		
		WebElement button=driver.findElement(By.id("launcher"));
		button.click();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.cssSelector("button.svelte-1pdjkmx")).click();
		
		String successmessage = driver.findElement(By.xpath("//h2")).getText();
		System.out.println("success message is: "+successmessage);		
		
		driver.quit();				
	}

}
