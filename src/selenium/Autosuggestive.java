package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {
//this script isn't working i think because some ids have been changed
	//i tried to play with it to make it work but kept getting errors 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/michellegarcia/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.makemytrip.com/");
		WebElement source=driver.findElement(By.id("fromCity"));
		Thread.sleep(2000);
//		source.clear();
		source.sendKeys("mum");
		Thread.sleep(1000);
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);
		
		WebElement destination=driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open')"));
		destination.clear();
		destination.sendKeys("DEL");
		Thread.sleep(2000);
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ENTER);
		
	}

}
