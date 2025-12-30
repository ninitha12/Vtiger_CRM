package testng_practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
@Test(dataProvider = "storeData")
public void getdata(String company,String location)
{
	System.out.println("company-->"+company    +"    location->"+location);
	
}
@DataProvider

//executing same testScript with multiple set of datas
public  Object[][] storeData()
{
	Object[][] obj=new Object[3][2];
	obj[0][0]="Testyantra";
	obj[0][1]="Banglore";
	obj[1][0]="Tekpyramid";
	obj[1][1]="Mysore";
	obj[2][0]="infosys";
	obj[2][1]="Pune";
	return obj;
}
}
