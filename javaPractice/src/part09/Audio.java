package part09;

public class Audio implements RemoteControl{	//추상 클래스의 추상 메소드에 대응하는 실체 메소드를 구현 클래스가 작성하지 않으면 구현 클래스가 자동적으로 추상클래스가 되므로 class앞에 abstract를 붙여줘야 함
	
	private int volume;
	private boolean mute;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");				
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");		
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

	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("Audio 무음 처리합니다.");
		} else {
			System.out.println("Audio 무음 해제합니다.");
		}
	}
	
	

}
