package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.loginPage;



public class LoginTest extends TestBase{
	loginPage loginObject; 
	
	
	@FindBy(id = "menuUser")
	WebElement subMenu2; 
	
	@FindBy(xpath = "//*[@id=\"loginMiniTitle\"]/label[3]")
	WebElement signOutBtn;

	@Test
	
	public void userCanLogin() 
	{
	//	homeObject.OffnenRegistierungSeite();
		loginObject = new loginPage(driver);
		loginObject.UserLogin("momo", "Aa123654");
		
	}
	
	public void ConfirmTest()
	{
		subMenu2.click();
		Assert.assertTrue(signOutBtn.getText().contains("Sign out"));
	}
	
}
