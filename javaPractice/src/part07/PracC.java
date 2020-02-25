package part07;

public class PracC {

	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();		
		
//			switch (problemLocation) {
//				case 1:
//					System.out.println("앞 왼쪽 HankookTire로 교체");
//					car.frontLeftTire = new HankookTire(15, "앞왼쪽");
//					break;
//				case 2:
//					System.out.println("앞 오른쪽 KumhoTire로 교체");
//					car.fronRightTire = new KumhoTire(13, "앞오른쪽");
//					break;
//				case 3:
//					System.out.println("뒤 왼쪽 HankookTire로 교체");
//					car.backLeftTire = new HankookTire(14, "뒤왼쪽");
//					break;
//				case 4:
//					System.out.println("뒤 오른쪽 KumhoTire로 교체");
//					car.backRightTire = new KumhoTire(17, "뒤오른쪽");
//					break;
//			}
			
			if(problemLocation != 0) {	//달리지 않는다면
				System.out.println(car.tires[problemLocation-1].location + " HankookTire로 교체");
				car.tires[problemLocation-1] = new HankookTire(15, car.tires[problemLocation-1].location);
			}
			System.out.println("-----------------------------------");		
		}	
	}

}
