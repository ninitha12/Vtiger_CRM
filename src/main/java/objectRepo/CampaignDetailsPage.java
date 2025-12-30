package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericutilities.WebDriverUtility;

public class CampaignDetailsPage extends WebDriverUtility{
	//declare

	@FindBy(name="campaignname")
	private WebElement campnameedt;
	@FindBy(xpath="//img[@id='jscal_trigger_closingdate']")
	private WebElement exptedDate;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	//initialise
	public CampaignDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCampnameedt() {
		return campnameedt;
	}

	public WebElement getExptedDate() {
		return exptedDate;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}
	//business logic
	public void campaignDetails(String campname,WebDriver driver,String num)
	{
		campnameedt.sendKeys(campname);
		exptedDate.click();

		driver.findElement(By.xpath("//td[@class='day' and contains(.,'"+num+"')]")).click();
		
	
	
		savebtn.click();
	}
}
