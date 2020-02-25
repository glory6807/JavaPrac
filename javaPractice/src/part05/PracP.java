package part05;

public class PracP {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "홍길동");
		Person p2 = new Person("32165478-654321");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		System.out.println(p2.ssn);
		
		//p1.nation = "usa";	//final필드는 수정 불가
		p1.name = "강감찬";
	}

}
