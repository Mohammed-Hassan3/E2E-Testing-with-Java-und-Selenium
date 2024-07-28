package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase
{

	public HomePage(WebDriver driver) {
		super(driver);


	}

	@FindBy(id = "menuUser")
	WebElement subMenu; 


	@FindBy(css = "a.create-new-account.ng-scope")
	WebElement registerLink;



	public void OffnenRegistierungSeite() 
	{

	subMenu.click();
	clickBtn(registerLink);

	}


}
