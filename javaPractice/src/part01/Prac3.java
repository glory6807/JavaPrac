package part1;

public class Prac3 {

	public static void main(String[] args) {
		//String객체의 문자열만 비교하고 싶다면 == 연산자 대신 equals() 메소드를 사용해야 함
		//strVar1, strVar2는 동일한 String 객체의 번지값을 가지고 있음
		//strVar3은 객체 생성 연산자인 new로 생성한 새로운 String 객체의 번지값을 가지고 있음
		String strVar1 = "자바";
		String strVar2 = "자바";
		String strVar3 = new String("자바");
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar2 == strVar3);
		System.out.println("---------------------");
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar2.equals(strVar3));
	}//END main

}//END PracK
