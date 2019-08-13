package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		//cleartrip.com
		System.setProperty("webdriver.chrome.driver", "/Users/michellegarcia/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		//select any number of adults 
		driver.findElement(By.id("Adults")).click();
		driver.findElement(By.xpath("//option[@value='5']")).click();
		//select any number of children
		driver.findElement(By.id("Childrens")).click();
		driver.findElement(By.xpath("//select[@id='Childrens']//option[@value='4']")).click();
		//select calendar, and choose today's date 
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();
		//click more options
		driver.findElement(By.id("MoreOptionsLink")).click();
		//enter preferred airline
		driver.findElement(By.id("AirlineAutocomplete")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Delta");
		//click on search button 
		driver.findElement(By.id("SearchBtn")).click();
		//grab error message and print in output 
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
	}

}
