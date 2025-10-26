package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity15 {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://training-support.net/webelements/dynamic-attributes");
		System.out.println("title is: "+driver.getTitle());
		
		// find the web elements
		WebElement fullname = driver.findElement(By.xpath("//input[starts-with(@id,'full-name')]"));
		WebElement email=driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
		WebElement date=driver.findElement(By.xpath("//input[@type='date']"));
		WebElement txtarea=driver.findElement(By.xpath("//textarea"));
		
		fullname.sendKeys("nikitha");
		email.sendKeys("abc@gmail.com");
		date.sendKeys("2025-10-10");
		txtarea.sendKeys("learning selenium");
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		String successmsg=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation"))).getText();
		System.out.println("success msg is: "+successmsg);
		
		driver.quit();
		
	}

}
