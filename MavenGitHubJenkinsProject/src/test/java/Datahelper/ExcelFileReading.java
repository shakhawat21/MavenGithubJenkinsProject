package Datahelper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReading {
	
	public static Object[][] excelDataReading(String filePath, String sheetName) throws IOException {
		// Object[][] object;
		File f=new File(filePath);
		 FileInputStream fis=new FileInputStream(f);
		 Workbook wb=new XSSFWorkbook(fis);///ExcelSpreadSheetFile=XSSF
		 Sheet ws=wb.getSheet(sheetName);

		 int rowCount=ws.getLastRowNum()-ws.getFirstRowNum();
		 int colCount=ws.getRow(0).getLastCellNum();
		 
		 Object[][] object = new Object[rowCount][colCount];
		 
		 for(int i=0; i<rowCount;i++) {
			 Row row=ws.getRow(i+1);
			 
			 for(int j=0; j<row.getLastCellNum(); j++) {
				 object[i][j]=row.getCell(j).toString();
			 }
		 }
		 return object;
	}
	 	

}
