package part9;

public class PracD {

	public static void main(String[] args) {
//		Driver driver = new Driver();
//
//		Bus bus = new Bus();
//		Taxi taxi = new Taxi();
//
//		driver.drive(bus);	//자동 타입 변환 : Vehicle vehicle = bus;
//		driver.drive(taxi);	////자동 타입 변환 : Vehicle vehicle = taxi;
		
		Vehicle vehicle = new Bus();
		vehicle.run();
		//vehicle.checkFare();	//Vehicle 인터페이스에는 checkFare() 메소드가 없음
		
		Bus bus = (Bus)vehicle;
		bus.run();
		bus.checkFare();
	}

}
