package part9;

public class Driver {
	
	public void drive(Vehicle vehicle) {	//매개변수의 인터페이스화
//		vehicle.run();
		
		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
