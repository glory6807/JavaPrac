package book2.Part1;

public class TargetThread extends Thread{
	
	public void run() {
		for (long i = 0; i < 1000000000; i++) {
			
		}	//RUNNABLE 상태 유지
		
		try {
			Thread.sleep(1500);
		} catch (Exception e) {
			
		}	//TIMED_WAITING 상태 유지
		
		for (long i = 0; i < 1000000000; i++) {
			
		}	//RUNNABLE 상태 유지
		
	}
	
}
