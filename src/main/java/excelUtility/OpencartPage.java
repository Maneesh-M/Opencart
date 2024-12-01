package excelUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OpencartPage {
//To read Email id
	@SuppressWarnings("resource")
	public  String Excel_Email(int r) throws IOException
	{	  
		FileInputStream fil = new FileInputStream(new File("C:\\Users\\BLTuser.BLT059\\eclipse-workspace\\Opencartproject\\src\\test\\resources\\TestData\\excel.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheetAt(0);	
		String em =sheet.getRow(r).getCell(0).getStringCellValue();		
		return em;
	}
			
//To read Password
	@SuppressWarnings("resource")
	public  String Excel_Password(int r) throws IOException 
	{ 
	FileInputStream fil = new FileInputStream(new File("C:\\Users\\BLTuser.BLT059\\eclipse-workspace\\Opencartproject\\src\\test\\resources\\TestData\\excel.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheetAt(0);
		String pwd =sheet.getRow(r).getCell(1).getStringCellValue();			          
	    return pwd;
  }

}
