package manoj.TestSuit;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import manoj.pageObj.*;

public class TestCases {
	public DrvDtl Drv = new DrvDtl();
	public HomePage HomePgObj;
	public LoginPage LoginPgObj;
	SoftAssert SoftAss = new SoftAssert();

	@BeforeTest
	public void startSetup() {
		Drv.Driver = Drv.getDriver("Firefox");
		Drv.Driver.get("http://www.qaclickacademy.com/");
		HomePgObj = new HomePage(Drv.Driver);
		LoginPgObj = new LoginPage(Drv.Driver);
	}

	@Test(enabled = true)
	public void first() {
		HomePgObj.Login().click();
		// Drv.Driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Assert.assertEquals("Log In to WebServices Testing using SoapUI", LoginPgObj.LogInBoxTitle().getText());
		System.out.println(Drv.Driver.getTitle());
	}

	@Test(enabled = true, dependsOnMethods = { "first" })
	public void LogIn() {

		LoginPgObj.LoginEmailId().sendKeys("manojkedia2001@gmail.com");
		LoginPgObj.LoginPwd().sendKeys("1234");
		LoginPgObj.LoginBtn().click();

	}

	@Test(enabled = true)
	public void HomeClick() {
		try {
			HomePgObj.Home().click();
			System.out.println(Drv.Driver.getTitle());
		} catch (NoSuchElementException NSE) {
			System.out.println("Element not Found");
			SoftAss.assertTrue(false);
			// SoftAss.assertAll();
		}
	}

	@AfterTest
	public void tearDown() {
		Drv.Driver.quit();
	}

}
