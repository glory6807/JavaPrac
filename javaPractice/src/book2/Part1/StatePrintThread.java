package book2.Part1;

public class StatePrintThread extends Thread{
	
	private Thread targetThread;

	public StatePrintThread(Thread targetThread) {	//상태를 조사할 스레드
		this.targetThread = targetThread;
	}
	
	public void run() {
		while (true) {
			Thread.State state = targetThread.getState();	//스레드 상태 얻기
			System.out.println("타겟 스레드 상태 : " + state);
			
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			
			if(state == Thread.State.TERMINATED) {
				break;
			}
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
			
		}
	}
}
