package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		//create driver object 
		System.setProperty("webdriver.chrome.driver", "/Users/michellegarcia/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver(); 
		//hit url on the browser 
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		//helps to prevent hacker from redirecting
		System.out.println(driver.getCurrentUrl());//validate if you went to the correct url
		//gets source info especially when the website blocks the right click>> page source 
		//prints a lot though so commenting it out 
		//System.out.println(driver.getPageSource()); 
		driver.get("http://yahoo.com"); 
		//basically the back button
//		driver.navigate().back(); 
//		//go forward
//		driver.navigate().forward();
		//difference between below. Close closes the current browser.
		//Quit closes all browsers opened by Selenium/ child windows 
		//driver.close();
		//driver.quit(); 
	}

}
