package part7;

public class SupersonicAirplane extends Airplane{
	//자주 사용되는 고정값들은 상수를 사용합으로써 가독성을 높여줌
	public static final int NORMAL = 1;		 //상수 선언
	public static final int SUPERSONIC = 2;	 //상수 선언
	
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			super.fly();
		}
	}
	
}
