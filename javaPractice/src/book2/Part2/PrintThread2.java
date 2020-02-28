package book2.Part2;

public class PrintThread2 extends Thread{
	public void run() {
//		try {
//			while(true) {
//				System.out.println("실행중");
//				Thread.sleep(1);	//아래의 InterruptedException 발생 - 스레드가 일시 정지 상태가 되지 않으면 interrupt() 메소드 호출이 의미가 없으므로 짧은 시간이나마 일시 정지시키기 위해
//			}
//		} catch (InterruptedException e) {
//			
//		}
//		System.out.println("자원 정리");
//		System.out.println("실행 종료");
		
		//일시 정지를 만들지 않고도 interrupt() 호출 여부를 알기 위해 interrupted() 사용해서
		while (true){
			System.out.println("실행중");
			if(Thread.interrupted()) {
				break;
			}
		}
		System.out.println("자원 정리");
		System.out.println("실행 중료");
	}
}
