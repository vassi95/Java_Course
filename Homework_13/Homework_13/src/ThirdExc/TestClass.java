package ThirdExc;

public class TestClass {

	public static void main(String[] args) {
		final Threads newThread = new Threads();
		new Thread() {
			public void run() {
				newThread.printNums();
			}
		}.start();
		new Thread() {
			public void run() {
				newThread.ptintRunning();
			}
		}.start();
	}
}
