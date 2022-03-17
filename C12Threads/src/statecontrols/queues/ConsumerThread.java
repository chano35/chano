package statecontrols.queues;

public class ConsumerThread extends Thread {
	private MessageBox msgBox;
	private boolean stop = false;

	public ConsumerThread(MessageBox msgBox) {
		this.msgBox = msgBox;
	}

	@Override
	public void run() {
		while (stop != true) {
			Message msg = this.msgBox.getMessage();
			if (msg.command.equals("종료")) {
				System.out.printf("[Consumer] <작업종료> : command=%s, to=%s %n", msg.command, msg.msg);
				break;
			}

			// To do
			System.out.printf("[Consumer] message: command=%s, to=%s %n", msg.command, msg.msg);

		}

		System.out.println("[END CONSUMER]");
	}

}