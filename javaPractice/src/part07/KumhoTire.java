package part07;

public class KumhoTire extends Tire{
	//필드
	
	//생성자
	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
	}

	@Override
	public boolean roll() {
		++accumulateRotation;
		if(accumulateRotation<maxRotation) {
			System.out.println(location + "KumhoTire 수명 " + (maxRotation-accumulateRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire 펑크 ***");
			return false;
		}
	}
	
	
}
