package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadDetailspage {
@FindBy(name="lastname")
private WebElement lastnameedt;
@FindBy(name="company")
private WebElement compnameedt;
@FindBy(xpath ="//input[@title='Save [Alt+S]']")
private WebElement savetbutton;

//initialise
public LeadDetailspage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}

public WebElement getLastnameedt() {
	return lastnameedt;
}

public WebElement getCompnameedt() {
	return compnameedt;
}

public WebElement getSavetbutton() {
	return savetbutton;
}

//utilise
public void leadDetail_page(String lname,String compname)
{
	lastnameedt.sendKeys(lname);
	compnameedt.sendKeys(compname);
	savetbutton.click();
	
}
}
