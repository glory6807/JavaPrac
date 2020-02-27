package book2.Part1;

import java.awt.*;

public class BeepPrintEx {

	public static void main(String[] args) {
//		Toolkit toolkit = Toolkit.getDefaultToolkit();	//Toolkit 객체 얻기
//		for (int i = 0; i < 5; i++) {
//			toolkit.beep();	//비프음 발생
//			try {
//				 Thread.sleep(500);	//0.5초간 일시정지
//			} catch (Exception e) {
//				
//			}
//		}	//여기서 실행하면 비프음이 다 끝나고 글자가 출력되기 때문에 하나를 메인 스레드가 아닌 다른 스레드에서 실행시켜야 함
		
		Runnable beepTask = new BeepTask();		//Runnable은 작업 내용을 가지고 있는 객체이지 실제 스레드가 아님.
		Thread thread = new Thread(beepTask);	//Runnable 구현 객체를 생성한 후, 이것을 매개값으로 해서 Thread 생성자를 호출하면 비로소 작업 스레드가 생성됨
		thread.start();
		
		for (int j = 0; j < 5; j++) {
			System.out.println("띵");
			try {
				 Thread.sleep(500);	//0.5초간 일시정지
			} catch (Exception e) {
				
			}
		}
			
		
	}

}
