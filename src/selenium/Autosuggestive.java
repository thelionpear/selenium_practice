package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {
//this script isn't working i think because some ids have been changed
	//i tried to play with it to make it work but kept getting errors 
	//i fixed the xpath but it still doesn't want to arrow down after typing 'mum' 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/michellegarcia/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.makemytrip.com/");
		WebElement source=driver.findElement(By.xpath("//label[@for='fromCity']"));
//		Thread.sleep(2000);
//		source.clear();
		source.sendKeys("mum");
		Thread.sleep(3000);
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);
		
		WebElement destination=driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open')"));
		destination.clear();
		destination.sendKeys("DEL");
		Thread.sleep(2000);
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ENTER);
		
	}
//original code snippet 
	//WebElement source=driver.findElement(By.id("hp-widget__sfrom"));
//	source.clear();
//	source.sendKeys("MUM");
//	Thread.sleep(2000);
//	source.sendKeys(Keys.ENTER);
//	a
//	WebElement destination=driver.findElement(By.id("hp-widget__sTo"));
//	destination.clear();
//	destination.sendKeys("DEL");
//	Thread.sleep(2000);
//	destination.sendKeys(Keys.ARROW_DOWN);
//	destination.sendKeys(Keys.ENTER);
}
