package by.htp.hashMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, Integer> hashMap = fillData();
		System.out.println("Unsorted Map:");
		printMap(hashMap);

		System.out.println("Sorted Map By Value:");
		Map<String, Integer> sortedMap = sortByValue(hashMap);
		printMap(sortedMap);

		printCategoryWithMaxValue(hashMap);

		removeProductWithZeroValue(hashMap);
		printMap(hashMap);
	}

	private static Map<String, Integer> fillData() {
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Мобильные телефоны", 79);
		hashMap.put("Планшеты", 42);
		hashMap.put("Ноутбуки", 40);
		hashMap.put("Компьюторы", 45);
		hashMap.put("Телевизоры", 0);
		hashMap.put("Электронные книги", 8);
		hashMap.put("Мониторы", 12);
		hashMap.put("Наушники", 5);
		hashMap.put("Гарнитуры", 0);
		hashMap.put("Фотоаппараты", 26);
		return hashMap;
	}

	private static Map<String, Integer> sortByValue(Map<String, Integer> hashMap) {
		// 1. Convert Map to List of Map
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hashMap.entrySet());

		// 2. Sort list with Collections.sort(), provide a custom Comparator
		// Try switch the o1 o2 position for a different order
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		// 3. Loop the sorted list and put it into a new insertion order Map
		// LinkedHashMap
		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}

	public static <K, V> void printMap(Map<K, V> map) {
		for (Map.Entry<K, V> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + "  Value : " + entry.getValue());
		}
	}

	private static void printCategoryWithMaxValue(Map<String, Integer> map) {
		Map.Entry<String, Integer> maxEntry = null;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
				maxEntry = entry;
			}
		}
		System.out.println("Category with max value: " + maxEntry.getKey());
	}

	private static void removeProductWithZeroValue(Map<String, Integer> map) {
		Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			int numberOfProducts = iterator.next().getValue();
			if (numberOfProducts == 0) {
				iterator.remove();
			}
		}
	}
}