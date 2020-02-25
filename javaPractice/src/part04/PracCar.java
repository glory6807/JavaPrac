package part04;

public class PracCar {

	public static void main(String[] args) {
//		Car car = new Car();
//		car.keyIn();
//		car.run();
//		int speed = car.getSpeed();
//		System.out.println("현재 속도 : 시속 " + speed + "km/h" );
		
		Car car1 = new Car("아우디");
		Car car2 = new Car("폭스바겐");
		
		car1.run();
		car2.run();

	}

}
