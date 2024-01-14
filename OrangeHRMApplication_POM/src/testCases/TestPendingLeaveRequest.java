package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.DashBoardPageObjects;
import pageObjects.LeavePageObjects;
import pageObjects.LoginPageObjects;

public class TestPendingLeaveRequest extends CommonFunctions {

	String text=null;
	public void login() {
		PageFactory.initElements(driver, LoginPageObjects.class);
		LoginPageObjects.username.sendKeys(properties.getProperty("username"));
		LoginPageObjects.password.sendKeys(properties.getProperty("password"));
		LoginPageObjects.loginButton.click();
	}
	
	public void getPendingLeaveRequest() {

		PageFactory.initElements(driver, LeavePageObjects.class);
//		LeavePageObjects.myLeave.click();
		text = LeavePageObjects.myLeaveList.getText();
	}
	@Test
	public void verifyPendingLeaveRequest() {
		login();
		getPendingLeaveRequest();
		Assert.assertEquals(text, "No Employees are on Leave Today");
	}
}
