package com.bridgeit.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class TestComparator {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<>();

		Student student = new Student(1, "sami", 20);
		Student student2 = new Student(2, "shoni", 15);
		Student student3 = new Student(3, "Rosely", 25);

		list.add(student);
		list.add(student2);
		list.add(student3);

		System.out.println("Sorting by Name:");
		Collections.sort(list, new NameComparator());

		Iterator<Student> itr = list.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.age + " " + st.name);
		}

		System.out.println("\n" + "Sorting by age:");
		Collections.sort(list, new AgeComparator());

		Iterator<Student> itrAge = list.iterator();
		while (itrAge.hasNext()) {
			Student st = (Student) itrAge.next();
			System.out.println(st.name + " " + st.age);
		}
	}
}
