package part4;

public class PracCar {

	public static void main(String[] args) {
		Car car = new Car();
		car.keyIn();
		car.run();
		int speed = car.getSpeed();
		System.out.println("현재 속도 : 시속 " + speed + "km/h" );

	}

}
