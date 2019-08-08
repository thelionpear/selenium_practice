package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {
	public static void main(String[] args) { 
	System.setProperty("webdriver.chrome.driver", "/Users/michellegarcia/Downloads/chromedriver");
	WebDriver driver = new ChromeDriver(); 
	driver.get("http://facebook.com");
//	driver.findElement(By.xpath("//*[@type='email']")).sendKeys("my own xpath");;
//	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hello");
//	driver.findElement(By.xpath("//input[@value='Log In']")).click();
	driver.findElement(By.cssSelector("input[name='email']")).sendKeys("my own css");
	driver.findElement(By.cssSelector("[value='Log In']")).click();
	}
}