package part09;

public class SmartTelevision implements RemoteControl, Searchable{
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {{
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

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
}
