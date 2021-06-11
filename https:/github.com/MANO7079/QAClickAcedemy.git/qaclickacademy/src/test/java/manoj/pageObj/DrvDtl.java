package manoj.pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

public class DrvDtl {

	public WebDriver Driver;

	public WebDriver getDriver(String DrvName) {

		if (DrvName.equalsIgnoreCase("Chrome")) {
			System.setProperty("WebDriver.Chrome.Driver",
					"/Users/manojkedia/eclipse-workspace/qaclickacademy/chromedriver");
			Driver = new ChromeDriver();
		} else if (DrvName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"/Users/manojkedia/eclipse-workspace/qaclickacademy/geckodriver");
			Driver = new FirefoxDriver();

		} else {
			System.out.println("Invalid Browser Detail");
		}
		return Driver;

	}
}