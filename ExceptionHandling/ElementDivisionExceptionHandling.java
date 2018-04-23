/*
The commented portion is not removed. It was done to see if we can somehow pass the exception handling mechanism to a functional
interface to handle it 
*/

import java.util.function.BiConsumer;

public class ElementDivisionExceptionHandling {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		printSum(arr, 0, (key, element) -> {
			try {
				System.out.println(element / key);
			} catch (ArithmeticException e) {
				System.out.println("Arithmetic Exception");
			}
		});

	}

	public static void printSum(int[] arr, int key, BiConsumer<Integer, Integer> bi) {
		for (int element : arr)
			bi.accept(key, element);
		// (e)-> e.getMessage();
	}
}
/*
 * public void throwException(ExceptionDemo ed) { ed.getException(e); }
 */
/*
 * for(int element:arr) try { bi.accept(key, element);
 * }catch(ArithmeticException ae) { System.out.println("Exception");
 * ae.getMessage();}
 */
/*
 * } interface ExceptionDemo { void getException(Exception e); }
 */
