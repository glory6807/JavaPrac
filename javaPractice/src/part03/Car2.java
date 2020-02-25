package part03;

public class Car2 {

	String model;
	String color;
	int maxSpeed;
	
	Car2() {
		
	}
	
	Car2(String model) {
		this(model, "black", 200);
	}
	
	Car2(String model, String color) {
		this(model, color, 200);
	}
	
	Car2(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
