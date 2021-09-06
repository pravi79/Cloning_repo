package packagemain;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BaseClass {
	WebDriver driver;

	WebDriverWait wait;

	@FindBy(xpath = "//*[@id='userid']")
	private WebElement username;

	@FindBy(xpath = "//*[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement loginbutton;

	@FindBy(xpath = "//*[@id='pin']")
	private WebElement pin;

	public LoginPage(WebDriver driver) throws IOException {
		this.driver = driver;
		PageFactory.initElements(driver, this);
//		wait = new WebDriverWait(driver, 60);

	}

	public void login() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		username.sendKeys(prop.getProperty("userid"));
		password.sendKeys(prop.getProperty("password"));
		loginbutton.click();
//	wait.until(ExpectedConditions.visibilityOf(pin));
		pin.sendKeys(prop.getProperty("pin"));
		loginbutton.click();

	}
}
