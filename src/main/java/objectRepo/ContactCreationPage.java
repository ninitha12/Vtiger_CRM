package objectRepo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactCreationPage {
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createContactlink;
//	@FindBy(xpath = "//tbody/tr/td/span[@vtfieldname=\"lastname\"]/preceding-sibling::a")
//	private List<WebElement>  edit;
		//iniitialse
	public ContactCreationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getCreateContactlink() {
		return createContactlink;
	}
	
//	
//	public List<WebElement> getEdit() {
////		return edit;
//}
	
	//
	public void contactsCreate()
	{
		createContactlink.click();
	}
//	public void editcontact() {
//		for (WebElement item : edit) {
//    System.out.println(item);
//		
//	}
	}
