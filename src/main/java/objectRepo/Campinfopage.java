package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.testng.Assert.*;

import genericutilities.WebDriverUtility;

public class Campinfopage extends WebDriverUtility {
	WebDriver driver = null;
//declare
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement confimmessage;
	//initialise
	public Campinfopage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilise
	public WebElement getConfimmessage() {
		return confimmessage;
	}
	//bussiness logic
	public void validation(String campaignname)
	{
		
		waitUntilEleToBeVisible(driver, 10, confimmessage);
		String actual=confimmessage.getText();
assertTrue(actual.contains(campaignname),"Campaign not created");
System.out.println("Campaign created successfully");
//give .* at the end and make it static to call only the method without the class name 
//import static org.testng.Assert.*;

//		if(actual.contains(campaignname))
//		{
//			System.out.println("Campaign created successfully");
//		}else
//		{
//			System.out.println("Campaign not created");
//		}
	}
}
