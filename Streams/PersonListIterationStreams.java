
public class PersonListIterationStreams {
	public static void main(String[] args) {

		// List of persons
		List<Person> personList = Arrays.asList(new Person("aa", "cb", 3), new Person("cc", "cd", 4),
				new Person("ee", "ff", 5), new Person("gg", "hh", 6));

		// Iterating over the person list using stream() with filter and a terminal
		// operation to print the result
		personList.stream() // Source of the stream
				.filter(p -> p.getLastName().startsWith("c")) // operations to be performed on the stream
				.map(p -> p.getFirstName() + "c").forEach(p -> System.out.println(p)); // terminal operation

		// Iterating over the person list using stream() with map and a terminal
		// operation to print the result
		personList.stream() // Source of the stream
				.filter(p -> p.getLastName().startsWith("c")) // operations to be performed on the stream
				.map(p -> p.getFirstName() + "c").forEach(p -> System.out.println(p)); // terminal operation

		personList.stream().map(p -> p.getFirstName().startsWith("c"));

		// Matching the elements of the stream with a condition
		personList.stream().allMatch(p -> p.age > 0);

		// Iterating over the person list using stream() with filter , then mapping to
		// int stream with a conversion and a terminal
		// operation to print the sum
		int sum = personList.stream().filter(w -> w.getLastName().startsWith("c"))
				.mapToInt(w -> (w.getFirstName() + w.getLastName()).length()).sum();

		// The above operation with terminal operation to just print the elements
		personList.stream().filter(w -> w.getLastName().startsWith("c"))
				.mapToInt(w -> (w.getFirstName() + w.getLastName()).length()).forEach(p -> System.out.println(p));

	}
}
