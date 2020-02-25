package part04;

public class PracCC {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.execute();
		
		double result1 = cal.rectangle(10);
		System.out.println(result1);
		
		double result2 = cal.rectangle(10, 20);
		System.out.println(result2);
	}

}
