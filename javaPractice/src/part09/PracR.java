package part09;

public class PracR {

	public static void main(String[] args) {
//		RemoteControl rc;
//		rc = new Television();
//		rc = new Audio();
		
//		RemoteControl rc = new RemoteControl() {	//일회성의 구현 객체를 만들기 위해 소스 파일을 만들고 클래스를 선언하는 것은 비효율적이라서 익명 구현 객체를 생성해서 인터페이스 변수에 대입		
//			@Override	//생략가능
//			public void turnOn() {}
//			public void turnOff() {}			
//			public void setVolume(int volume) {}
//		};
		
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		
		//정적 메소드는 인터페이스로 바로 호출 가능
		RemoteControl.changeBattery();
	}

}
