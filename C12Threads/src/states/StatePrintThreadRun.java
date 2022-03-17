package states;

public class StatePrintThreadRun {

	public static void main(String[] args) {
		StatePrintThread thread = new StatePrintThread(new TargetThread());
		thread.start();
	}

}