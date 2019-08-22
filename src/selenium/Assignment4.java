package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		//go to https://the-internet.herokuapp.com/windows
		System.setProperty("webdriver.chrome.driver", "/Users/michellegarcia/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		//click on the button 
		driver.findElement(By.linkText("Click Here")).click();
		//go to child window
		//print line from child window 
		System.out.println(driver.findElement(By.className("example")).getText());
		//go to parent 
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentid=it.next();
		driver.switchTo().window(parentid);
		//print that text 
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
	}

}
