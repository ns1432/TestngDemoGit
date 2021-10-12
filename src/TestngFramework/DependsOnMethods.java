package TestngFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {

	WebDriver driver;

	@Test
	public void startCar()
	{
		System.out.println("Car Started");
		Assert.fail();
	}

	@Test(dependsOnMethods= {"startCar"})
	public void driveCar()
	{
		System.out.println("Car Drived");
	}

	@Test(dependsOnMethods= {"startCar"})
	public void stopCar()
	{
		System.out.println("Car Stoped");
	}

	@Test(dependsOnMethods= {"startCar"},alwaysRun=true)
	public void parkCar()
	{
		System.out.println("Car Parked");
	}

}


