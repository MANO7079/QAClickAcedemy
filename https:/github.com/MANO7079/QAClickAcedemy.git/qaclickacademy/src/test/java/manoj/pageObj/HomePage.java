package manoj.pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

	WebDriver Driver;

	public HomePage(WebDriver Drv) {
		this.Driver = Drv;
		PageFactory.initElements(Driver, this);
	}

	@FindBy(xpath = "//*[@id=\'homepage\']/header/div[1]/div/nav/ul/li[3]/a/span")
	WebElement Register;

	@FindBy(xpath = "//*[@id='homepage']/header/div[1]/div/nav/ul/li[4]/a/span")
	WebElement Login;

	@FindBy(linkText = "Home")
	WebElement Home;

	@FindBy(linkText = "Courses")
	WebElement Courses;

	@FindBy(linkText = "Videos")
	WebElement Videos;

	@FindBy(linkText = "Interview Guide")
	WebElement InterviewGuide;


	@FindBy(xpath = "//*[@id='homepage']/header/div[2]/div/nav/ul/li[8]/a")
	WebElement Contact;

	/*
	 * java.sql.Connection cn = DriverManager.getConnection(null, null, null);
	 * Statement st = cn.createStatement(); ResultSet rs =
	 * st.executeQuery("Select..."); rs
	 */

	public WebElement Login() {
		try {
		Driver.getCurrentUrl();
		}catch (NullPointerException e)
		{
			System.out.println("Driver detail not found");
		}
		return Login;
	}

	public WebElement Home() {
		try {
			Driver.getCurrentUrl();
			}catch (NullPointerException e)
			{
				System.out.println("Driver detail not found");
			}
		return Home;
	}
}
