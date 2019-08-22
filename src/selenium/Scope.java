package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/michellegarcia/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://www.qaclickacademy.com/practice.php");
		//get initial number of links 
		System.out.println(driver.findElements(By.tagName("a")).size()); 
		//narrow scope to the footer element 
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		//get the size of links in just the footer 
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		//narrow scope further to first column of footer 
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		//get the size of just the links in the first column of the footer
		System.out.println(columnDriver.findElements(By.tagName("a")).size()); 

	}

}
