package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13 {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/tables");
		
		System.out.println("page title is"+driver.getTitle());
		
		// Find the number of columns in the table and print them
		List<WebElement> cols=driver.findElements(By.xpath("//table/thead/tr/th"));
		System.out.println("number of columns are: "+cols.size());
		
		List<WebElement> rows=driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("number of rows are: "+rows.size());
		
		// Find and print all the cell values in the third row of the table
		// String thirdrow=driver.findElement(By.xpath("//table/tbody/tr[3]")).getText();
		
		List<WebElement> thirdRow = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
		for (WebElement cell:thirdRow) {
			System.out.println(cell.getText());
		}
		
		// Find and print the cell value at the second row second column
		String secondRowSecondColumn = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		System.out.println(secondRowSecondColumn);
		
		driver.quit();

	}

}
