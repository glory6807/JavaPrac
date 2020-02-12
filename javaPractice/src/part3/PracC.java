package part3;

public class PracC {

	public static void main(String[] args) {
		//Car car = new Car();	//Car클래스에 생성자 선언이 있기 때문에 기본 생성자를 호출할 수 없음
		Car car = new Car("그랜져", 3000);	
		
		System.out.println("자동차 회사 : " + car.company);
		System.out.println("자동차 모델 : " + car.model);
		System.out.println("자동차 색깔 : " + car.color);
		System.out.println("자동차 현재 속도 : " + car.speed);
		
		car.speed = 60;
		System.out.println("자동차 현재 속도 : " + car.speed);
		
		//객체란 : 물리적으로 존재하거나 추상적으로 생각할 수 있는 것 중에서 자신의 속성을 가지고 있고 다른 것과 식별 가능한 것
	}

}
