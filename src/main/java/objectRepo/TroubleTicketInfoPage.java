package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericutilities.WebDriverUtility;

public class TroubleTicketInfoPage extends WebDriverUtility{
	//declare
	WebDriver driver=null;
		@FindBy(xpath = "//span[@class='dvHeaderText']")
		private WebElement confimmessage;
		//initialise
		public TroubleTicketInfoPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		//utilise
		public WebElement getConfimmessage() {
			return confimmessage;
		}
		//bussiness logic
		public void validation(String tick)
		{
			waitUntilEleToBeVisible(driver, 10, confimmessage);
			String actual=confimmessage.getText();
			Assert.assertTrue(actual.contains(tick),"TroubleTicket not created ");
			System.out.println("TroubleTicket created successfully");
//			if(actual.contains(tick))
//			{
//				System.out.println("TroubleTicket created successfully");
//			}else
//			{
//				System.out.println("TroubleTicket not created");
//			}
		}
}
