package com.code.lambdaInCollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

//Not required now. Java8 provides us in built functional interfaces to use directly: Predicate<T> 
// https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

/*@FunctionalInterface
interface Condition {
	boolean test(Person p);
}*/

public class PersonListOptimized {
	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(new Person("aa", "cb", 3), new Person("cc", "dd", 4),
				new Person("ee", "ff", 5), new Person("gg", "hh", 6));

		// Sorting the list on basis of last name

		Collections.sort(personList, (o1, o2) -> o1.lastName.compareTo(o2.lastName));

		// Printing the list elements
		printConditionally(personList,p -> true);

		// Printing the list elements with last name beginning with "c"
		printConditionally(personList,p -> p.getLastName().startsWith("c"));
		
		// Printing the list elements with first name beginning with "c"
		printConditionally(personList,p ->p.getFirstName().startsWith("c"));

	}

	// Method to accept the lambda behavior and execute the interface's method
	public static void printConditionally(List<Person> personList,Predicate<Person> cond) {
		for (Person p : personList) {
			if (cond.test(p))
				System.out.println(p);
		}
	}

}
