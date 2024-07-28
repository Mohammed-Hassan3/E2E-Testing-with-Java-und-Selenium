package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegistrierungSeite extends PageBase{

	public RegistrierungSeite(WebDriver driver) {
		super(driver);
		
	}
	//Locate the Elements 

	@FindBy(name = "usernameRegisterPage")
	WebElement userTxtBox;
	
	@FindBy(name = "emailRegisterPage")
	WebElement emailTxtBox;
	
	@FindBy(name = "passwordRegisterPage")
	WebElement passTxtBox;
	
	@FindBy(name = "confirm_passwordRegisterPage")
	WebElement confirmPassTxtBox; 
	
	@FindBy(name = "i_agree")
	WebElement termsRdBtn;
	
	@FindBy(id = "register_btn")
	WebElement registerBtn; 
	


	public void userRegistierung(String userName, String email, String password)
	{
		
				
		userTxtBox.click();
		userTxtBox.clear();
		userTxtBox.sendKeys(userName);
		
		emailTxtBox.click();
		emailTxtBox.clear();
		SetTxtElement(emailTxtBox, email);;
		
		passTxtBox.click();
		passTxtBox.clear();
		passTxtBox.sendKeys(password);
		 
		confirmPassTxtBox.click();
		confirmPassTxtBox.clear();
		confirmPassTxtBox.sendKeys(password);
		
		clickBtn(termsRdBtn);
		
		registerBtn.click();
		
		
								
	}
	
	
		

}
