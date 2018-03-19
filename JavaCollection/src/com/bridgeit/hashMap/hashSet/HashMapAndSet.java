package com.bridgeit.hashMap.hashSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapAndSet {

	public static void main(String[] args) {

		Employee employee = new Employee(1, "abc", "cape Town", "Sion");
		Employee employee2 = new Employee(2, "xyz", "Anand vihar", "Indore");

		Map<Integer, Employee> map = new HashMap<>();

		map.put(1, employee);
		map.put(2, employee2);

		for (Map.Entry<Integer, Employee> e : map.entrySet()) {

			int key = e.getKey();
			Employee emp = e.getValue();

			System.out.println(key + "Detail:");
			System.out.println(emp.id);
			System.out.println(emp.name);
			System.out.println(emp.address);
			System.out.println(emp.city+"\n");
		}
	}
}
