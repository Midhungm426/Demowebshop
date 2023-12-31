package pom.demowebshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom.demowebshop.utilities.TestHelperUtility;

public class UserAccountPage extends TestHelperUtility{
	public WebDriver driver;

	public UserAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	private final String _emailField = "//div[@class='header-links']//a[@class='account']";
	@FindBy (xpath = _emailField)
	private WebElement emailField;
	
	public String getEmailText()
	{
		String email= page.getElementText(emailField);
		return email;
	}
}
