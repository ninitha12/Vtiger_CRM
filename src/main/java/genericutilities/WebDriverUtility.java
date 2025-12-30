package genericutilities;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverUtility {
	
	/**
	 * this method is use to maximize the window
	 * @author Sharon

	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
		
	}
	/**
	 * this method is used to minimize the window
	 * @author Sharon
	 * @param driver
	 */
	public void minimize(WebDriver driver)
	{
		driver.manage().window().minimize();
		
	}
	/**
	 * this method is used to wait till the page loads(implicitly wait)
	 * @param driver
	 * @param seconds
	 */
	public void waitForPageToLoad(WebDriver driver,int seconds)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	
	/**
	 * this method is used to wait till the element is visible
	 * @author Sharon
	 * @param driver
	 * @param seconds
	 * @param element
	 */
public void waitUntilEleToBeVisible(WebDriver driver,int seconds,WebElement element)
{
	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(seconds));
	wait.until(ExpectedConditions.visibilityOfAllElements(element));
}
/**
 *  this method is use to wait till the element is clickable

 * @param driver
 * @param seconds
 * @param element
 */
public void waitUntilEleToBeclickable(WebDriver driver,int seconds,WebElement element)
{
	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(seconds));
	wait.until(ExpectedConditions.elementToBeClickable(element));
}
/**
 * this method is used to select from dropdown
 * @author Sharon
 * @param element
 * @return
 */
//Select class methods
public Select dropdown(WebElement element)
{
	Select sel=new Select(element);
	return sel;
	
	
}
/**
 * this method is used to select data using value
 * @author Sharon
 * @param element
 * @param value
 */
public void dropdownUsingValue(WebElement element,String value)
{
	dropdown(element).selectByValue(value);
}/**
 * this method is used to select data using index
 * @author Sharon
 * @param element
 * @param index
 */

public void dropdownUsingIndex(WebElement element,int index)
{
	dropdown(element).selectByIndex(index);
}
/**
 * this method is used to select data Using Visible Text
 * @author Sharon
 * @param element
 * @param text
 */
public void dropdownUsingVisibleText(WebElement element,String text)
{
	dropdown(element).selectByVisibleText(text);
}
/**
 * this method is used to select data using contains visible text
 * @author Sharon
 * @param element
 * @param text
 */
public void dropdownUsingContainsVisibleText(WebElement element,String text)
{
	dropdown(element).selectByContainsVisibleText(text);
	
}
/**
 * this is actions class methods
 * @author Sharon
 * @param driver
 * @return
 */
//actions class methods
public Actions actions(WebDriver driver)
{
	Actions act=new Actions(driver);
	return act;
}
/**
 * this is used to click and hold the element
 * @author Sharon
 * @param driver
 * @param element
 */
public void clickandHold(WebDriver driver,WebElement element)
{
	actions(driver).clickAndHold(element).perform();
}/**
 * this is used to click and hold release the element
 * @author Sharon
 * @param driver
 * @param element
 */
public void clickHoldAndRelease(WebDriver driver,WebElement element)
{
	actions(driver).clickAndHold(element).release().perform();
}
/**
 * this is used to mouse hover on the element
 * @author Sharon
 * @param driver
 * @param element
 */
public void mouseHover(WebDriver driver,WebElement element)
{
	actions(driver).moveToElement(element).perform();
}
/**
 * this is used to mouse hover and click on the element
 * @author Sharon
 * @param driver
 * @param element
 */
public void mouseHoverandClick(WebDriver driver,WebElement element)
{
	actions(driver).moveToElement(element).click().perform();
	
}
/**
 * this method is used to drag and drop the element
 * @author Sharon
 * @param driver
 * @param source
 * @param target
 */
public void draganddrop(WebDriver driver,WebElement source,WebElement target)
{
	actions(driver).dragAndDrop(source, target).perform();
	
}
/**
 * this method is used to scroolto the element
 * @author Sharon
 * @param driver
 * @param element
 */
public void scrollToElement(WebDriver driver,WebElement element)
{
	actions(driver).scrollToElement(element).perform();
}

/**
 * this method is used to double click on the webpage
 * @param driver
 */
public void doubleClick(WebDriver driver)
{
	actions(driver).doubleClick().perform();
}
/**
 * this method is used to scroll to the webpage 
 * @author Sharon
 * @param driver
 * @param x
 * @param y
 */
public void scrollWebPage(WebDriver driver,int x,int y)
{
	actions(driver).scrollByAmount(x, y).perform();
}
/**
 * this method is used to doublle click on the element
 * @author Sharon
 * @param driver
 * @param element
 */
public void doubleClickonElement(WebDriver driver,WebElement element)
{
	actions(driver).doubleClick(element).perform();
	
}
/**
 * this method is used to right click on the element
 * @author Sharon
 * @param driver
 * @param element
 */
public void rightClickonElement(WebDriver driver,WebElement element)
{
	actions(driver).contextClick(element).perform();
}
/**
 * this method is used to right click on the webpage
 * @param driver
 */
public void rightClickonWebpage(WebDriver driver)
{
	actions(driver).contextClick().perform();
}

