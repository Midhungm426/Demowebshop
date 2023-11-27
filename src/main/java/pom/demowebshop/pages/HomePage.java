package pom.demowebshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom.demowebshop.utilities.TestHelperUtility;

public class HomePage extends TestHelperUtility {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private final String _subEmailField = "newsletter-email"; // Web elements id is pasted
	@FindBy(id = _subEmailField)
	private WebElement subEmailField;

	private final String _subButton = "//input[@id='newsletter-subscribe-button']";
	@FindBy(xpath = _subButton)
	private WebElement subButton;

	private final String _subMessage = "newsletter-result-block";
	@FindBy(id = _subMessage)
	private WebElement subMessage;
	
	private final String _loginLink ="//a[@class='ico-login']";
	@FindBy(xpath = _loginLink)
	private WebElement loginLink;

	public String getHomePageTitle() {
		String title = page.getPageTitle(driver);
		return title;
	}

	public void enterSubEmailID() {
		String emailID = random.getRandomEmail();
		page.enterText(subEmailField, emailID);
	}

	public void clickSubButton() {
		subButton.click();
	}

	public String getSubMessage() {
		// wait.waitForElementToBeVisible(driver, subMessage);
		wait.setHardWait();
		String subscribeMessage = page.getElementText(subMessage);
		return subscribeMessage;
	}
	public LoginPage clickOnLoginLink()
	{
		page.clickOnElement(loginLink);
		return new LoginPage(driver);
	}
}
