package TestngFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class HomePage extends LaunchBrowser {

	@Test()
	public void register()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Register Now')]")).click();

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
	}
	@Test()
	public void form() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='fullName' and @placeholder='Full Name']")).sendKeys("vijaykumar");
		driver.findElement(By.xpath("//div[@class='form-group required mandatory']/textarea")).sendKeys("1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@123");
	
	}
	
	@Test
	public void logo()
	{
		Boolean dis = driver.findElement(By.cssSelector(".img-fluid")).isDisplayed();
		System.out.println(dis + " : Logo is Displayed");
		

		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//nav[@class='site-navigation active']/ul/li[2]"))).build().perform();

	}


	

	}




