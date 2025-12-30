package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadCreationpage {
	//declare
	@FindBy(xpath="//img[@title='Create Lead...']")
	private WebElement createLead;
	//initialise
	public LeadCreationpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//
	public WebElement getCreateLead() {
		return createLead;
	}
	//
	public void leadcreatingpage()
	{
		createLead.click();
	}

}
