import java.util.function.BiConsumer;

public class ElementDivisionExceptionHandlingWrapper {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		printSum(arr, 0, wrapperExceptionLambda((key, element) -> System.out.println(element / key)));

	}

	public static void printSum(int[] arr, int key, BiConsumer<Integer, Integer> bi) {
		for (int element : arr)
			bi.accept(key, element);   // This gets the body from wrapperExceptionLambda method
	}

	private static BiConsumer<Integer, Integer> wrapperExceptionLambda(BiConsumer<Integer, Integer> consumer) {
		return (key, element) -> {
			try {
				consumer.accept(key, element);  // This gets the body from main method . This is not recursion.The body passed is different
			} catch (ArithmeticException ae) {
				System.out.println("Arithmetic exception");
			}
		};
	}
}
