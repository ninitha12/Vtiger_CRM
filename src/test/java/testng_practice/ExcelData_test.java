package testng_practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;


public class ExcelData_test   {
@DataProvider
public Object[][] excelData() throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TestDatatp.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("dataprovider");
	int rowcount=sh.getLastRowNum()+1;
	int celcount=sh.getRow(0).getLastCellNum();
	Object[][] obj=new Object[rowcount][celcount];
	for(int i=0;i<rowcount;i++)
	{
		for(int j=0;j<celcount;j++)
		{
			obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
		}
	}
	return obj;
}
}
	
	
