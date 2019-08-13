package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		//cleartrip.com
		System.setProperty("webdriver.chrome.driver", "/Users/michellegarcia/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		//select any number of adults 
		driver.findElement(By.id("Adults")).click();
		driver.findElement(By.xpath("//option[@value='5']")).click();
		//select any number of children
		driver.findElement(By.id("Childrens")).click();
		driver.findElement(By.xpath("//select[@id='Childrens']//option[@value='4']")).click();
		//select calendar, and choose today's date 
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();
		//click more options
		driver.findElement(By.id("MoreOptionsLink")).click();
		//enter preferred airline
		driver.findElement(By.id("AirlineAutocomplete")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Delta");
		//click on search button 
		driver.findElement(By.id("SearchBtn")).click();
		//grab error message and print in output 
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		driver.quit();
	}

}
		//parts of the teacher's code that were different and interesting to me
		//WebElement adult=driver.findElement(By.id("Adults"));
		//Select s =new Select(adult);
		//s.selectByIndex(2);
		////DD2
		//WebElement ch=driver.findElement(By.id("Childrens"));
		//Select s1 =new Select(ch);
		//s1.selectByIndex(2);

		//I also liked this code by a student 
		//WebElement a= driver.findElement(By.xpath("//select[@id='Adults']"));
//		WebElement b= driver.findElement(By.xpath("//select[@id='Childrens']"));
//		WebElement c= driver.findElement(By.xpath("//select[@id='Infants']"));
//		Select s= new Select(a);
//		Select s1= new Select(b);
//		Select s2= new Select(c);
//		s.selectByValue("8");
//		s1.selectByVisibleText("1");
//		s2.selectByValue("2");


