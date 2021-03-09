package excellearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class MapsToArray {
	
	
	public static void main(String[] args) {
	
		
		HashMap<String, Integer> h1 = new HashMap();
		HashMap<String, Integer> h2 = new HashMap();
		List<HashMap<String,Integer>> lh1 =  new ArrayList();
		
		h1.put("Amazon", 20000);
		h1.put("Google", 40000);
		h1.put("Walmart", 10000);
		h1.put("Cisco", 50000);
		h1.put("Facebook", 30000);
		h2.put("Amazon", 20000);
		h2.put("Google", 40000);
		h2.put("Walmart", 10000);
		lh1.add(h2);
		
		System.out.println("lh1 : " + lh1);
		System.out.println("From hashMaps : " + h1);
		System.out.println("From hashMaps : " + h2);
		
		ArrayList companyNames = new ArrayList(h1.keySet());
		ArrayList companyEmployees = new ArrayList(h1.values());
		ArrayList h1Size = new ArrayList(h1.size());
		ArrayList entrySet = new ArrayList(h1.entrySet());
		System.out.println("from l1 : " + companyNames);
		System.out.println("from l2 : " + companyEmployees);
		System.out.println("h1size : " + h1.size());
		System.out.println("entryset : " + entrySet);
		
		for(int s : h1.values()) {
			//System.out.println("for each : " + s.toString());
			int x = s;
			System.out.println("x : " + x);
		}
		
		Object[] a = entrySet.toArray();
		System.out.println("to object : " + a[4].toString());
	
			
		}
		
		
		
	}


