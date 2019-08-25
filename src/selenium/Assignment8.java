package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/michellegarcia/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		//go to practice page of his website 
		driver.get("http://www.qaclickacademy.com/practice.php");
		//click on suggestion class example
		driver.findElement(By.id("autocomplete")).click();
		//send keys "United States" 
		driver.findElement(By.id("autocomplete")).sendKeys("United");
		Thread.sleep(2000);

		//locate the match 
		JavascriptExecutor js = (JavascriptExecutor) driver;

		String script = "return document.getElementById(\"autocomplete\").value;";
		String text = (String) js.executeScript(script);
		int i = 0;
//BENGALURU INTERNATION AIPORT
		while (!text.equalsIgnoreCase("United States")) {
			i++;
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

			text = (String) js.executeScript(script);
			System.out.println(text);
			if (i > 5) {
				break;
			}

		}

		if (i > 5) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element  found");
		}

	}

}
