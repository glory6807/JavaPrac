package part04;

public class Car {

	int speed;
	String model;
	
	//생성자
	Car(String model) {
		this.model = model;
	}
	
//	int getSpeed() {
//		return speed;
//	}
	
	//메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void keyIn() {
		System.out.println("키를 돌립니다");
	}
	
	void run() {
		for(int i = 10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다! 시속 : " + this.speed + "km/h");
		}
	}
}
