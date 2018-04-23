public class ThreadDemo {
	static Thread tRunnable = null;
	static Thread tAnonymousRunnable = null;
	static Thread tLambdaRunnable = null;

	public static void main(String[] args) {
// Runnable thread
		Runnable rRunnable = new RunnableDemo();
		tRunnable = new Thread(rRunnable);
		tRunnable.start();

// Anonymous Runnable thread
		Runnable rAnonymous = new Runnable() {
			@Override
			public void run() {
				System.out.println("Instantiating the anonymous thread");
			}
			
		};
		tAnonymousRunnable = new Thread(rAnonymous);
		tAnonymousRunnable.start();

// Lamdba Runnable thread
		tLambdaRunnable = new Thread(() -> System.out.println("Instantiating the lamdba thread"));
		tLambdaRunnable.start();
	}
}
class RunnableDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnable thread instantiated");
	}

}
