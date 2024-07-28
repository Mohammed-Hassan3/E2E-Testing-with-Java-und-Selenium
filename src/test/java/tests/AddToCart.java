package tests;

import java.time.Duration;

import org.testng.annotations.Test;

import Pages.ProductDeatiledPage;
//import tests.SearchProductTest;

public class AddToCart extends TestBase{

	SearchProductTest searchForProduct;
	ProductDeatiledPage detailedObject;
	

	
	@Test
	public void AddtoCart()
	{
		searchForProduct = new SearchProductTest();
		searchForProduct.SearchForProduct();
		detailedObject = new ProductDeatiledPage(driver);
		
	}
	
	public void ClicktoAdd()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		detailedObject.productNameBose.click();
	}
}
