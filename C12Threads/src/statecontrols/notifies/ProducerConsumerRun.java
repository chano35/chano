package statecontrols.notifies;

public class ProducerConsumerRun {
	
	public static void main (String ar[]) {
		DataBox dataBox = new DataBox();
		
		ProducerThread producer = new ProducerThread(dataBox);
		ConsumerThread consumer = new ConsumerThread(dataBox);
		
		producer.start();
		consumer.start();
	}

}
