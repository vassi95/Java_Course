package SecondExc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolOf7Threads {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(7);
		for (int i = 1; i < 6; i++) {
			Threads newThread = new Threads();
			executor.execute(newThread);
			newThread.setName("thread" + i);
			System.out.println("Hi, my name is " + newThread.getName());
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}
	}
}
