package statecontrols.queues;

public class ProducerConsumerRun {

	public static void main(String[] args) {
		MessageBox msgBox = new MessageBox();

		ProducerThread producer = new ProducerThread(msgBox);
		ConsumerThread consumer = new ConsumerThread(msgBox);

		producer.start();
		consumer.start();
	}

}