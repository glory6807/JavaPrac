package part9;

public class PracC {

	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		
//		car.frontLeftTire = new KumhoTire();
//		car.frontRightTire = new KumhoTire();
		
		car.tires[0] = new KumhoTire();
		car.tires[1] = new KumhoTire();
		
		car.run();
	}

}
