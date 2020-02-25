package part05;

public class Singleton {

	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {	//외부에서 호출할 수 있는 정적 메소드
		return singleton;
	}

}
