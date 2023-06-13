package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;
import org.testng.annotations.DataProvider;



public class ReadXLSData {
//	Main method was just to test the utility
//	public static void main(String[] args) throws IOException {
//		
//		ReadXLSData red = new ReadXLSData();
//		red.getData("login");
//		
//
//	}
	
	@DataProvider(name="testdata")
	public String[][] getData (Method m) throws IOException{
		String excelSheetName = m.getName();
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\testdata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		//XSSF replacing HSSF
		XSSFWorkbook wb = new XSSFWorkbookFactory().create(fis);
		Sheet sheetName = wb.getSheet(excelSheetName);
		
		int totalRows = sheetName.getLastRowNum();
		System.out.println(totalRows);
		Row rowCells = sheetName.getRow(0);
		int totalCols = rowCells.getLastCellNum();
		System.out.println(totalCols);
		
		DataFormatter format = new DataFormatter();
		
		String testData [][] = new String [totalRows][totalCols];
		for (int i=1;i<=totalRows;i++) {
			for (int j =0;j<totalCols;j++) {
				testData[i-1][j]=format.formatCellValue(sheetName.getRow(i).getCell(j));
				System.out.println(testData[i-1][j]);
			}
		}
		
	return testData;
	}
}
