package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.Baseclass;

public class POMLogin extends Baseclass{

	// Object repository creation
	// @FindBy = driver.findelement(By.css)
	@FindBy(css =" #app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div:nth-child(3) > div > div:nth-child(2) > input")
	WebElement Username;
	@FindBy(css="#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div:nth-child(3) > div > div:nth-child(2) > input")
	WebElement Password;
	@FindBy(css="#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div.oxd-form-actions.orangehrm-login-action > button")
	WebElement Login;
	//initiating page elements
	
	public POMLogin() {
		
		PageFactory.initElements(driver, this);
	}
	public void typeusername(String name) {
		 Username.sendKeys("Vineet");
	}
	 public void typepassword(String pswd) {
		 Password.sendKeys("Password");
	 }

	 public void click() {
		 Login.click();
	 }
	public String verify() {
		return driver.getTitle();
	}
	
	
}
