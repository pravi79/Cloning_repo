package packagemain;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboard extends BaseClass {

	WebDriver driver;

	WebDriverWait wait;

	public Dashboard(WebDriver driver) throws IOException {

		this.driver = driver;
		PageFactory.initElements(driver, this);
//		wait = new WebDriverWait(driver, 60);

	}

	@FindBy(xpath = "(//*[@class='button-blue'])[1]")
	private WebElement startinvestbutton;

	@FindBy(xpath = "(//*[@id='search-input'])[2]")
	private WebElement searchinput;

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement loginbutton;

	@FindBy(xpath = "//*[@id='pin']")
	private WebElement pin;

	public void searchInstruments() {
		startinvestbutton.click();
		searchinput.sendKeys("sbin");
		Actions act = new Actions(driver);
		act.sendKeys(searchinput, Keys.ENTER).build().perform();
	}

}
