package TestngFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Groups {
WebDriver driver;

	
	@Test(groups= {"smoke"})
	public void contact() {
		System.setProperty("webdriver.chrome.driver","D:\\selenium_material\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.btes.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click(); 
		

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		                                                                   
		
	}
	
	@Test(groups= {"smoke"})
	public void register()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Register Now')]")).click();

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
	}
	
	@Test(groups= {"regression"})
	public void logo()
	{
		Boolean dis = driver.findElement(By.cssSelector(".img-fluid")).isDisplayed();
		System.out.println(dis + " : Logo is Displayed");
		

		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//nav[@class='site-navigation active']/ul/li[2]"))).build().perform();

	}



}
