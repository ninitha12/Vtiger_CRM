package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericutilities.WebDriverUtility;

import static org.testng.Assert.*;

public class Contact_infopage extends WebDriverUtility {
	WebDriver driver = null;

//declare
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement confimmessage;
	//initialise
	public Contact_infopage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilise
	public WebElement getConfimmessage() {
		return confimmessage;
	}
	//bussiness logic
	public void validation(String cont)
	{
		waitUntilEleToBeVisible(driver, 10, confimmessage);

		String actual=confimmessage.getText();
		assertTrue(actual.contains(cont),"contact not created");
		System.out.println("contact created successfully");

//		if(actual.contains(cont))
//		{
//			System.out.println("contact created successfully");
//		}else
//		{
//			System.out.println("contact not created");
//		}
	}
}
