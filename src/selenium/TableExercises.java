package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExercises {

	public static void main(String[] args) {
		int sum = 0; //setting variable for logic below 
		System.setProperty("webdriver.chrome.driver", "/Users/michellegarcia/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		//may need to update by going to site>>all matches>>scorecard>>pick a match with grid scorecards 
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/22955/sl-vs-nz-2nd-test-new-zealand-tour-of-sri-lanka-2019");
		//narrow scope to first table because cssSelector is same among multiple elements
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		//div:nth-child(3) is how we get to the third column that has the scores 
		//set the size of the table to a variable so logic below knows how many times to loop through the grid 
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"))
				.size();
		//loops through grid, grabs the score as a string, converts to int, adds to sum 
		//-2 because the last two rows are "extra" and "total" 
		for (int i = 0; i < count - 2; i++) {
			String value = table
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i)
					.getText();
			int valueinteger = Integer.parseInt(value);
			sum = sum + valueinteger;
		}
		//grab the extra, set to string variable, turn into integer, add to sum 
		String Extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extrasValue = Integer.parseInt(Extras);
		int TotalSumValue = sum + extrasValue;
		System.out.println(TotalSumValue);
		//gets the total number by traversing to sibling xpath 
		String ActualTotal = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int ActualTotalVAlue = Integer.parseInt(ActualTotal);
		//compares the total we created to the total posted 
		if (ActualTotalVAlue == TotalSumValue) {
			System.out.println("Count Matches");
		} else {
			System.out.println("count fails");
		}
	}
}
