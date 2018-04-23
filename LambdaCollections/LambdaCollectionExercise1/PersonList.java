package com.code.lambdaInCollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonList {
	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(new Person("aa", "cb", 3), new Person("cc", "dd", 4),
				new Person("ee", "ff", 5), new Person("gg", "hh", 6));

		Collections.sort(personList, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}

		});

		printList(personList);
		/*
		 * Print printFunctionalInterface = () -> {
		 * 
		 * for (Person p : personList) { System.out.println(p); }
		 * 
		 * }; printFunctionalInterface.print();
		 * 
		 * printListLambda(printFunctionalInterface);
		 */
		System.out.println("Applying Filter");
		printListFilter(personList);
		/*
		 * PrintFilter printFilterFunctionalInterface = () -> {
		 * 
		 * for (Person p : personList) { if (p.lastName.startsWith("c"))
		 * System.out.println(p); }
		 * 
		 * }; printFilterFunctionalInterface.print();
		 * printListFilterLambda(printFilterFunctionalInterface);
		 */

		// Using anonymous class
		printListConditionFilter(personList, (p) -> {
			return p.lastName.startsWith("c");
		});

		// Combining the two methods i.e behavior is defined by the method caller not
		// the method itself
		// This is done in the PersonListOptimized.java code.

	}

	public static void printList(List<Person> personList) {
		for (Person p : personList) {
			System.out.println(p);
		}
	}

	public static void printListLambda(Print p) {
		p.print();
	}

	public static void printListFilter(List<Person> personList) {
		for (Person p : personList) {
			if (p.lastName.startsWith("c"))
				System.out.println(p);
		}
	}

	public static void printListFilterLambda(PrintFilter p) {
		p.print();
	}

	public static void printAllFormats(Print p) {
		p.print();
	}

	public static void printListConditionFilter(List<Person> personList, Condition condition) {
		for (Person p : personList) {
			if (condition.test(p))
				System.out.println(p);
		}
	}

	interface Print {
		void print();
	}

	interface PrintFilter {
		void print();
	}

	interface Condition {
		boolean test(Person p);
	}
}