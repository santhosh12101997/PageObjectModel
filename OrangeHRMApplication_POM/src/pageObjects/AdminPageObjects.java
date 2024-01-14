package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPageObjects {

@FindBy(xpath="//*[text()=' Add ']")
public static WebElement addButton;

@FindBy(xpath="//*[@class='oxd-select-wrapper']//div")
public static WebElement userRole;

@FindBy(xpath="//*[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input")
public static WebElement employeeName;

@FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div")
public static WebElement status;

@FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")
public static WebElement user_Username;

@FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")
public static WebElement user_Password;

@FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")
public static WebElement confirmPassword;

@FindBy(xpath="//*[text()=' Save ']")
public static WebElement saveButton;

@FindBy(xpath="//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6[2]")
public static WebElement userManagement;
}
