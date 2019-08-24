package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/michellegarcia/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		//go to practice page of his website 
		driver.get("http://www.qaclickacademy.com/practice.php");
		//find the grid element
		WebElement gridDriver = driver.findElement(By.id("product")); 
		//print the number of rows, should be 11 including header 
		int rowCount = gridDriver.findElements(By.tagName("tr")).size();
		System.out.println("Number of rows is " + rowCount);
		//print the number of columns, should be 3 
		int columnCount = gridDriver.findElements(By.xpath("//table[@id='product']//tbody//tr[1]//th")).size();
		System.out.println("Numer of columns is " + columnCount);
		//print the content of row 2, should be "rahul shetty; Learn SQL in Practical + Database Testing from Scratch; 25"
		for(int i=0; i<columnCount; i++) 
		{
			System.out.println(
				"The content of row 2, column " + (i+1) + " is: " + gridDriver.findElements(By.xpath("//table[@id='product']//tbody//tr[3]//td")).get(i).getText());
		}
	}
}
