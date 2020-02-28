package book2.Part2;

public class ConsumerThread extends Thread{
	private Databox databox;
	
	public ConsumerThread(Databox databox) {
		this.databox = databox;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			String data = databox.getData();
		}
	}
	
	
	
}
