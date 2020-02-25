package part09;

public class Television implements RemoteControl{	//구현 클래스
	
	private int volume;
	
	@Override	//인터페이스의 추상 메소드에 대한 정확한 실체 메소드인지 컴파일러가 체크하도록 지시하는 어노테이션
	public void turnOn() {
		System.out.println("TV를 켭니다.");		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		//인터페이스 상수를 이용해서 volume 필드의 값을 제한
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : this.volume");
	}

}
