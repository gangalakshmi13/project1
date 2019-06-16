package tests;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepo.Flights;
import objectrepo.PF_Flights;

public class FlightsTest_Example {

	@Test
	public void test() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		PF_Flights flights=new PF_Flights(driver); 
		
		flights.selectRoundTrip();
		flights.setFromLoc();
		flights.setToLoc();
		Thread.sleep(5000);
		
		driver.quit();

	}

}
