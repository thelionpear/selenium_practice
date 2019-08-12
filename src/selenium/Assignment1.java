package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/michellegarcia/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		//Check the first  Checkbox and 
		driver.findElement(By.id("checkBoxOption1")).click();
		//verify if it is successfully checked and 
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		//Uncheck it again to 
		driver.findElement(By.id("checkBoxOption1")).click();
		//verify if it is successfully Unchecked
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		//How to get the Count of number of check boxes present in the page
		int checkbox = driver.findElements(By.xpath("//input[@type=\'checkbox\']")).size(); 
		System.out.println(checkbox);
	}

}
