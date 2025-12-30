package genericutilities;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import objectRepo.LoginPage;
import objectRepo.MainPage;

public class BaseClass {
	//creating objrct of utility classes
	public DatabaseUtility dLib=new DatabaseUtility();
	public FileUtils fLib = new FileUtils();
	public Javautils jLib = new Javautils();
	public ExcelUtils exlLib = new ExcelUtils();
	public WebDriverUtility wLib = new WebDriverUtility();
	
	public WebDriver driver;
	//public static WebDriver sdriver;
	//threadlocal webdriver
	public static ThreadLocal<WebDriver>wdriver=new ThreadLocal<WebDriver>();
	@BeforeSuite(alwaysRun = true)
	public void connectToDb() throws SQLException
	{
		
		//db connection
		dLib.connectToDB();
		System.out.println("---connected to db---");
	}
	@Parameters("BROWSER")
	@BeforeClass(alwaysRun = true)
	public void launchbrowser(@Optional("chrome")String BROWSER) throws IOException, InterruptedException
	{
		//String BROWSER = fLib.readDataFromPropertyFile("browser");
		String URL=fLib.readDataFromPropertyFile("url");
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}else if(BROWSER.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver",
	                "C:\\Program Files\\edgedriver_win64\\msedgedriver.exe");

			driver=new EdgeDriver();
		}
//		sdriver=driver;
		wdriver.set(driver);
		//maximise
		wLib.maximizeWindow(driver);
		Thread.sleep(2000);
		//navigate to application
		driver.get(URL);
		//wait for page to load
		wLib.waitForPageToLoad(driver, 10);
		System.out.println("--browwser launched successfully---");
	}
	@BeforeMethod(alwaysRun = true)
	public void loginToApplication() throws IOException
	{
		String PASSWORD=fLib.readDataFromPropertyFile("password");
		String USERNAME=fLib.readDataFromPropertyFile("username");
		LoginPage lp=new LoginPage(driver);
lp.loginToVtiger(USERNAME, PASSWORD);
System.out.println("---logged into application---");
	}
	@AfterMethod(alwaysRun = true)
	public void logoutofApp() throws InterruptedException
	{
		MainPage mp=new MainPage(driver);

		mp.signout(driver);
		System.out.println("---logged out from application");

	}
	@AfterClass(alwaysRun = true)
	public void closeBrowser()
	{
		driver.quit();
		System.out.println("--browser is closed--");
	}
	@AfterSuite(alwaysRun = true)
	public void closeconnection() throws SQLException
	{
		dLib.disconnectDB();
		System.out.println("--disconnected from db---");
	}
}
