package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChildWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/michellegarcia/Downloads/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/signup");
		//this is supposed to click on a link that says "learn more" but the link doesn't have that anymore
		//I switched it to click on "help" and it switches to the child window but doesn't print the correct title
		driver.findElement(By.xpath("/html/body/div[1]/div/footer/ul/li[1]/a")).click();
		System.out.println(driver.getTitle());
		//gets number of windows opened 
		Set<String>ids=driver.getWindowHandles();
		//iterates over strings in ids 
		Iterator<String> it = ids.iterator();
		//sets first one to parent 
		String parentid=it.next();
		//sets second to child
		String childid=it.next();
		//switches to child
		driver.switchTo().window(childid);
		//prints title of child 
		System.out.println("this is the second window");
		//it isn't running this line for some reason, but it is moving windows, I think 
		WebDriverWait d = new WebDriverWait(driver, 20);
		d.until(ExpectedConditions.titleContains("Google Account Help"));
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentid); 
	}

}
