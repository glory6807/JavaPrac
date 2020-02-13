package part4;

public class Calculator {

	int add(int x, int y) {
		int result = x+ y;
		return result;
	}
	
	double avg(int x, int y) {
		int sum = add(x, y);
		int result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(10, 4);
		println("실행결과 : " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
	
	double rectangle(double width) {
		return width * width;
	}
	
	double rectangle(double height, double width) {
		return height * width;
	}

}
