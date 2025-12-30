package testng_practice;

import org.testng.annotations.Test;
//storing data in separate class and calling them in this class
//use data provider name is it is declared
//or use method name in @test
public class Datadptest {
	
	
	//this is hardcoded data
//@Test(dataProviderClass = StoreData_Test.class,dataProvider = "store_products")
//public void gettingdata(String pname,int Price)
//{
//	System.out.println(pname+"--->"+Price);
//}
	
	
	//readig data from excel
	@Test(dataProviderClass = ExcelData_test.class,dataProvider = "excelData")
	public void gettingDataExcel(String product,String color)
	{
		System.out.println(product+"--->"+color);
	}
}
