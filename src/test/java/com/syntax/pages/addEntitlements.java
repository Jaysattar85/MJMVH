package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class addEntitlements extends BaseClass{

	@FindBy(xpath="//a[@id='welcome']")
	public WebElement welcome;
	
	@FindBy(linkText="Leave") 
	public WebElement leave;
	
	@FindBy(xpath="//a[@id='menu_leave_Entitlements']")
	public WebElement Entitlements;
	
	@FindBy(xpath="//a[@id='menu_leave_addLeaveEntitlement']")
	public WebElement addLeave;
	
	@FindBy(xpath="//input[@id='entitlements_filters_bulk_assign']")
	public WebElement AddallEmpcheckBox;
	
	@FindBy(xpath="//option[@value='-1']")
	public WebElement locationAll;
	
	@FindBy(xpath="//option[@value='0']")
	public WebElement SubUnitAll;
	
	@FindBy(xpath="//option[contains(text(),'FMLA US')]")
	public WebElement FMLAUS;
	
	@FindBy(xpath="//option[@value='2018-01-01$$2018-12-31']")
	public WebElement thisyear;
	
	@FindBy(xpath="//input[@id='entitlements_entitlement']")
	public WebElement numberofDays;
	
	@FindBy(xpath="//input[@id='btnSave']")
	public WebElement savebtn;
	
	@FindBy(xpath="//input[@id='dialogConfirmBtn']")
	public WebElement confirm;
	
	@FindBy(xpath="//input[@id='entitlements_employee_empName']")
	public WebElement employee;
	
	@FindBy(xpath="//option[contains(text(),'Paternity US')]")
	public WebElement leavetype;
	
	@FindBy(xpath="//a[@id='menu_leave_assignLeave']")
	public WebElement leaveAssign;
	
	@FindBy(xpath="//div[@id='assignleave_leaveBalance']")
	public WebElement balance;
	
	@FindBy(xpath="//a[@class='ui-state-default ui-state-active']")
	public WebElement EmpName;
	
	@FindBy(xpath="//input[@id='assignleave_txtFromDate']")
	public WebElement datefirst;
	
	@FindBy(xpath="//input[@id='assignleave_txtToDate']")
	public WebElement datelast;
	
	@FindBy(xpath="//input[@id='assignBtn']")
	public WebElement assignbn;
	
	public addEntitlements() {
		PageFactory.initElements(driver, this);
	}
}
