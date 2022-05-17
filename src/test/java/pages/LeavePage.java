package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage {
	
	private WebDriver driver = null;
	
	@FindBy(id="menu_leave_viewLeaveList")
	WebElement leaveListTab;
	
	@FindBy(id="calFromDate")
	WebElement calFromDate;
//	format 2013-10-28
	
	@FindBy(id="calToDate")
	WebElement calToDate;
	
	@FindBy(id="leaveList_chkSearchFilter_checkboxgroup_allcheck")
	WebElement allCheckCheckBoxGroup;
	
	@FindBy(id="leaveList_chkSearchFilter_1")
	WebElement pendingApprovalCheckBoxGroup;
	
	@FindBy(xpath="//input[@id='leaveList_txtEmployee_empName']")
	WebElement employeeName;
	
	@FindBy(xpath="//select[@name='leaveList[cmbSubunit]']/descendant::option[@value='3']")
	WebElement subUnitEngineeringDropDown;
	
	@FindBy(xpath="//select[@name='leaveList[cmbSubunit]']/descendant::option[@value='7']")
	WebElement subUnitSalesAndMarketingDropDown;
	
	@FindBy(xpath="//select[@name='leaveList[cmbSubunit]']/descendant::option[@value='12']")
	WebElement subUnitHRDropDown;
	
	@FindBy(xpath="//select[@name='leaveList[cmbSubunit]']/descendant::option[@value='13']")
	WebElement subUnitFinanceDropDown;

	@FindBy(id="leaveList_cmbWithTerminated")
	WebElement includePastEmployeesCheckBox;
	
	@FindBy(xpath="//input[@name='btnSearch']")
	WebElement searchButton;
	
	@FindBy(xpath="//input[@name='btnReset']")
	WebElement resetButton;
	
	public LeavePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void clickOnLeaveListTab() {
		leaveListTab.click();
	}
	
	public void fillCalFromDate(String value) {
		calFromDate.click();
		calFromDate.sendKeys(Keys.TAB);
	}

	public void fillcalToDate(String value) {
		calToDate.click();
		calToDate.sendKeys(Keys.TAB);
	}
	
	public void fillEmployeeName(String value) {
		employeeName.sendKeys(value);
	}

	public void selectFromSubUnitEngineeringDropDown() {
		subUnitEngineeringDropDown.click();
	}
	
	public void selectFromSubUnitSalesAndMarketingDropDown() {
		subUnitSalesAndMarketingDropDown.click();
	}
	
	public void selectFromSubUnitHRDropDown() {
		subUnitHRDropDown.click();
	}
	
	public void selectFromSubUnitFinanceDropDown() {
		subUnitFinanceDropDown.click();
	}
	
	public void clickOnAllCheckCheckBoxGroup() {
		allCheckCheckBoxGroup.click();
	}
	
	public void clickOnPendingApprovalCheckBoxGroup() {
		pendingApprovalCheckBoxGroup.click();
	}
	
	public void checkIncludePastEmployeesCheckBox() {
		includePastEmployeesCheckBox.click();
	}
	
	public void clickOnSearchButton() {
		searchButton.click();
	}
	
	public void clickOnResetButton() {
		resetButton.click();
	}
	
}
