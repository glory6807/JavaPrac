package book2.Part1;

import java.awt.*;

public class BeepTask implements Runnable{	

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();	//비프음 발생
			try {
				 Thread.sleep(500);	//0.5초간 일시정지
			} catch (Exception e) {
				
			}
		}
	}

}
