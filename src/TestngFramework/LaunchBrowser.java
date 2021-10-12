package TestngFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LaunchBrowser{
	public static WebDriver driver;

	@BeforeSuite
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_material\\chromedriver_win32\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.get("https://www.btes.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@AfterSuite
	public void close()
	{
		driver.close();
	}
	
}


