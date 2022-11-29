package MbLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mbLogin2 {

	@FindBy(xpath = "//iframe[@id='myframe']")
	private WebElement iframename;
	@FindBy(xpath = "(//input[@id='email'])[2]")
	private WebElement email;
	@FindBy(xpath = "(//input[@id='pwd'])[2]")
	private WebElement password;
	@FindBy(xpath = "(//button[@id='ACCT_LOGIN_SUBMIT'])")
	private WebElement SignBtn;

	public mbLogin2(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void swFrame(WebDriver driver) {

		driver.switchTo().frame(iframename);

	}

	public void setusername() {
		email.sendKeys("lakhana98");

	}

	public void setpassword() {
		password.sendKeys("lakhana98");

	}

	public void clickSignBtn() {
		SignBtn.click();

	}
}
