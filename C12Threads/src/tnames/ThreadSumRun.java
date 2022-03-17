package tnames;

public class ThreadSumRun {

	public static void main(String[] args) {
		ThreadSum sum1 = new ThreadSum("sum1", 1000000);
		ThreadSum sum2 = new ThreadSum("sum2", 100000);

		sum1.start();
		sum2.start();

		System.out.println("sum1: " + sum1.sum());
		System.out.println("sum2: " + sum2.sum());
	}

}