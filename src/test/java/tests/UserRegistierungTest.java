package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.RegistrierungSeite;

public class UserRegistierungTest extends TestBase 
{
	
	HomePage homeObject;
	RegistrierungSeite registerObject; 
	
	@FindBy(id = "menuUser")
	WebElement subMenu2; 
	
	@FindBy(xpath = "//*[@id=\"loginMiniTitle\"]/label[3]")
	WebElement signOutBtn;
	
	@Test
	public void userErfolgRegistirerung()
	{
		homeObject = new HomePage(driver);
		registerObject = new RegistrierungSeite(driver);
		homeObject.OffnenRegistierungSeite();
		
		registerObject.userRegistierung("madadmazo", "testo14adada@ddtsdadfdd.com", "Hlcx654766");
		
	}
	
	public void ConfirmTest()
	{
		subMenu2.click();
		Assert.assertTrue(signOutBtn.getText().contains("Sign out"));
	}
	
	
}
