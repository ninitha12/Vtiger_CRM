package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericutilities.WebDriverUtility;

public class MainPage extends WebDriverUtility {
	//declare
	@FindBy(linkText = "Organizations")
	private WebElement Orglink;
	@FindBy(xpath ="//td/a[.='Contacts']")
	private WebElement contactlink;
	@FindBy(linkText = "Products")
	private WebElement prodlink;
	@FindBy(linkText = "Trouble Tickets")
	private WebElement TroubleTicklink;
	@FindBy(linkText = "Leads")
	private WebElement Leadlink;
	@FindBy(linkText ="More")
	private WebElement morelink;
	@FindBy(linkText ="Campaigns")
	private WebElement campaignslink;
	@FindBy(linkText ="Sales Order")
	private WebElement salesodrlink;
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminlink;
	@FindBy(linkText = "Sign Out")
	private WebElement signout;
	
	
	//initialise
	public MainPage(WebDriver driver)
	
	
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getOrglink() {
		return Orglink;
	}


	public WebElement getContactlink() {
		return contactlink;
	}


	public WebElement getProdlink() {
		return prodlink;
	}


	public WebElement getTroubleTicklink() {
		return TroubleTicklink;
	}


	public WebElement getLeadlink() {
		return Leadlink;
	}


	public WebElement getMorelink() {
		return morelink;
	}


	public WebElement getCampaignslink() {
		return campaignslink;
	}


	public WebElement getSalesodrlink() {
		return salesodrlink;
	}


	public WebElement getAdminlink() {
		return adminlink;
	}


	public WebElement getSignout() {
		return signout;
	}
	
	
	//utilise
	
public void clickonOrgLink()
{
	Orglink.click();
}

public void clickonContactLin() {
	contactlink.click();
}
public void clickonProductlink()
{
	prodlink.click();
}
public void clickonTorubleTicket()
{
	
	TroubleTicklink.click();
}
public void clickonLeadLink()
{
	
	Leadlink.click();
	
}
public void clickonMorelinks() {
	
	morelink.click();
}
public void clickonCampaignslink()
{
	morelink.click();
	campaignslink.click();
}
public void clickonSalesorderlink()
{
	morelink.click();
	salesodrlink.click();

	}
public void signout(WebDriver driver) throws InterruptedException
{
	
	adminlink.click();
	Thread.sleep(2000);
	clickonelementusingJSE(driver, signout);
	//mouseHoverandClick(driver, signout);
}
}
