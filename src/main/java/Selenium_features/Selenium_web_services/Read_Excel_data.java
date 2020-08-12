package Selenium_features.Selenium_web_services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel_data {

	public static void main(String[] args) throws IOException {

	System.out.println(Read_Excel_data.getTestData("Sheet1", "Prakash", "Job"));	
		
		
			}
		
	public static String getTestData(String SheetName,String scenario_name, String Column_name) {
		XSSFWorkbook  book=null;
		String path="C:\\Users\\sarat\\OneDrive\\Desktop\\Sample_Test_data.xlsx";
		FileInputStream file = null;
		try {
			file = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = new XSSFWorkbook(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
XSSFSheet sheet = book.getSheet(SheetName);
		Object[][] data = new Object[sheet.getLastRowNum()+1][sheet.getRow(0).getLastCellNum()];
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i).getCell(k).toString();
			}
		}
		int row = 0;
		int column = 0;
		
		for(int i=0;i<data.length;i++)
		{
			if(data[i][0].toString().equalsIgnoreCase(scenario_name))
			{
				row =i;
				break;
			}
		}
		
		for(int j=0;j<data[0].length;j++)
		{
			if(data[0][j].toString().equalsIgnoreCase(Column_name))
			{
column=j;
break;
			}
		}

		return data[row][column].toString();
	}
}
