package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/michellegarcia/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		//click a checkbox 
		
		WebElement checkboxDriver = driver.findElement(By.id("checkbox-example"));
		checkboxDriver.findElement(By.tagName("input")).click();
		
		//grab text present 
		
		String optionText=checkboxDriver.findElement(By.xpath("//input[@type='checkbox']//parent::label")).getText();
		System.out.println(optionText);
		
		//select an option from the dropdown that matches option chosen from checkbox
		//not hardcoded 
		WebElement dropdownDriver = driver.findElement(By.id("dropdown-class-example")); 
		dropdownDriver.click();
		dropdownDriver.findElement(By.xpath("//*[text() = '"+optionText+"']")).click();
		
		//enter label text in edit box 
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']")).sendKeys(optionText);
		driver.findElement(By.id("alertbtn")).click();
		//click alert
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		//verify if text from step two is present in alert 
		Assert.assertTrue(alertText.contains(optionText));

	}

}
//the instructor code was really different so I'm pasting it here for reference 

//driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
//
//String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
//
//WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
//
//Select s=new Select(dropdown);
//
//s.selectByVisibleText(opt);
//
//driver.findElement(By.name("enter-name")).sendKeys(opt);
//
//driver.findElement(By.id("alertbtn")).click();
//
//String text=  driver.switchTo().alert().getText();
//
//if(text.contains(opt))
//
//{
//
//System.out.println("Alert message success");
//
//}
//
//else
//
//System.out.println("Something wrong with execution");
//
//}
//
//
//
//
//
////  System.out.println( driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText());   
