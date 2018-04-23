public class ThreadMethodReference {
	static Thread tRunnable = null;
	static Thread tAnonymousRunnable = null;
	static Thread tLambdaRunnable = null;

	public static void main(String[] args) {

// Lamdba Runnable thread
		tLambdaRunnable = new Thread(() -> printMessage()); // This is like a run() invoking another method hence we can directly pass
		// in the method inside here instead of the method body . So here we see , if we are passing some lambda expression which already
		// is defined somewhere in the method, we can directly pass that method reference as shown below
		tLambdaRunnable = new Thread(ThreadMethodReference::printMessage);
		tLambdaRunnable.start();
	}
	public static void printMessage()
	{
		System.out.println("Instantiating the lamdba thread");
	}
}
class RunnableDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnable thread instantiated");
	}

}
