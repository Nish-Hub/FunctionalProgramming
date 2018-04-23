import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PersonListPredicateConsumer {
	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(new Person("aa", "cb", 3), new Person("cc", "dd", 4),
				new Person("ee", "ff", 5), new Person("gg", "hh", 6));

		// Sorting the list on basis of last name

		Collections.sort(personList, (o1, o2) -> o1.lastName.compareTo(o2.lastName));

		// Printing the list elements
		printConditionally(personList,p -> true,p -> System.out.println(p));

		// Printing the list elements with last name beginning with "c"
		printConditionally(personList,p -> p.getLastName().startsWith("c"),p -> System.out.println(p));
		
		// Printing the list elements with first name beginning with "c"
		printConditionally(personList,p ->p.getFirstName().startsWith("c"),p -> System.out.println(p));

	}

	// Method to accept the lambda behavior and execute the interface's method
	public static void printConditionally(List<Person> personList,Predicate<Person> pred,Consumer<Person> cons) {
		for (Person p : personList) {
			if (pred.test(p))
				cons.accept(p);
		}
	}

}
