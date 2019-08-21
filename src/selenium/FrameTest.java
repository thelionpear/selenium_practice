package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/michellegarcia/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://jqueryui.com/droppable/");
		//driver.switchTo().frame(1);
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		//driver.findElement(By.id("draggable")).click();
		Actions a = new Actions(driver); 
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent(); 
	}

}
