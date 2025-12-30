package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericutilities.WebDriverUtility;

public class SalesorderDetailsPage extends WebDriverUtility {
@FindBy(xpath="//input[@name='subject']")
private WebElement subedt;
 @FindBy(xpath="//select[@name='sostatus']")
 private WebElement status;
 @FindBy(xpath="//input[@name='account_id']/following-sibling::img")
 private WebElement orglookup;
 @FindBy(xpath = "//input[@name='search_text']")
 private WebElement searchtxt;
 @FindBy(xpath = "//input[@name='search']")
 private WebElement searchbtn;
 @FindBy(xpath ="//textarea[@name='bill_street']")
 private WebElement billaddedt;
 @FindBy(xpath = "//input[@onclick='return copyAddressRight(EditView)']")
 private WebElement cpybiladd;
 @FindBy(xpath = "//img[@title='Products']")
 private WebElement prodlookup;
 @FindBy(name="qty1")
 
 private WebElement quantyedt;
 @FindBy(xpath = "//input[@name='search_text']")
 private WebElement prodsearch;
 @FindBy(xpath = "//input[@name='search']")
 private WebElement prodbtn;
 @FindBy(xpath = "//input[@title='Save [Alt+S]']")
 private WebElement savebtn;
 
 
 //
 public SalesorderDetailsPage(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
	 
 }


 public WebElement getSearchtxt() {
	return searchtxt;
}


 


 public WebElement getProdsearch() {
	return prodsearch;
}


 public WebElement getProdbtn() {
	return prodbtn;
 }


 public WebElement getSearchbtn() {
	return searchbtn;
 }


 


 public WebElement getSubedt() {
	return subedt;
 }


 public WebElement getStatus() {
	return status;
 }


 public WebElement getOrglookup() {
	return orglookup;
 }


 public WebElement getBilladdedt() {
	return billaddedt;
 }


 public WebElement getCpybiladd() {
	return cpybiladd;
 }


 public WebElement getProdlookup() {
	return prodlookup;
 }


 public WebElement getQuantyedt() {
	return quantyedt;
 }


 public WebElement getSavebtn() {
	return savebtn;
 }
 
 
 public void salesorderpg(String orgsearch,WebDriver driver,String subject,String billadd,String quantity,String sts,String orgnm,String searchtext,String prdnm)
 {
	 //enter value in sub
	 subedt.sendKeys(subject);
	 //click on status
	 status.click();
	 dropdownUsingContainsVisibleText(status, sts);
	//clcik on rglookup 
	 orglookup.click();
	 switchToWindow(driver, "Accounts&action");
	 searchtxt.sendKeys(orgsearch);
	 searchbtn.click();
	 driver.findElement(By.xpath("//a[.='"+orgnm+"']")).click();

	 try {
	     acceptAlertPopup(driver);
	 } catch (Exception e) {}

	 switchToWindow(driver, "Sales");  // 

	 billaddedt.clear();
	 billaddedt.sendKeys(billadd);
	 cpybiladd.click();
	 prodlookup.click();
	 switchToWindow(driver, "Products&action");
	 prodsearch.sendKeys(searchtext);
	 prodbtn.click();

	 try {
	     acceptAlertPopup(driver);
	 } catch (Exception e) {}

	 driver.findElement(By.xpath("//a[.='"+prdnm+"']")).click();
	 switchToWindow(driver, "SalesOrder&action");

	 quantyedt.sendKeys(quantity);
	 savebtn.click();

 }
}

