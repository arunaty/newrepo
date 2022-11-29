package MbLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mbLogin1 {

	@FindBy(xpath = "//div[@class='center-text mt30']/a")
	private WebElement skipBtn;
	@FindBy(xpath = "//button[@id='loginbtn']")
	private WebElement playBtn;

	public mbLogin1(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void clickSkip() {

		skipBtn.click();

	}

	public void clickPlayBtn() {

		playBtn.click();

	}

}
