package tnames;

public class ThreadNameRun {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("main thread: " + mainThread.getName());

		ThreadT1 t1 = new ThreadT1();
		System.out.printf("Worker:tname(%s) %n", t1.getName());

		ThreadT2 t2 = new ThreadT2();
		System.out.printf("Worker:tname(%s) %n", t2.getName());

		t1.start();
		t2.start();

		System.out.println("THE END");

	}

}