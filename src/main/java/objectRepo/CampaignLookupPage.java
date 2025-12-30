package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignLookupPage {
	@FindBy(xpath="//img[@title='Create Campaign...']")
	private WebElement campaignlookup;
	
	public CampaignLookupPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCampaignlookup() {
		return campaignlookup;
	}
	public void campaignlookup()
	{
		campaignlookup.click();
	}
	
	

}
