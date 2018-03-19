package com.bridgeit.collectionClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionClass {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("OS");
		list.add("C++");
		list.add("Java");
		list.add("DBMS");

		System.out.println("Initial Collection value list:" + list + "\n");

		Collections.addAll(list, "Python, Cloud");
		System.out.println("After adding elements to collections list:" + list + "\n");

		String[] stringColl = { "C#", "Ruby" };
		Collections.addAll(list, stringColl);
		System.out.println("After adding elements to string collection:" + list);
	}
}
