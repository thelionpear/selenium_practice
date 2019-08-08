package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/michellegarcia/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
//		Select s = new Select(driver.findElement(By.id("divpaxinfo")));
//		the dropdown has changed so these below don't work. They would work if the selections
//		were in a list, but each selection has a + and - now. They are all divs. 
//		for below it needs to be a select tag and all options have options tag
//		s.selectByValue("2");
//		s.selectByIndex(2);
//		s.selectByVisibleText("5 adults");
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("USD");
		driver.findElement(By.id("divpaxinfo")).click();
		//the try/catch isn't in the lesson code, but i kept getting "unhandled exception type
		//interruptedexception so I found the code below on stackoverflow 
		//don't normally use Thread.sleep below. Just a shortcut until we cover explicit wait
		try {
		    Thread.sleep(2000L);
		} catch(InterruptedException e) {
		    System.out.println("got interrupted!");
		}
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		int i = 1; //alternatively, for(int i=1; i<5; i++)
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
	}

}
