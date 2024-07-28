package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.RegistrierungSeite;

public class UserRegistierungWithDDT extends TestBase 
{
	
	HomePage homeObject;
	RegistrierungSeite registerObject; 
		
    @FindBy(id = "menuUser")
	WebElement subMenu2; 
	
	@FindBy(xpath = "//*[@id=\"loginMiniTitle\"]/label[3]")
	WebElement signOutBtn;
	
	
	@DataProvider(name = "testData") 
	//2 object array 
	public static Object[][] userDate()
	{
		return new Object[][] 
		{
			{"Momboaa32", "tesaxdx@gmailtest.com", "Lydda23456" },
			{"Müldra","dadader@gmadaltest.com","Aadadas356"}
		};
	}
	
	
	
	@Test(priority = 1, alwaysRun = true, dataProvider = "testData")
	public void userErfolgRegistirerung(String userName, String email, String password)
	{
		homeObject = new HomePage(driver);
		homeObject.OffnenRegistierungSeite();
		registerObject = new RegistrierungSeite(driver);
		registerObject.userRegistierung(userName, email, password);
		
	}
	
	public void ConfirmTest()
	{
		subMenu2.click();
		Assert.assertTrue(signOutBtn.getText().contains("Sign out"));
	}
	
	
}
