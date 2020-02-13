package part4;

public class PracC {

	public static void main(String[] args) {
		Cal cal = new Cal();
		cal.powerOn();
		
		int result1 = cal.add(3, 5);
		System.out.println("더한 결과 : " + result1);
		
		double result2 = cal.divide(10, 5);
		System.out.println("나눈 결과 : " + result2);
		cal.powerOff();

	}

}
