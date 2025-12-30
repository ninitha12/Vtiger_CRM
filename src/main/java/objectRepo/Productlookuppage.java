package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productlookuppage {
@FindBy(xpath="//img[@title='Create Product...']")
private WebElement prodlookup;

public Productlookuppage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getProdlookup() {
	return prodlookup;
}

public void prodlookuplink()
{
	prodlookup.click();
}
}
