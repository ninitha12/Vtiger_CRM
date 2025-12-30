package objectRepo;

import org.openqa.selenium.WebDriver;
import static org.testng.Assert.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import genericutilities.WebDriverUtility;

public class LeadValidationPage extends WebDriverUtility{
	WebDriver driver=null;
	//declare
		@FindBy(xpath = "//span[@class='dvHeaderText']")
		private WebElement confimmessage;
		//initialise
		public LeadValidationPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		//utilise
		public WebElement getConfimmessage() {
			return confimmessage;
		}
		//bussiness logic
		public void validation(String LEadnm)
		{
			waitUntilEleToBeVisible(driver, 10, confimmessage);

			String actual=confimmessage.getText();
			assertTrue(actual.contains(LEadnm),"lead not created");
			//System.out.println("lead created successfully");
			Reporter.log("Lead created successfully", true);
//			if(actual.contains(LEadnm))
//			{
//				System.out.println("lead created successfully");
//			}else
//			{
//				System.out.println("lead not created");
//			}
		}
}
