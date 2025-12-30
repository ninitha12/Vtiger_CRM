package objectRepo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericutilities.WebDriverUtility;

public class ProductdetailsPage extends WebDriverUtility {

    @FindBy(name="productname")
    private WebElement productNameedt;

    @FindBy(xpath="//input[@title='Save [Alt+S]']")
    private WebElement savebtn;

    @FindBy(name="manufacturer")
    private WebElement manufacturer;

    @FindBy(id="jscal_trigger_expiry_date")
    private WebElement expiryDateTxt;

    public ProductdetailsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void prodDetails(String prodname) {
        productNameedt.sendKeys(prodname);
        savebtn.click();
    }

    public void prodDetails(String prodname,String manname) {
        productNameedt.sendKeys(prodname);
        dropdownUsingContainsVisibleText(manufacturer, manname);
        savebtn.click();
    }

    public void prodDetails(WebDriver driver,String prodname,String manname,String dateedt) {
        productNameedt.sendKeys(prodname);
        dropdownUsingContainsVisibleText(manufacturer, manname);
        expiryDateTxt.click();
        
//        try {
////		    Alert a = driver.switchTo().alert();
////		    a.accept();
//		    acceptAlertPopup(driver);
//		    System.out.println("Alert accepted successfully.");
//		} catch (Exception e) {
//		    System.out.println("No alert appeared.");
//		}
		driver.findElement(By.xpath("//td[@class='day' and .='"+dateedt+"']")).click();


        savebtn.click();
    }
}