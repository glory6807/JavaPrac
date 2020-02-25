package part09;

public class PracM {

	public static void main(String[] args) {
		MyInterface mia = new MyClassA();
		mia.method1();
		mia.method2();
		
		MyInterface mib = new MyClassB();
		mib.method1();
		mib.method2();
	}

}
