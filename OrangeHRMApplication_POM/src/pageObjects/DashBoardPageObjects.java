package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPageObjects {

@FindBy(xpath="//i[@class='oxd-icon bi-list oxd-topbar-header-hamburger']")
public static WebElement menu;

@FindBy(xpath="//span[text()='Admin']")
public static WebElement admin;
}
