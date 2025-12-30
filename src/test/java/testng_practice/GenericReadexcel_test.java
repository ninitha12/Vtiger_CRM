package testng_practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericutilities.ExcelUtils;
//reading data from generic utility
public class GenericReadexcel_test {
	
	@Test(dataProvider = "dataaread")
	public void genericdp(String prodname,String color)
	{
		System.out.println(prodname+"-->"+color);
	}
	@DataProvider
	public Object[][] dataaread() throws EncryptedDocumentException, IOException
	{
		ExcelUtils elib=new ExcelUtils();
		Object[][] value = elib.readMultipleDataafortng("dataprovider");
		return value;
		
	}

}
