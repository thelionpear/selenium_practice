package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		//create driver object 
		//the two lines below are the only ones that change when you change browsers
		System.setProperty("webdriver.gecko.driver", "/Users/michellegarcia/Downloads/geckodriver");
		WebDriver driver=new FirefoxDriver(); 
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
	}

}