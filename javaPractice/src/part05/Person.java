package part05;

public class Person {
	final String nation = "Korea";
	final String ssn;	//Person 객체가 생성될 때 부여되므로 초기값을 미리 줄 수 없음
	String name;
	
	Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	Person(String ssn) {
		this.ssn = ssn;		
	}
}
