package activities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		Actions builder = new Actions(driver);
		
		driver.get("https://training-support.net/webelements/mouse-events");		
		System.out.println("Title is: "+driver.getTitle());
		
		// Find the buttons on the web page
		List<WebElement> buttons = driver.findElements(By.cssSelector("div.svelte-hs12g9"));
		
		// Left click on the Cargo lock button, move the cursor to the Cargo.toml button and then click it
		builder.click(buttons.get(0)).pause(Duration.ofSeconds(1)).click(buttons.get(1)).build().perform();
		
		// print the confirmation text at the end of sequence
		String message = driver.findElement(By.id("result")).getText();
		System.out.println(message);
		
		// Double click on the src button. Then right click on the target button and select open.
		builder.doubleClick(buttons.get(2)).pause(Duration.ofSeconds(2)).contextClick(buttons.get(3)).pause(Duration.ofSeconds(2)).perform();
		builder.click(driver.findElement(By.xpath("//span[text()='Open']"))).pause(Duration.ofSeconds(1)).build().perform();
		
		// print the confirmation text at the end of sequence
		String msg = driver.findElement(By.id("result")).getText();
		System.out.println(msg);
		
		driver.quit();

	}

}
