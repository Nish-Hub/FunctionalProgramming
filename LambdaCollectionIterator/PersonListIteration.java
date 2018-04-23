/*
 * The key point of not controlling the iterator order is the runtime now controls the order and it is not sequential anymore i.e parallel threads can be run for this 
 * Hence , jdk8's iterator foreach does this task of iterating over the collection in its own way and we get expected output in less execution time 
 * 
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PersonListIteration {
	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(new Person("aa", "cb", 3), new Person("cc", "dd", 4),
				new Person("ee", "ff", 5), new Person("gg", "hh", 6));
		/*
		 * External Iterator : Telling the compiler/runtime by controlling the iteration
		 * i.e end points of loop and controlling what to do with the elements
		 */
		System.out.println("Using External Iterator :: \n\n");
		for (int i = 0; i < personList.size(); i++)
			System.out.println(personList.get(i));
		
		for (Person p : personList)
			System.out.println(p);
	
		/*
		 * Java 8 Iterator : Internal Iterator. Control given to iterator .Iterator
		 * chooses the order The user is only concerned with the iteration of the
		 * elements
		 */
		System.out.println("\nUsing Internal Iterator :: \n\n");
		
		personList.forEach(p -> System.out.println(p));
		personList.forEach(System.out::println); 
    //For each element the method Consumer.accept(p) runs and executes the body of the method reference passed.
	}
}
