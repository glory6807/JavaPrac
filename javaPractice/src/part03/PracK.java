package part03;

public class PracK {

	public static void main(String[] args) {
		
		Korean korean1 = new Korean("홍길동", "123456-7654321");
		System.out.println(korean1.name);
		System.out.println(korean1.ssn);

		Korean korean2 = new Korean("길동홍", "123456-9876543");
		System.out.println(korean2.name);
		System.out.println(korean2.ssn);

	}

}
