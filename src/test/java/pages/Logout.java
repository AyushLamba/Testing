package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	private WebDriver driver = null;
	
	@FindBy(xpath = "//a[@id='welcome']")
	WebElement welcomeUserDropDown;
	
	@FindBy(xpath="MP_link")
	WebElement marketPlaceLink;

	@FindBy(xpath = "//div[@id='welcome-menu']/descendant::a[@href='/index.php/auth/logout']")
	WebElement logoutButton;
	
	public Logout(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	public void clickOnLogoutBtn() {
		welcomeUserDropDown.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		logoutButton.click();
	}



}
