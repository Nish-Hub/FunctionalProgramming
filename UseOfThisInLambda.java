/*
Lambda expression does not override the "this"
Anonymous class does 
*/

public class UseOfThisInLambda {
public static void main(String[] args) {
UseOfThisInLambda l=new UseOfThisInLambda();
l.useAnonymous();  //Invoking this of the instance method by invokiing useAnonymous method using UseOfThisInLambda object
l.useLambda();
}
public void useAnonymous()
{
	Utility util=new Utility() {

		@Override
		public void show() {
			System.out.println(this);  // this "this" is a part of the object of this anonymous class
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "This is an instance of Utility Anonymous Class";
		}
	};
	util.show();
}
public void useLambda()
{
	Utility util=() -> {
		System.out.println(this);
	};
	printLambda(util);
	
}
public void printLambda(Utility util)
{
	util.show();
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is an instance of UseOfThisInLambda Class";
	}
interface Utility
{
	void show();
}
}
