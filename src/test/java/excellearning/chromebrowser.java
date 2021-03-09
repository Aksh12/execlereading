package excellearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class chromebrowser {

	WebDriver driver = null;

	@Test(dataProvider="inputData")
	public void setup(Map<Object, Object> data) {
		if(driver==null) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ApuAkki\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}	
			
			driver.get("https://www.google.com");
			driver.findElement(By.name("q")).sendKeys(data.get("password").toString());
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		
	

	@DataProvider(name="inputData")
	public Object[][] testInput() {
		System.out.println("am in inut dataProvider Method");
		List<TreeMap<String, String>> m1 = ExcelUtility.testdata();
		Object[][] obj = new Object[m1.size()][1];
		System.out.println(obj + "----");
		
		for(int i=0 ; i<m1.size();i++) {
			obj [i][0] = m1.get(i);
			System.out.println(m1.get(i) + "-------------*********_____________");
		}
		
		return  obj;
}
} 