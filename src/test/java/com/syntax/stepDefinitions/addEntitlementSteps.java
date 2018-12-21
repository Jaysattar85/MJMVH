package com.syntax.stepDefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syntax.pages.LoginPage;
import com.syntax.pages.addEntitlements;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class addEntitlementSteps extends BaseClass{

	addEntitlements emp;
	
	@Given("^I logged into OrangeHRM$")
	public void i_logged_into_OrangeHRM() throws Throwable {
		LoginPage login =new LoginPage();
		CommonMethods.enterValue(login.username, BaseClass.prop.getProperty("username"));
        CommonMethods.enterValue(login.password, BaseClass.prop.getProperty("password"));
        CommonMethods.click(login.btnLogin);
		emp = new addEntitlements();

	}

	@When("^I click Leave Module and click add Entitlements$")
	public void i_click_Leave_Module_and_click_add_Entitlements() {
	
		CommonMethods.click(emp.leave);
	    CommonMethods.click(emp.Entitlements);
	    CommonMethods.click(emp.addLeave);
	   
	}

	@When("^Add all default employees to FMLA US leave type$")
	public void add_all_default_employees_to_FMLA_US_leave_type() throws Throwable {
		CommonMethods.click(emp.AddallEmpcheckBox);
		CommonMethods.click(emp.locationAll);
		CommonMethods.click(emp.SubUnitAll);
		CommonMethods.click(emp.FMLAUS);
		CommonMethods.click(emp.thisyear);
	}

	@When("^I Enter \"([^\"]*)\" Entitlement$")
	public void i_Enter_Entitlement(String days) {
		CommonMethods.enterValue(emp.numberofDays, days);
	 }

	@Then("^I Confirm that all default employees have new Entitlements added$")
	public void i_Confirm_that_all_default_employees_have_new_Entitlements_added_for_FMLA_US() throws Throwable {
	CommonMethods.click(emp.savebtn);
	CommonMethods.click(emp.confirm);
	}
	
	@And("^Add \"([^\"]*)\" default employees to any leave type besides FMLA US leave type$")
	public void add_default_employees_to_any_leave_type_besides_FMLA_US_leave_type(String empname) throws Throwable {
		emp.employee.click();
		emp.employee.clear();
		CommonMethods.enterValue(emp.employee, empname);
		emp.employee.sendKeys(Keys.ENTER);
	}
	
	@Then("^I select Paternity US leave type$")
	public void i_select_Paternity_US_leave_type() {
	    emp.leavetype.click();
		
	}

	@When("^I click Leave Module and click Assign Leave$")
	public void i_click_Leave_Module_and_click_Assign_Leave() {
	    CommonMethods.click(emp.leave);
	    CommonMethods.click(emp.leaveAssign);
	}

	@When("^I enter \"([^\"]*)\" default employee names$")
	public void i_enter_default_employee_names(String empflname) {
	    emp.EmpName.click();
	    emp.EmpName.clear();
	    CommonMethods.enterValue(emp.EmpName, empflname);
	}

	@When("^I select FMLA US$")
	public void i_select_FMLA_US() {
	    CommonMethods.click(emp.FMLAUS);
	}

	@Then("^Balance should be present for employee$")
	public void balance_of_should_be_present_for_employee() {
	    emp.balance.getText();
	}

	@Then("^I select From Date \"([^\"]*)\" to \"([^\"]*)\"$")
	public void i_select_From_Date_to(String date, String datel) {
		CommonMethods.enterValue(emp.datefirst, date);
		CommonMethods.enterValue(emp.datelast, datel);
	}

	@Then("^I should see that the leave balance has changed based on how many days that was taken$")
	public void i_should_see_that_the_leave_balance_has_changed_based_on_how_many_days_that_was_taken() {
		emp.assignbn.click();    
	}
	
	
	
}
