package tests;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows_Example {

	@Test
	public void test() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(),'SME Travel')]")).click();
		Thread.sleep(5000);
		/*Set<String> wins=driver.getWindowHandles();
		Object obj[]=wins.toArray();
		String win=obj[1].toString();*/		
		//String win2=driver.getWindowHandles().toArray()[1].toString();
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("abcdefgh");
		Thread.sleep(5000);
		driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
		driver.close();
		Thread.sleep(5000);
		driver.quit();

	}

}
