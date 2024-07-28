package Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase 
{

	protected WebDriver driver; 

	//create Constructor

	public PageBase(WebDriver driver) //just a a parameter to pass

	{
		this.driver = driver;
		PageFactory.initElements(driver, this); 
	}


	protected static void clickBtn(WebElement button) 
	{

		button.click();

	}

	protected static void SetTxtElement(WebElement txtElement, String value ) 
	{

		txtElement.sendKeys(value);

	}
	private void waitForElement(WebElement element){
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(8L));
		// presenceOfElementLocated condition
		w.until(ExpectedConditions.visibilityOf(element));
	}


	protected void clickUsingJS(WebElement element) {
		waitForElement(element);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}

}

