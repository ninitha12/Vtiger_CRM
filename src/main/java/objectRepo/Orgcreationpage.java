package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orgcreationpage {
	//declare
@FindBy(xpath="//img[@title='Create Organization...']")
private WebElement orgcreationlink;
//initialise
public Orgcreationpage(WebDriver driver)

{
	PageFactory.initElements(driver, this);
}
public WebElement getOrgcreationlink() {
	return orgcreationlink;
}
	
public void orgcreation_page()

{
	orgcreationlink.click();
}
}
