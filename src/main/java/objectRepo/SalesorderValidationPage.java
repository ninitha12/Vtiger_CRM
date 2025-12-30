package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import genericutilities.WebDriverUtility;

public class SalesorderValidationPage extends WebDriverUtility{
	WebDriver driver =null;
	
	//declare
			@FindBy(xpath = "//span[@class='lvtHeaderText']")
			private WebElement confimmessage;
			//initialise
			public SalesorderValidationPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			//utilise
			public WebElement getConfimmessage() {
				return confimmessage;
			}
			//bussiness logic
			public void validation(String Sale)
			{
				waitUntilEleToBeVisible(driver, 10, confimmessage);
				String actual=confimmessage.getText();
				Assert.assertTrue(actual.contains(Sale),"Salesorder not created");
				System.out.println("Salesorder created successfully");
//				if(actual.contains(Sale))
//				{
//					System.out.println("Salesorder created successfully");
//				}else
//				{
//					System.out.println("Salesorder not created");
//				}
			}
}
