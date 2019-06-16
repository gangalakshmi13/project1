package tests;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_Example {

	@Test
	public void test() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		action.click(driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"))).perform();
		Thread.sleep(5000);
		
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'TVs & Appliances')]"))).perform();
		Thread.sleep(5000);
		action.clickAndHold(driver.findElement(By.id("")))
		.dragAndDrop(driver.findElement(By.id("")), driver.findElement(By.id(""))).build().perform();
		
		//action.sendKeys("fhgfjhdfkgju");
		driver.quit();

	}

}
