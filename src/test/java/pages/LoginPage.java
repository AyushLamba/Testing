package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver = null;
	
	@FindBy(id="txtUsername")
	WebElement textUsernameField;
	
	@FindBy(id="txtPassword")
	WebElement textPasswordField;
	
	@FindBy(id="btnLogin")
	WebElement loginButton;
	
	@FindBy(id="id=\"forgotPasswordLink\"")
	WebElement forgetPasswordLink;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void enterUsername(String username) {
		textUsernameField.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		textPasswordField.sendKeys(password);
	}
	
	public void clickOnLoginBtn() {
		loginButton.click();
	}
	
	public void clickOnForgetPasswordLink() {
		forgetPasswordLink.click();
	}

	public void loginUsingCrentials(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		clickOnLoginBtn();
	}
	
}
