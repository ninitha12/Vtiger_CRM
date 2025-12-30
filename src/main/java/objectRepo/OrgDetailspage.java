package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericutilities.WebDriverUtility;

public class OrgDetailspage extends WebDriverUtility {
//declare
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement orgnameedt;
	@FindBy(xpath="//select[@name='industry']")
	private WebElement industry;
	@FindBy(xpath ="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	
	//initialise
	public OrgDetailspage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//

	public WebElement getOrgname() {
		return orgnameedt;
	}

	public WebElement getIndustry() {
		return industry;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}
	public void orgdetails_(String orgname)
	{
		orgnameedt.sendKeys(orgname);
		
		
		savebtn.click();
	}
	public void createOrg(String orgname,String indd)
	{
		orgnameedt.sendKeys(orgname);
		industry.click();
		dropdownUsingContainsVisibleText(industry, indd);
		savebtn.click();
	}
}
