package manoj.pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver Driver;

	public LoginPage(WebDriver Drv) {
		this.Driver = Drv;
		PageFactory.initElements(Drv, this);
	}

	@FindBy(xpath = "//*[@id='hero']/div/h1")
	WebElement LogInBoxTitle;

	@FindBy(xpath = "//*[@id=\'user_email\']")
	WebElement LoginEmailId;

	@FindBy(xpath = "//*[@id=\'user_password\']")
	WebElement LoginPwd;

	@FindBy(name = "commit")
	WebElement LoginBtn;

	public WebElement LogInBoxTitle() {
		return LogInBoxTitle;
	}

	public WebElement LoginEmailId() {
		return LoginEmailId;
	}

	public WebElement LoginPwd() {
		return LoginPwd;
	}

	public WebElement LoginBtn() {
		return LoginBtn;
	}
}
