package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDeatiledPage extends PageBase{

	public ProductDeatiledPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "/html/body/div[3]/section/article/div[3]/div/div/div[2]/ul/li")
	public WebElement productNameBose;
	
	public void clickOnProduct() 
	{
		clickUsingJS(productNameBose);
	}
}
