package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase
{

	public SearchPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id = "menuSearch")
	WebElement searchIcon;
	
	@FindBy(id = "autoComplete")
	WebElement searchBox;
	
	@FindBy(xpath = "/html/body/div[3]/section/article/div[3]/div/div/div[2]/ul/li")
	WebElement chosedProduct;
	
	@FindBy (linkText = "View All")
	WebElement viewAllResults;
	
	@FindBy(xpath = "/html/body/div[3]/section/article[1]/div[2]/div[2]/div/div[4]/button")
	WebElement addToCard;

	@FindBy(xpath = "/html/body/header/nav/ul/li[2]")
	WebElement selectCard;

	@FindBy(xpath = "/html/body/div[3]/section/article/div[1]/table/tfoot/tr[2]/td/button")
	WebElement checkout;
	
	@FindBy(name = "usernameInOrderPayment")
	WebElement usernamePay;
	
	@FindBy(name = "passwordInOrderPayment")
	WebElement passwordPay;
	
	@FindBy(id = "login_btn")
	WebElement loginBtn;
	
	@FindBy (id = "next_btn")
	WebElement nextBtn;
	
	@FindBy (name = "safepay_username")
	WebElement pay_username;
	
	@FindBy(name = "safepay_password")
	WebElement pay_password;
	

	public void ProductSearch(String productName)
	{
		clickBtn(searchIcon);
		SetTxtElement(searchBox, productName);
		searchBox.sendKeys(Keys.ENTER);
	}
	
	public void clickChoosedProduct()
	{
		clickUsingJS(chosedProduct);
		clickUsingJS(addToCard);
		clickBtn(selectCard);
		clickUsingJS(checkout);
		//clickBtn(searchIcon);
		
	}
	
	public void loginToPay(String userValue, String Password)
	{
		
		SetTxtElement(usernamePay, userValue);
		SetTxtElement(passwordPay, Password);
		clickBtn(loginBtn);
		clickBtn(nextBtn);
		
	}
	
	public void payNow(String passPay) 
	{
		pay_password.click();
		pay_password.clear();
		pay_password.sendKeys(passPay);
	}
	

}
