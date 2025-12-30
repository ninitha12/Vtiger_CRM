package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericutilities.WebDriverUtility;

public class ContactDetailsPage extends WebDriverUtility {
	//declare
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastnameedt;
	@FindBy (xpath = "//input[@name='account_id']/following-sibling::img")
	private WebElement orglookup;
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement searchTextedt;
	@FindBy(name="search")
	private WebElement searchbtn;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	
	
	//initialise
	public ContactDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//


	public WebElement getLastnameedt() {
		return lastnameedt;
	}


	public WebElement getOrglookup() {
		return orglookup;
	}


	public WebElement getSearchTextedt() {
		return searchTextedt;
	}


	public WebElement getSearchbtn() {
		return searchbtn;
	}


	public WebElement getSavebtn() {
		return savebtn;
	}
//utilise
	public void contact_Details(String lname,String searchtxt,WebDriver driver, String expectorg)
	{
		lastnameedt.sendKeys(lname);
		
		orglookup.click();
		switchToWindow(driver, "Accounts&action");
		searchTextedt.sendKeys(searchtxt);
		searchbtn.click();
		driver.findElement(By.xpath("//a[.='"+expectorg+"']")).click();
		
		
		
		switchToWindow(driver, "Contacts&action");
		savebtn.click();
	}
	public void contact_details(String lname)
	{
		lastnameedt.sendKeys(lname);
		savebtn.click();

		
	}
}
