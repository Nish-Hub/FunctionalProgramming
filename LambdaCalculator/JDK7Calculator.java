
/*
 * The point to note here is to use the interface calculator we have to make a implementation class of the calculator
 * interface and then use this object to use the calculator methods. This overhead is removed in the anonymous class
 * 
 */


public class JDK7Calculator{

	public static void main(String[] args) {
		Calculator cd=new CalculatorImpl();
		char a[] = { 'a', 'b', 'c', 'd' };
		// Using the calculator
		cd.add(1, 2);
		cd.mul(1, 2);
		cd.subtract(1, 2);
		cd.findChar(a, 'c');
	}
}
 
