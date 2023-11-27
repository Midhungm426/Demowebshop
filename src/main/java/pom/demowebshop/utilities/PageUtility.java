package pom.demowebshop.utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageUtility 
{
	public String getPageTitle(WebDriver driver){
        String title=driver.getTitle();
        return title;
    }
	 public  void clickOnElement(WebElement element){
	        element.click();
	    }
	    public  void enterText(WebElement element,String text){
	        element.sendKeys(text);
	    }
	    public void simpleAlert(WebDriver driver){
	        Alert alert = driver.switchTo().alert();
	        alert.accept();
	    }
	    public void confirmationAlert(WebDriver driver){
	        Alert alert = driver.switchTo().alert();
	        alert.dismiss();
	    }
	    public void promptAlert(WebDriver driver, String text) {
	        Alert alert = driver.switchTo().alert();
	        alert.sendKeys(text);
	        alert.accept();
	    }
	    public String getElementText(WebElement element) {
	        String text = element.getText();
	        return text;
	    }
	    public void ScrolldownOfaWebpage(WebDriver driver) {
	    	JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
	    }
		public void ScrollToTheBottomOfaWebpage(WebDriver driver)
		{
			JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		}
		public void DropDownBySelectClass(WebDriver driver)
		{
			
		}
		public void DropDownByVisibleText(WebDriver driver)
		{
			
		}
		public void DropDownByValue(WebDriver driver)
		{
			
		}
}
