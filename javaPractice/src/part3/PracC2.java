package part3;

public class PracC2 {

	public static void main(String[] args) {
		Car2 car1 = new Car2();
		System.out.println(car1.model);
		
		Car2 car4 = new Car2("그랜져", "black", 2000);
		System.out.println(car4.model);
		System.out.println(car4.color);
		System.out.println(car4.maxSpeed);
	}

}
