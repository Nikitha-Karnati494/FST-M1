package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity14 {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/tables");
		System.out.println("page title is: "+driver.getTitle());
		
		// Find the number of rows and columns in the table and print them
		List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class,'table-auto')]/thead/tr/th"));
		System.out.println("cols size is: "+cols.size());
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'table-auto')]/tbody/tr"));
		System.out.println("rows size is: "+rows.size());
		
		// Find and print the Book Name in the 5th row
		WebElement fifthRowBook = driver.findElement(By.xpath("//table[contains(@class,'table-auto')]/tbody/tr[5]/td[2]"));
		System.out.println("Book name before sorting " + fifthRowBook.getText());
		
		// Click the header of the Price column to sort it in ascending order
		driver.findElement(By.xpath("//table[contains(@class,'table-auto')]/thead/tr/th[5]")).click();
		
		// print the book name in 5th row again
		fifthRowBook=driver.findElement(By.xpath("//table[contains(@class,'table-auto')]/tbody/tr[5]/td[2]"));
		System.out.println("book name after sorting "+fifthRowBook.getText());
		
		driver.quit();
		
	}

}
