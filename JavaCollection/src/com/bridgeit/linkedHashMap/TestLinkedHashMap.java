package com.bridgeit.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestLinkedHashMap {

	public static void main(String[] args) {

		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(1, "Silky");
		map.put(2, "Alice");
		String data = map.get(1);
		System.out.println(data);
		System.out.println(map);

	}
}
