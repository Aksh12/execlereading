package excellearning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelUtility {

	// @Test
	public static List<TreeMap<String,String>> testdata() {
		
		List<TreeMap<String, String>> allData = null;
		TreeMap<String, String> data = null;
		
		String header = null;
		String cellValue = null;
		String keyValue =null;
		try {
			FileInputStream file = new FileInputStream(
					"C:\\Users\\ApuAkki\\eclipse-workspace\\excellearning\\src\\test\\resocurces\\TestData.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(file);
			XSSFSheet sheet = wb.getSheetAt(0);
			int rowCount = sheet.getLastRowNum();
			int cellCount = sheet.getRow(0).getLastCellNum();
			Row row = sheet.getRow(0);
			
			List<String> list = new ArrayList();

			for (int i = 0; i < cellCount; i++) {
				header = row.getCell(i).getStringCellValue();
				System.out.println(list.add(header) + "am in header");
				System.out.println("h : " + list.get(i).toString());
			}
			
			allData = new ArrayList<TreeMap<String, String>>();
			
			for(int i=1; i <=rowCount; i++) {
			Row row1 = sheet.getRow(i);
			data = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
			
			for(int j=0;j<cellCount; j++) {
				Cell cell = row1.getCell(j);
				String colValue = cell.getStringCellValue();
				System.out.println(list.get(j) + " ---Amhere-----" + colValue);
				data.put(list.get(j), colValue);
				
			}
			allData.add(data);
			//System.out.println(cellValue);
			
			//System.out.println(keyValue);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return allData;
	}

}
