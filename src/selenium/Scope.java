package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
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
		//click on each link to make sure they are working and getTitle of each tab 
		for (int i=1;i<columnDriver.findElements(By.tagName("a")).size();i++)
		{
			String clickOnLinkTab = Keys.chord(Keys.COMMAND, Keys.ENTER);
			
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(5000L);
			//sets all window handles to abc 
		}
		
		Set<String> abc = driver.getWindowHandles();//4
		//iterates over them 
		Iterator<String> it=abc.iterator(); 
		//as long as there is another window handle to iterate over, it will move to the next one and print the title
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
	}

}
