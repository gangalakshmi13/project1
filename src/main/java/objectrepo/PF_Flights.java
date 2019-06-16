package objectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PF_Flights {
	
	public WebDriver driver;
	
	public PF_Flights(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath = "//input[@id='OneWay']")
	public WebElement searchFlights_radio_oneway;

	@FindBy(xpath = "//input[@id='RoundTrip']")
	public WebElement searchFlights_radio_roundTrip;

	@FindBy(xpath = "//input[@id='MultiCity']")
	public WebElement searchFlights_radio_multicity;

	@FindBy(xpath = "//input[@id='FromTag']")
	public WebElement searchFlights_edit_fromLoc;

	@FindBy(xpath = "//input[@id='ToTag']")
	public WebElement searchFlights_edit_toLoc;

	@FindBy(xpath = "//div[contains(@class,'searchForm clearFix')]//div[1]//dl[1]//dd[1]//div[1]//a[1]//i[1]")
	public WebElement searchFlights_icon_date;

	@FindBy(xpath = "//select[@id='Adults']")
	public WebElement searchFlights_drpdoen_adults;

	@FindBy(xpath = "//select[@id='Childrens']")
	public WebElement searchFlights_drpdoen_childrens;

	@FindBy(xpath = "//select[@id='Infants']")
	public WebElement searchFlights_drpdoen_infants;

	@FindBy(xpath = "//input[@id='SearchBtn']")
	public By searchFlights_btn_searchFlights;

	public void selectOneWay() {
		searchFlights_radio_oneway.click();
	}

	public void selectRoundTrip() {
		searchFlights_radio_roundTrip.click();
	}

	public void selectMulticity() {
		searchFlights_radio_multicity.click();
	}

	public void setFromLoc() {
		searchFlights_edit_fromLoc.sendKeys("hyd");

	}

	public void setToLoc() {
		searchFlights_edit_toLoc.sendKeys("bang");

	}

	public void selectDate() {
		searchFlights_icon_date.click();
	}

	public void selectAdults() {
		new Select(searchFlights_radio_oneway).selectByIndex(2);

	}

}
