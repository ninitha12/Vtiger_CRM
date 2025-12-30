package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declare
	@FindBy(name="user_name")
	private WebElement usernameedt;
	@FindBy(name="user_password")
	private WebElement passwordedt;
	@FindBy(id="submitButton")
	private WebElement submitbtn;
	
	
	
	
	//initialise
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		//utilize
		
		
		
		
		}




	public WebElement getUsernameedt() {
		return usernameedt;
	}




	public WebElement getPasswordedt() {
		return passwordedt;
	}




	public WebElement getSubmitbtn() {
		return submitbtn;
	}
public void loginToVtiger(String USERNAME,String PASSWORD)
{
	usernameedt.sendKeys(USERNAME);
	passwordedt.sendKeys(PASSWORD);
	submitbtn.click();
}
}
