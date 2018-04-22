

public class CalculatorImpl implements Calculator {
	// The implementation of the body of the interface Calculator	
		@Override
		public int add(int a, int b) {
			// TODO Auto-generated method stub
			return a+b;
		}

		@Override
		public int mul(int a, int b) {
			// TODO Auto-generated method stub
			return a*b;
		}

		@Override
		public int subtract(int a, int b) {
			// TODO Auto-generated method stub
			return Math.abs(a-b);
		}

		@Override
		public int stringLength(String s) {
			// TODO Auto-generated method stub
			return s.length();
		}

		@Override
		public int findChar(char[] a, char c) {
			// TODO Auto-generated method stub
			for(int i=0;i<a.length;i++)
				if(a[i]==c)
					return i; 
			return -1;
		}

}
