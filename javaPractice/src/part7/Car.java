package part7;

public class Car {
	//필드
	Tire frontLeftTire = new Tire(6, "앞왼쪽");
	Tire frontRightTire = new Tire(2, "앞오른쪽");
	Tire backLeftTire = new Tire(3, "앞왼쪽");
	Tire backRightTire = new Tire(4, "앞오른쪽");
	
	//생성자
	
	//메소드
	int run() {	//모든 타이어를 1회 회전시키기
		System.out.println("[자동차가 달립니다]");
		if(frontLeftTire.roll() == false) {	//false를 리턴하는 타이어는
			stop();		//멈춤 메소드를 호출하고
			return 1;	//해당 타이어번호를 리턴
		}
		if(frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		if(backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if(backRightTire.roll() == false) {
			stop();
			return 4;
		}	
			return 0;
	}
	
	public void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
