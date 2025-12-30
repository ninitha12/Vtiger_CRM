package objectRepo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.testng.Assert.*;

import genericutilities.WebDriverUtility;

public class ProductValidationPage extends WebDriverUtility {
	WebDriver driver=null;
	//declare
		@FindBy(xpath = "//span[@class='lvtHeaderText']")
		private WebElement confimmessage;
		//initialise
		public ProductValidationPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		//utilise
		public WebElement getConfimmessage() {
			return confimmessage;
		}
		//bussiness logic
		public void validation(String prod)
		{
			waitUntilEleToBeVisible(driver, 10, confimmessage);
			String actual=confimmessage.getText();
			assertTrue(actual.contains(prod),"Product not created");

			System.out.println("Product created successfully");
//			if(actual.contains(prod))
//			{
//				System.out.println("Product created successfully");
//			}else
//			{
//				System.out.println("Product not created");
//			}
		}
}
