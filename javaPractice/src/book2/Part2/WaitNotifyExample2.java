package book2.Part2;

public class WaitNotifyExample2 {

	public static void main(String[] args) {
		Databox databox = new Databox();
		
		ProducerThread producerThread = new ProducerThread(databox);
		ConsumerThread consumerThread = new ConsumerThread(databox);
		
		producerThread.start();
		consumerThread.start();
	}

}
