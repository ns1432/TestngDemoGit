package TestngFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	WebDriver driver;

	SoftAssert sa = new SoftAssert();
	
	@Test
	public void contact() {
		System.setProperty("webdriver.chrome.driver","D:\\selenium_material\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.btes.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click(); 
		
		sa.assertEquals("driver.findElement(By.xpath(\"//a[contains(text(),'Contact Us')]\")).click(); ", "driver.findElement(By.xpath(\"//a[contains(text(),'Contact Us')]\")).click(); ");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		                                                  
	}
	

}
