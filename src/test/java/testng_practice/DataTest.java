package testng_practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import objectRepo.LoginPage;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataTest {

	public class DataProviderTest {
		@Test(dataProvider = "storeData")
		public void getdata(String USERNAME,String PASSWORD)
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://localhost:8888");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
			LoginPage lp=new LoginPage(driver);
			lp.loginToVtiger(USERNAME, PASSWORD);
		}		@DataProvider
		public  Object[][] storeData()
		{
			Object[][] obj=new Object[2][2];
			obj[0][0]="admin";
			obj[0][1]="admin";
			obj[1][0]="admin";
			obj[1][1]="password";
			return obj;
		}
	}
}

