package com.Audrey2.test;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
		HashMap<String, String> dictionary = new HashMap<>();
		dictionary.put("apple", "a forbidden fruit");
		dictionary.put("banana", "a yellow fruit that can be peeled");
		dictionary.put("cantaloupe", "A melon fruit that has orange flesh.");
		
		System.out.println(dictionary);
		
		String key = "apple";
		String value = dictionary.get(key);
		
		System.out.println("The value for the key: " + key + " is " + value);
		
		//tree map
		TreeMap<String, String> sortedDictionary = new TreeMap<>();
		
		sortedDictionary.putAll(dictionary);
		System.out.println(sortedDictionary);
		
		// add another element to the sorted dictionary
		sortedDictionary.put("beets", "an actual vegetable");
		System.out.println(sortedDictionary);
		
		// re-add beets
		sortedDictionary.put("beets", "a better explanation");
		System.out.println(sortedDictionary);
		
		// keySet()
		
		Set<String> keys = sortedDictionary.keySet();
		
		for (String s: keys) {
			System.out.println("key: " + s);
		}

	}

}
