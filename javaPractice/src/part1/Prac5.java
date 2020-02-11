package part1;

import java.io.IOException;

public class Prac5 {

	public static void main(String[] args) throws IOException {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode != 13 && keyCode != 10) {	//Enter키가 입력되면 캐리지리턴(13)과 라인피드(10)가 입력되므로 이 값을 제외시킴
				System.out.println("------------------------");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("------------------------");
				System.out.println("선택  : ");
			}//END run if
			
			keyCode = System.in.read();	//키보드의 keyCode를 읽음
			
			if(keyCode == 49) {	//1을 읽었을 경우
				speed++;
				System.out.println("현재속도 : " + keyCode);
			} else if(keyCode == 50) {	//2을 읽었을 경우
				speed--;
				System.out.println("현재속도 : " + keyCode);
			} else if(keyCode == 51) {	//3을 읽었을 경우
				run = false;
			}//END keyCode if
			
		}//END while
			System.out.println("프로그램 종료");
	}//END main

}//END Prac5
