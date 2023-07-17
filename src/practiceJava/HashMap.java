package practiceJava;

import java.util.Map;

public class HashMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new java.util.HashMap<>();
		map.put(1, "Nepal");
		map.put(2, "India");
		map.put(3, "China");
		map.put(4, "Norway");
		map.put(5, "USA");
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.get(4));
		System.out.println(map.values());
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		map.remove(2);
		System.out.println(map.values());
		map.clear();
		System.out.println(map.values());
	}

}
