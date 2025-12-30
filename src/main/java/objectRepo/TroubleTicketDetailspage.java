package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericutilities.WebDriverUtility;

public class TroubleTicketDetailspage extends WebDriverUtility {
@FindBy(name="ticket_title")
private WebElement tickettitleedt;
@FindBy(name="ticketpriorities")
private WebElement priorityedt;
@FindBy(name="ticketseverities")
private WebElement severitieedt;
@FindBy(name="ticketcategories")
private WebElement categories;
@FindBy(name="ticketstatus")
private WebElement statusedt;
@FindBy(xpath = "//input[@title='Save [Alt+S]']")
private WebElement savebtn;

public TroubleTicketDetailspage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getTickettitleedt() {
	return tickettitleedt;
}

public WebElement getPriorityedt() {
	return priorityedt;
}

public WebElement getSeveritieedt() {
	return severitieedt;
}

public WebElement getCategories() {
	return categories;
}

public WebElement getStatusedt() {
	return statusedt;
}

public WebElement getSavebtn() {
	return savebtn;
}
public void troubleticketd(String title,String prio,String seve,String cat,String status)
{
	tickettitleedt.sendKeys(title);
	priorityedt.click();

	dropdownUsingContainsVisibleText(priorityedt, prio);
	severitieedt.click();
	dropdownUsingContainsVisibleText(severitieedt, seve);

	categories.click();
	dropdownUsingContainsVisibleText(categories, cat);

	statusedt.click();
	dropdownUsingContainsVisibleText(statusedt, status);

	savebtn.click();
}

}
