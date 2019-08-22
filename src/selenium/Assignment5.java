package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/michellegarcia/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame(0);
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.id("content")).getText()); 
	}
}
