package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericutilities.WebDriverUtility;

public class OrgInfopage extends WebDriverUtility{
	WebDriver driver=null;
//declare
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement confirmmessage;
	//initialise
	public OrgInfopage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getConfirmmessage() {
		return confirmmessage;
	}
	public void orgvalidation(String orgname)
	{
		waitUntilEleToBeVisible(driver, 10, confirmmessage);
		String actual=confirmmessage.getText();
		
		Assert.assertTrue(actual.contains(orgname),"Organization not created");
		System.out.println("organization created successfully");

//		if(actual.contains(orgname))
//		{
//			System.out.println("organization created successfully");
//		}else
//		{
//			System.out.println("Organization not created");
//		}
	}
}
