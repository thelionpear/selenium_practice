package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {
	//I had to comment out the below line to make my code work but I can't figure out why. 
//	static WebDriver driver = new ChromeDriver(); 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/michellegarcia/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://facebook.com");
//		driver.findElement(By.id("email")).sendKeys("this is my first code");
//		driver.findElement(By.name("pass")).sendKeys("123456");
//		driver.findElement(By.linkText("Forgot account?")).click();
		
		driver.findElement(By.cssSelector("#email")).sendKeys("emailaddress");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("123456");
	}
}
