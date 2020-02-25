package part05;

public class Prac1 {
	
	String color;
	static double pi = 3.14;
	
	void setColor(String color) {
		this.color = color;
	}
	
	//외부에서 주어진 매개값들을 가지고 수행하므로 정적메소드
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
	
	//정적 필드와 정적 메소드는 원칙적으로 클래스 이름으로 접근해야 하지만 객체 참조 변수도고 접근이 가능함
	//정적 메소드와 정적 블록에서 인스턴스 멤버를 사용하고 싶으면 객체를 먼저 생성하고 참조 변수로 접근해야 함
	//main() 메소드도 정적(static) 메소드이므로 객체 생성 없이 인스턴스 필드와 인스턴스 메소드를 바로 사용할 수 없음
}
	
