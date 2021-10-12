package TestngFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	WebDriver driver;
	
	@Test
	public void contact() {
		System.setProperty("webdriver.chrome.driver","D:\\selenium_material\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.btes.co.in/");
		driver.manage().window().maximize();
		 
	}
	
	@Test(dataProvider="getData")
	public void form2(String ab,String cd)
	{
		System.out.println(ab);
		System.out.println(cd);
	}
	
	@DataProvider()
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0]="first";
		data[0][1]="pass";
		
		data[1][0]="second";
		data[1][1]="pass";
		
		data[2][0]="third";
		data[2][1]="fail";
		return data;
	}

}
