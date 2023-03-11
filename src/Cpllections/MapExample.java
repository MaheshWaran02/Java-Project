package Cpllections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<String,Integer> basket = new LinkedHashMap<String,Integer>();
		
		basket.put("Item1", 1);
		basket.put("Item2", 6);
		basket.put("Item3", 4);
		basket.put("Item4", 9);
		basket.put("Item5", 9);
		
		System.out.println("the map is " + basket);
		
		basket.put("Item4", 10);
		
		System.out.println("the map after Item4 change " + basket);
		
		basket.remove("Item2");
		
		System.out.println("the map after removeing item 2 is " + basket);
		
		
		for(String item:basket.keySet()) {
			
			
			
			System.out.println("Item name is " + item);
			
			System.out.println("Item quantiy is " +basket.get(item));
			
			
		}
		for(Integer val: basket.values()) {
			
			System.out.println("The value is " + val);
		}
		
String str = "Clean World Green World Happy World";
		
		String[] arr1 = str.split(" ");
		HashMap<String,Integer> map1 = new HashMap<String,Integer>();
		
		for(String word:arr1) {	
			if(!map1.keySet().contains(word)) {
				map1.put(word, 1);
			}else {	
				map1.put(word, map1.get(word)+1);
			}
		}
		
		System.out.println("The resulting map  is " + map1);
		
		

	}

}
