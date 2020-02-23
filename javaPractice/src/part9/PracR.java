package part9;

public class PracR {

	public static void main(String[] args) {
//		RemoteControl rc;
//		rc = new Television();
//		rc = new Audio();
		
		RemoteControl rc = new RemoteControl() {			
			@Override	//생략가능
			public void turnOn() {}
			public void turnOff() {}			
			public void setVolume(int volume) {}
		};
	}

}
