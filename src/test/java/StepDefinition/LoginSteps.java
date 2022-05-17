package StepDefinition;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LeavePage;
import pages.LoginPage;
import pages.Logout;

public class LoginSteps{
	
	private WebDriver driver = null;
	private String url = "https://opensource-demo.orangehrmlive.com/";
	
	private LoginPage loginPage = null;
	private HomePage homePage = null;
	private LeavePage leavePage = null;
	private Logout logout = null;
	
	private String expectedURL = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
	
	@Given("open browser")
	public void open_browser() {
		System.setProperty("webdriver.chrome.driver","./jar/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		leavePage = new LeavePage(driver);
		logout = new Logout(driver);
	}

	@When("navigates to the website oranghrmlive.com")
	public void navigates_to_the_website_oranghrmlive_com() {
		driver.get(url);
	}

	@And("login using {string} and {string} as credentials")
	public void enter_username_and_password(String username, String password) {
		loginPage.loginUsingCrentials(username, password);
	}

	@Then("check URL of the page")
	public void login_must_be_successful() {
		System.out.println("--- Expected URL Found? : " + driver.getCurrentUrl().equals(expectedURL) + " ---");
	}
	
	@Then("click on MyInfo tab")
	public void click_on_my_info_tab() {
		homePage.clickOnMyInfoTab();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
	}

	@And("check some other tabs")
	public void check_some_other_tabs() {
		homePage.clickOnAdminTab();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		homePage.clickOnRecruitmentTab();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		homePage.clikOnMarketPlaceLink();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
	}

	@When("click on leave tab")
	public void click_on_leave_tab() {
		homePage.clickOnLeaveTab();
		leavePage.clickOnLeaveListTab();
	}

	@Then("fill all require details and search")
	public void fill_all_require_details_and_search() {
		leavePage.fillCalFromDate("2013-10-28");
		leavePage.fillcalToDate("2015-01-09");
		leavePage.clickOnAllCheckCheckBoxGroup();
		leavePage.fillEmployeeName("Aaliyah Haq");
		leavePage.selectFromSubUnitFinanceDropDown();
		leavePage.selectFromSubUnitEngineeringDropDown();
		leavePage.checkIncludePastEmployeesCheckBox();
		leavePage.clickOnSearchButton();		
	}

	@And("click on logout")
	public void click_on_logout() {
		logout.clickOnLogoutBtn();
		driver.close();
	}

}
