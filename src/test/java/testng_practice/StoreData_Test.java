package testng_practice;

import org.testng.annotations.DataProvider;

public class StoreData_Test {

	@DataProvider(name="credentials")
	public Object[][] credential()
	{
		Object[][] obj =new Object[2][2];
		obj[0][0]="admin";
		obj[0][1]="admin";
		
		obj[1][0]="admin";
		obj[1][0]="password";
		return obj;
		
	}
	//giving dataprovider name
	// if we give name for data provider we should use that insted of method name while calling them in @test method
	@DataProvider(name ="store_products")
	public Object[][] products()
	{
		Object[][]obj=new Object[3][2];
		
		obj[0][0]="laptop";
		obj[0][1]=20000;
		
		obj[1][0]="iphone";
		obj[1][1]=80000;
		
		obj[2][0]="samsung";
		obj[2][1]=60000;
		
	return obj;
	}
	
}