//doubleclick,dclick on ele,right click,clickholed and release
/**
 * this is used to switch to child window
 * @param driver
 * @param expTitle
 */
public void switchToWindow(WebDriver driver,String expTitle)
{
	Set<String> windows = driver.getWindowHandles();
	Iterator<String> it=windows.iterator();
	while(it.hasNext())
	{
		String currentWin=it.next();
		String actualTitle =driver.switchTo().window(currentWin).getTitle();
		if(actualTitle.contains(expTitle))
		{
			break;
		}
	

	}}
/**
 * this method is used to switch window using for eachloop
 * @param driver
 */
public void switchToWindowww(WebDriver driver)
{
	String parentHandle=driver.getWindowHandle();

	Set<String>allWindowId=driver.getWindowHandles();
	for(String win:allWindowId)
	{
		driver.switchTo().window(win);
		String currentWindowId=driver.getWindowHandle();
		if(!(currentWindowId.equals(parentHandle)))
			
			break;
	}
}

/**
 * this method is used to switch to parent window
 * @param driver
 * @param parentId
 */
	public void switchToParent(WebDriver driver,String parentId)
	{
//		String parentHandle=driver.getWindowHandle();
		driver.switchTo().window(parentId);
	}
	/**
	 * frames
	 * this method is used to switch to child frames using index
	 * @param driver
	 * @param index
	 */
	//frames
	public void switchToChildFrameusingindes(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
		
	}
	/**
	 * this method is used to switch to child frame using name
	 * @param driver
	 * @param name
	 */
	public void switchtoChildFrameUsingnamee(WebDriver driver,String name)
	{
		driver.switchTo().frame(name);
		
	}
	/**
	 *this method is used to switch to child frame using id
	 *@author Sharon

	 * @param driver
	 * @param id
	 */
	public void switchtoChildframeUsingid(WebDriver driver,String id)
	{
		driver.switchTo().frame(id);
		
	}
	/**
	 * this method is used to switch to child frame using webelememt
	 * @param driver
	 * @param element
	 */
	public void switchtoChildFrameUsingWebEle(WebDriver driver,WebElement element)
	{
		driver.switchTo().frame(element);
		
	}//parent
	/**
	 * this method is used to switch to parent frame
	 * @param driver
	 */
	public void switchToParentFrame(WebDriver driver)
	{
		driver.switchTo().parentFrame();
		}
	/**
	 * this method is used to switch to main frame
	 * @param driver
	 */
	public void switchtoMainFrame(WebDriver driver)
	{
		driver.switchTo().defaultContent();
		
	}
	/**
	 * this method is used to accept alert popup
	 * @param driver
	 */
	//alert
	public void acceptAlertPopup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
		
	}
	/**
	 * this method is used to cancel the alert popup
	 * @param driver
	 */
	public void  cancelAlertPopup(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	/**
	 * this method is used to get text form alert popup
	 * @param driver
	 */
	public void getTextFromAlertPopupd(WebDriver driver)
	{
		driver.switchTo().alert().getText();
		
	}
	/**
	 * this is used to send data to AlertPopUP
	 * @param driver
	 * @param value
	 */
	public void sendingdatatoAlertPopUP(WebDriver driver,String value)
	{
		driver.switchTo().alert().sendKeys(value);
	}
	/**
	 * javascript executor
	 * @param driver
	 * @return
	 */
	//javascriptExecutor methods
	public JavascriptExecutor javaScriptExecutor(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js;
		
	}
	/**
	 * this method is used to scroll Height
	 * @author Sharon
	 * @param driver
	 */
	public void scrollHeight(WebDriver driver)
	{
		javaScriptExecutor(driver).executeScript("window.scrollBy(0, document.body.scrollHeight);");
		
		
		
	}
	/**
	 * this method is used to scroll till the element is visible using java script executor
	 * @param driver
	 * @param element
	 */
	public void scrollTillElementisVisibleusingJSE(WebDriver driver,WebElement element)
	{
		javaScriptExecutor(driver) .executeScript("arguments[0].scrollIntoView(true);", element);
		
	}
	/**
	 * 
	 * this method is used to click on element using JSE
	 * @param driver
	 * @param element
	 */
	//click on element
	public void clickonelementusingJSE(WebDriver driver,WebElement element)
	{
		javaScriptExecutor(driver).executeScript("arguments[0].click();", element);
		
	}
	//sendkeys
	/**
	 * this method is entervalues Using Java Script Executor
	 * @param driver
	 * @param element
	 */
	public void entervaluesUsingJSE(WebDriver driver,WebElement element,String value)
	{
		javaScriptExecutor(driver).executeScript("arguments[0].value=arguments[1];", element, value);
	}
	/**
	 * this method is used to scroll to element using xy coordinates
	 * @param driver
	 * @param element
	 */
	public void scrollToelementusingXYCordinates(WebDriver driver,WebElement element)
	{
		Point loc=element.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		javaScriptExecutor(driver).executeScript("window.scrollBy("+x+"),("+y+");");
		
	}
	
}