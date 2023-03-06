package Objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement usertextfield;
	
	@FindBy(name="pwd")
	private WebElement passwordtextfield;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	
	//getter methods
	public WebElement getUsertextfield() {
		return usertextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	//Business logics
	public void logintoApp(String username ,String password)
	{
		usertextfield.sendKeys(username);
		passwordtextfield.sendKeys(password);
		loginButton.click();
		
	}
	
	
	
	
	
}
