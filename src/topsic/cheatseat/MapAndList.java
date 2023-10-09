package topsic.cheatseat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapAndList {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("str1", 1);
		map.put("str2", 2);
		map.put("str3", 3);
		map.put("str4", 2);

		// loop with key and value
		map.forEach((key, value) -> {
			if (key.equals("str1"))
				System.out.println(value);
		});
		System.out.println("####################");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.print(entry.getKey() + " : ");
			System.out.print(entry.getValue() + ", ");
		}
		System.out.println("\n###################");
		// loop key
		for(String key: map.keySet()) {
			System.out.print(key +" ");
		}
		System.out.println("\n###################");
		// loop value
		for(Integer value: map.values())
			System.out.print(value);
		
		System.out.println("\n###################");
		// sample
		List<String> keyList = searchByValue(map,2);
		keyList.forEach(System.out::print);
	}
	
	
	// search by value
	public static List<String> searchByValue(Map<String,Integer> map, Integer value){
		return map.keySet().stream()
			.filter(key -> map.get(key)==value)
			.collect(Collectors.toList()); //toArray()で配列
	}
}
