package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TroubleTicketlookupPage {
@FindBy(xpath = "//img[@title='Create Ticket...']")
private WebElement troubleTicketlookup;
public TroubleTicketlookupPage(WebDriver driver )
{
	PageFactory.initElements(driver, this);
}
public WebElement getTroubleTicketlookup() {
	return troubleTicketlookup;
}

//
public void troubleticket()
{
	troubleTicketlookup.click();
}
}
