package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesorderLookupPage {
@FindBy(xpath="//img[@title='Create Sales Order...']")
private WebElement salesorderlookup;
//initialise
public SalesorderLookupPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


public WebElement getSalesorderlookup() {
	return salesorderlookup;
}

public void saleslookup() {
	
	salesorderlookup.click();
	
}

}
