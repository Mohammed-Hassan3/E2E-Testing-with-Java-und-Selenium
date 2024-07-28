package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.ProductDeatiledPage;
import Pages.SearchPage;

public class SearchProductTest extends TestBase
{

	String productName = "BOSE SOUNDLINK BLUETOOTH SPEAKER III";
	SearchPage searchObject ; 
	ProductDeatiledPage detailedObject;
	
	@FindBy(id = "searchResultLabel")
	WebElement searchResult;
	

	
	@FindBy(xpath = "//*[@id=\"searchPage\"]/div[3]/div/div/div[2]/ul/li")
	WebElement boseSpeaker;
	
	@FindBy(css = "span[class='roboto-regular.ng-scope']")
	WebElement paymentConfirmation;
	
	@Test
	public void SearchForProduct()
	{
		searchObject = new SearchPage(driver);
		//detailedObject = new ProductDeatiledPage(driver);
		searchObject.ProductSearch(productName);
		searchObject.clickChoosedProduct();
		searchObject.loginToPay("momo", "Aa123654");
		searchObject.payNow("Aa123654");
	}
	
	
	public void confirmTest()
	{
		Assert.assertTrue(paymentConfirmation.getText().contains("Thank you"));
	}
}
