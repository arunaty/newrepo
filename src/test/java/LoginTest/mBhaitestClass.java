package LoginTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import MbLogin.mbLogin1;
import MbLogin.mbLogin2;

public class mBhaitestClass {

	WebDriver driver;
	mbLogin1 mblogin1;
	mbLogin2 mblogin2;

	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lakha\\eclipse-workspace\\MoneyBhai\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://moneybhai.moneycontrol.com/");

		mblogin1 = new mbLogin1(driver);
		mblogin2 = new mbLogin2(driver);

	}

	@Test
	public void login2App() throws InterruptedException
	{
		
		mblogin1.clickSkip();
		mblogin1.clickPlayBtn();
		mblogin2.swFrame(driver);
		
		Thread.sleep(1500);
		mblogin2.setusername();
		Thread.sleep(1500);
		mblogin2.setpassword();
		mblogin2.clickSignBtn();
		
		
	}

}
