	package genericutilities;
import java.io.FileOutputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {
	/**
	 * this method is used to read data from excel
	 * @param sheetname
	 * @param rowNo
	 * @param celno
	 * @return
	 * @throws IOException
	 */
	public String readDataFromExcelFile(String sheetname,int rowNo,int celno) throws IOException
	{
		FileInputStream fis=new FileInputStream(IpathConstants.excelpath);
Workbook wb=WorkbookFactory.create(fis);
Sheet sh=wb.getSheet(sheetname);
//String value=sh.getRow(rowNo).getCell(celno).getStringCellValue();
Cell cell = sh.getRow(rowNo).getCell(celno);
DataFormatter df = new DataFormatter();
String value=df.formatCellValue(cell);
return value;


	}
	/**
	 * this method is used to read multiple data from excel
	 * @param sheetname
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public ArrayList<String> readMultipleDataFromExcel(String sheetname) throws EncryptedDocumentException, IOException
	{
FileInputStream fi=new FileInputStream(IpathConstants.excelpath);
Workbook wb=WorkbookFactory.create(fi);
Sheet sh=wb.getSheet(sheetname);
int rowCount=sh.getLastRowNum();
int celCount=sh.getRow(0).getLastCellNum();
ArrayList<String> list=new ArrayList<String>();
for (int i=0;i<=rowCount;i++)
{
	for(int j=0;j<celCount;j++)
	{
		String value=sh.getRow(i).getCell(j).getStringCellValue();
		list.add(value);
		}
}
return list;

}
	/**
	 * 
	 * @param sheetname
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
public int getRowCount(String sheetname) throws EncryptedDocumentException, IOException {
	FileInputStream fi=new FileInputStream(IpathConstants.excelpath);
	Workbook wb=WorkbookFactory.create(fi);
	Sheet sh=wb.getSheet(sheetname);
	int rowCount=sh.getLastRowNum();
	return rowCount;
	
	}
/**
 * this method is used to Gets the total number of cells in a row
 * @param sheetname
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public int getCellcount(String sheetname) throws EncryptedDocumentException, IOException
{
	FileInputStream fi=new FileInputStream(IpathConstants.excelpath);
	Workbook wb=WorkbookFactory.create(fi);
	Sheet sh=wb.getSheet(sheetname);
	int celCount=sh.getRow(0).getLastCellNum();
	return celCount;
	
	
}
/**
 * write data into excel
 * @param sheetname
 * @param value
 * @throws EncryptedDocumentException
 * @throws IOException
 */

public void WriteDataintoexcel(String sheetname,String value) throws EncryptedDocumentException, IOException
{
	FileInputStream fi=new FileInputStream(IpathConstants.excelpath);
	Workbook wb=WorkbookFactory.create(fi);
	Sheet sh=wb.getSheet(sheetname);
	Row row=sh.getRow(0);
	Cell cel=row.createCell(0);
	cel.setCellType(CellType.STRING);
	cel.setCellValue(value);
	 FileOutputStream fos=new FileOutputStream(IpathConstants.excelpath);
	wb.write(fos);
	wb.close();
}
/**
 * 
 * @param sheetname
 * @throws EncryptedDocumentException
 * @throws IOException
 */
//public void readAlldatafromexcel(String sheetname) throws EncryptedDocumentException, IOException{
//
//FileInputStream fs=new FileInputStream(IpathConstants.excelpath);
//Workbook wb= WorkbookFactory.create(fs);
//Sheet sh=wb.getSheet(sheetname);
////
//int lastRow=sh.getLastRowNum();
//int lastCell=sh.getRow(0).getLastCellNum();
////for loop to read sll the data
////
//ArrayList<String> list = new ArrayList<String>();
//for (int i=0;i<=lastRow;i++)
//{
//	for(int j=0;j<lastCell;j++)
//	{
//		String value=sh.getRow(i).getCell(j).getStringCellValue();
//		System.out.print(value+" ");
//		list.add(value);
//		
//		}
//	System.out.println();
//}
//wb.close();
//fs.close();}
/**
 * reading multiple data for testng in object array
 * @param sheetname
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public Object[][] readMultipleDataafortng(String sheetname)
        throws EncryptedDocumentException, IOException {

    FileInputStream fis = new FileInputStream(IpathConstants.excelpath);
    Workbook wb = WorkbookFactory.create(fis);
    Sheet sh = wb.getSheet(sheetname);
//using the method
//    int rowcount = getRowCount(sheetname)+1;      
//    int celcount = getCellcount(sheetname); 
    int rowcount=sh.getLastRowNum()+1;
	int celcount=sh.getRow(0).getLastCellNum();

    Object[][] obj = new Object[rowcount][celcount];

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

