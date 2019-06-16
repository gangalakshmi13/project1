package objectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Flights {

	public static By searchFlights_radio_oneway = By.xpath("//input[@id='OneWay']");
	public static By searchFlights_radio_roundTrip = By.xpath("//input[@id='RoundTrip']");
	public static By searchFlights_radio_multicity = By.xpath("//input[@id='MultiCity']");
	public static By searchFlights_edit_fromLoc = By.xpath("//input[@id='FromTag']");
	public static By searchFlights_edit_toLoc = By.xpath("//input[@id='ToTag']");
	public static By searchFlights_icon_date = By
			.xpath("//div[contains(@class,'searchForm clearFix')]//div[1]//dl[1]//dd[1]//div[1]//a[1]//i[1]");
	public static By searchFlights_drpdoen_adults = By.xpath("//select[@id='Adults']");
	public static By searchFlights_drpdoen_childrens = By.xpath("//select[@id='Childrens']");
	public static By searchFlights_drpdoen_infants = By.xpath("//select[@id='Infants']");
	public static By searchFlights_btn_searchFlights = By.xpath("//input[@id='SearchBtn']");

	public static void selectOneWay(WebDriver driver) {
		driver.findElement(searchFlights_radio_oneway).click();
	}

	public static void selectRoundTrip(WebDriver driver) {
		driver.findElement(searchFlights_radio_roundTrip).click();
	}

	public static void selectMulticity(WebDriver driver) {
		driver.findElement(searchFlights_radio_multicity).click();
	}

	public static void setFromLoc(WebDriver driver) {
		driver.findElement(searchFlights_edit_fromLoc).sendKeys("hyd");
		;
	}

	public static void setToLoc(WebDriver driver) {
		driver.findElement(searchFlights_edit_toLoc).sendKeys("bang");
		;
	}

	public static void selectDate(WebDriver driver) {
		driver.findElement(searchFlights_icon_date).click();
	}

	public static void selectAdults(WebDriver driver) {
		new Select(driver.findElement(searchFlights_radio_oneway)).selectByIndex(2);
		;
	}

}
