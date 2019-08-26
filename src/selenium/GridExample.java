package selenium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GridExample {
	//see the lecture on this topic for more. I didn't follow every step on this part. 
	// protected ThreadLocal<RemoteWebDriver> threadDriver = null;

	public static void main(String[] args) throws MalformedURLException {

		WebDriver driver;

		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability(FirefoxDriver.BINARY, new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe").getAbsolutePath());

		driver = new RemoteWebDriver(new URL("http://192.168.0.106:5566/wd/hub"), capabilities);

		driver.get("http://google.com");
		System.out.println(driver.getTitle());
	}
}

//Commands in Hub Machine
//1.Setting Up Hub:
//java -jar selenium-server-standalone-2.44.0.jar -role hub
//2.Validating Hub started 
//http://localhost:4444/grid/console //4444 didn't work on my machine so I added "-port 3000" and it worked 
//Commands in Node Machine
//3.Accessing Hub from Node Machine
//http://iporhostnameofHub:4444/grid/console 
//4.Registering Node with Hub
//Java –jar selenium-server-standalone-2.44.0.jar –role webdriver –hub http://iporhostnameofHub:4444/grid/register -port 5566
