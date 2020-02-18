package part7;

public class Tire {
	public int maxRotation;			//최대 회전수(타이어 수명)
	public int accumulateRotation;	//누적 회전수
	public String location;			//타이어의 위치
	
	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	public boolean roll() {
		++accumulateRotation;	//누적 회전수 1증가
		if(accumulateRotation<maxRotation) {	//정상 회전일 경우 실행
			System.out.println(location + "Tire 수명 : " + (maxRotation - accumulateRotation) + "회");
			return true;
		} else {	//펑크일 경우 실행
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
	
}
