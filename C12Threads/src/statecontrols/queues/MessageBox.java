package statecontrols.queues;

import java.util.LinkedList;
import java.util.Queue;

public class MessageBox {
	final static int MAX_MESSAGES = 10;

	private Queue<Message> messages = new LinkedList<Message>();

	/*
	 * 소비자(자료 열람자)
	 */
	public synchronized Message getMessage() {
		/*
		 * data 필드가 null이면 소비자 스레드를 일시 정지 상태로 만듦
		 */
		// System.out.println("[getMessage] this.messages.size() : " +
		// this.messages.size());
		if (this.messages.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}

		/*
		 * data 필드를 null 만들고 생산자 스레드를 실행 대기 상태로 만듦
		 */
		Message message = this.messages.poll();
		if (this.messages.isEmpty()) {
			notify();
		}

		return message;
	}

	/*
	 * 생산자(자료 제공자)
	 */
	public synchronized void setMessage(Message message) {
		// System.out.printf("[Producer] (setMessage) message(%d): command=%s, to=%s
		// %n", this.messages.size(), message.command, message.msg);

		if (this.messages.size() >= MAX_MESSAGES) { // 소비자가 아직 데이터를 읽지 않음
			try {
				// notify();
				System.out.println("-------------------------------------------------");
				wait();
			} catch (InterruptedException e) {

			}
		}

		this.messages.offer(message);
		if (message.command.equals("종료")) {
			// System.out.printf("[Producer] (종료) message(%d): command=%s, to=%s %n",
			// this.messages.size(), message.command, message.msg);
			notify();
			try {
				// System.out.printf("[Producer] (종료) wait: command=%s, to=%s %n",
				// this.messages.size(), message.command, message.msg);
				wait();
			} catch (InterruptedException e) {

			}
		}

		if (this.messages.size() >= MAX_MESSAGES) {
			// System.out.printf("[Producer] (MAX_MESSAGES) : size(%d), command=%s, to=%s
			// %n", this.messages.size(), message.command, message.msg);
			notify();
		}

		// System.out.printf("[Producer] message(%d): command=%s, to=%s %n",
		// this.messages.size(), message.command, message.msg);
	}

	public synchronized int sizeMessage() {
		return this.messages.size();
	}
}