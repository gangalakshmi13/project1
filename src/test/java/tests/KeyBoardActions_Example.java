package tests;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActions_Example {

	@Test
	public void test() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		action.click(driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"))).perform();
		Thread.sleep(5000);
		action.sendKeys(driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")),
				"mobiles").perform();
		// action.sendKeys("fhgfjhdfkgju");
		Thread.sleep(5000);
		action.sendKeys(Keys.chord(Keys.ALT,Keys.F4));
		action.sendKeys(driver.findElement(By.id("")), Keys.TAB);
		Keyboard key=((HasInputDevices)driver).getKeyboard();
		key.pressKey(Keys.TAB);
		key.releaseKey(Keys.ENTER);
		key.sendKeys("fshdghgjgf");
		
		driver.quit();

	}

}
