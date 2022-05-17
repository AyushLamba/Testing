package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver driver = null;

	@FindBy(xpath = "//a[@id=\"menu_admin_viewAdminModule\"]")
	WebElement adminTab;

	@FindBy(xpath = "//a[@id=\"menu_leave_viewLeaveModule\"]")
	WebElement leaveTab;

	@FindBy(xpath = "//a[@id=\"menu_recruitment_viewRecruitmentModule\"]")
	WebElement recruitmentTab;

	@FindBy(xpath = "//a[@id=\"menu_pim_viewMyDetails\"]")
	WebElement myInfoTab;

	@FindBy(xpath = "//a[@id=\"menu__Performance\"]")
	WebElement performanceTab;

	@FindBy(xpath = "//a[@id='welcome']")
	WebElement welcomeUserDropDown;
	
	@FindBy(xpath="//input[@id=\"MP_link\"]")
	WebElement marketPlaceLink;

	@FindBy(xpath = "//div[@id='welcome-menu']/descendant::a[@href='/index.php/auth/logout']")
	WebElement logoutButton;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	public void clickOnAdminTab() {
		adminTab.click();
	}

	public void clickOnLeaveTab() {
		leaveTab.click();
	}

	public void clickOnRecruitmentTab() {
		recruitmentTab.click();
	}

	public void clickOnMyInfoTab() {
		myInfoTab.click();
	}

	public void clickOnPerformanceTab() {
		performanceTab.click();
	}
	
	public void clikOnMarketPlaceLink() {
		marketPlaceLink.click();
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
