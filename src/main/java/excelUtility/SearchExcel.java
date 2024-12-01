package excelUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SearchExcel {

	@SuppressWarnings("resource")
	public void Write_Excel(int r, int c, String data) {
		String filename = "C:\\Users\\BLTuser.BLT059\\eclipse-workspace\\Opencartproject\\src\\test\\resources\\TestData\\excel.xlsx";
		File f = new File(filename);
		try {

			FileInputStream fis = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet("Sheet3");
			XSSFRow row = sh.createRow(r);
			XSSFCell cell = row.createCell(c);
			FileOutputStream fos = new FileOutputStream(f);
			cell.setCellValue(data);
			wb.write(fos);

		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
	}
}
