package part10;

public class Button {
	//인터페이스 타입 필드
	OnClickListener listener;
	
	//매개 변수의 다형성
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	//구현 객체의 onClick() 메소드 호출
	void onClick() {
		listener.onClick();
	}
	
	//중첩 인터페이스 - Button클래스와 긴밀한 관계를 맺는 구현 클래스를 만들기 위해 내부에 선언
	interface OnClickListener {
		void onClick();
	}
}
