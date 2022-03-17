package states2;

public class StateThreadRun {

	public static void main(String[] args) {
		StateThread thread = new StateThread(new TargetThread());
		thread.start();
	}

}