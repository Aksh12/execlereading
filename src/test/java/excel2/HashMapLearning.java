package excel2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HashMapLearning {

	@Test(dataProvider="input")
	public static void test(Map<String, String> data) {
		int i=0;
		
		//System.out.println(data.get("testid"));
	}
	
	
	@DataProvider(name="input")
	public Object[][] inputData() {
		
		List<LinkedHashMap<String, String>> d = ExcelRead.readData();
		//System.out.println("d.size : " + d.size());
		Object[][] input = new Object[d.size()][1];
		for(int i=0; i<d.size(); i++) {
			input[i][0]=d.get(i);
			System.out.println("input : " + input[i][0]);
		}
		
		return input;
		
	}

}
