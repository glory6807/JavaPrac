package part07;

public class PracIn {
	
	public static void method1(Parent parent) {
		if(parent instanceof Child) {	//Child 타입으로 변환 가능한지 확인
			Child child = (Child) parent;
			System.out.println("method1 = Child로 변환 성공");
		} else {
			System.out.println("method1 = Child로 변환 실패");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 = Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();	//Child 객체를 매개값으로 전달, 두 메소드 모두 예외 발생X
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();	//Parent 객체를 매개값으로 전달, 1은 instanceof 연산자로 변환 가능 확인하지만 2무조건 변환하려 하므로 예외 발생
		method1(parentB);
		method2(parentB);	//예외 발생
	}

}
