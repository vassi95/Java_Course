package ThirdExc;

public class Threads extends Thread {

	synchronized void printNums() {
		for (int i = 1; i <= 50000; i++) {
			if (i == 25000) {
				System.out.println(i);
				try {
					wait();
				} catch (Exception e) {
					System.out.println(e);
				}
			}
			System.out.println(i);
		}
	}

	synchronized void ptintRunning() {
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("Running...");
		}
		notifyAll();
	}
}
