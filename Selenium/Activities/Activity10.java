package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		Actions builder = new Actions(driver);
		
		driver.get("https://training-support.net/webelements/drag-drop");
		System.out.println("page title is: "+driver.getTitle());
		
		// find the element football
		WebElement football = driver.findElement(By.id("ball"));
		// find the element dropzone1
		WebElement dropzone1 = driver.findElement(By.id("dropzone1"));
		// find the element dropzone2
		WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
		
		// Perform drag and drop to dropzone1
		builder.clickAndHold(football).moveToElement(dropzone1).pause(5000).release().build().perform();
		
		if(dropzone1.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
			System.out.println("Ball was dropped in dropzone1");
		}
		
		// perform drag and drop to dropzone2
		builder.dragAndDrop(football, dropzone2).pause(5000).build().perform();
		
		if(dropzone2.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
			System.out.println("Ball was dropped in dropzone2");
		}
		
		driver.quit();
	}

}
