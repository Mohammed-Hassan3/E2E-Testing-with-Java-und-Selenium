package Pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends PageBase
{

	public loginPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(css ="svg#menuUser" )
	WebElement subMenu;

	@FindBy(name = "username")
	WebElement usernameBox;
	
	@FindBy(name = "password")
	WebElement PassBox;
	
	@FindBy(name = "remember_me")
	WebElement rememberRdBtn;
	
	@FindBy(id = "sign_in_btn")
	WebElement signInBtn;
	
	
	public void UserLogin(String userValue, String Password)
	{
		clickBtn(subMenu);
		SetTxtElement(usernameBox, userValue);
		SetTxtElement(PassBox, Password);
		clickBtn(rememberRdBtn);
		clickBtn(signInBtn);
		
	}
	

	
}
