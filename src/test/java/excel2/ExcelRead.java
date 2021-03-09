package excel2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelRead {
	
	
	@Test
	public static List<LinkedHashMap<String, String>> readData() {
		
		List<LinkedHashMap<String, String>> allData = null ;
		LinkedHashMap<String, String> data = null;
		
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\ApuAkki\\eclipse-workspace\\excellearning\\src\\test\\resocurces\\TestData.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			int rowCount = sheet.getLastRowNum();
			int colCount = sheet.getRow(0).getLastCellNum();
			
			String header;
			List headerValue = new ArrayList();
			
			for(int i=0; i<colCount; i++) {
				Row row = sheet.getRow(0);
				Cell cell = row.getCell(i);
				header = cell.getStringCellValue();
				headerValue.add(header);
				//System.out.println("List = " + header);
			}
			
			allData =  new ArrayList<LinkedHashMap<String,String>>();
			
			for(int j=1; j<rowCount; j++) {
				Row row1=sheet.getRow(j);
				data =new LinkedHashMap<String,String>();
				
				for(int k=0; k<colCount; k++ ) {
					Cell cell = row1.getCell(k);
					String cellValue = cell.getStringCellValue();
					data.put((String) headerValue.get(k), cellValue);
					

				}
			
				allData.add(data);
				//System.out.println("AllData : " + allData);
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		return allData;
		
	}

}
