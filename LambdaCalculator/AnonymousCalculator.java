package com.code.LambdaCalculator;

/*
 * The main point to note here is if we were to use Calculator interface, we were required earlier to make a class for this
 * interface and then provide this class's object to the reference of the interface. But with anonymous class, we can
 * directly use the interface inside a class directly with the anonymous class as its implementing body
 * 
 */

public class AnonymousCalculator {
	// Defining an anonymous class Calculator .
	static Calculator cd = new Calculator() {
		public int add3(int a, int b, int c) {
			return a + b + c;
		}

		public int add(int a, int b) {
			return a + b;
		}

		public int mul(int a, int b) {
			return a * b;
		}

		public int subtract(int a, int b) {
			return Math.abs(a - b);
		}

		public int stringLength(String s) {
			return s.length();
		}

		public int findChar(char[] a, char c) {
			for (int i = 0; i < a.length; i++)
				if (a[i] == c)
					return i;
			return -1;
		}
	};

	public static void main(String[] args) {

		char a[] = { 'a', 'b', 'c', 'd' };
		// Using the calculator
		cd.add(1, 2);
		cd.mul(1, 2);
		cd.subtract(1, 2);
		cd.findChar(a, 'c');

		/*
		 * The compiler looks in the interface at compile time and sees no method in the
		 * interface body with the name add3 as this is defined in the anonymous class
		 * not in the method definition cd.add3(1,2,3);
		 */

		// cd.findChar({'a','b','c','d'},'c');
	}
}
