package testCases;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.AdminPageObjects;
import pageObjects.DashBoardPageObjects;

public class TestUserRole extends CommonFunctions{
	
	public void navigateToUserPage() {
		PageFactory.initElements(driver, DashBoardPageObjects.class);
//		DashBoardPageObjects.menu.click();
		DashBoardPageObjects.admin.click();
	}
	
	@Test
	public void addUser() {
		navigateToUserPage();
		PageFactory.initElements(driver, AdminPageObjects.class);
		AdminPageObjects.addButton.click();
		Select select = new Select(AdminPageObjects.userRole);
		select.selectByIndex(1);
		
		AdminPageObjects.employeeName.sendKeys("Peter Mac Anderson");
		Select selectRole = new Select(AdminPageObjects.status);
		selectRole.selectByIndex(1);
		
		AdminPageObjects.user_Username.sendKeys("Admin@1234");
		AdminPageObjects.user_Password.sendKeys("Admin@1234");
		AdminPageObjects.confirmPassword.sendKeys("Admin@1234");
		AdminPageObjects.saveButton.click();
		
	}

}
