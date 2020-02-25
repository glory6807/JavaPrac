 package part02;

public class Prac1 {

	public static void main(String[] args) {
//		int[] intArray = null;
//		intArray[0] = 10;	//NullPointerException
		
		String name1 = "홍길동";
		String name2 = "홍길동";
		//name1, name2는 동일한 String 객체를 참조하게 됨
		
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");
		//name3, name4는 서로 다른 String 객체를 참조하게 됨
		
		if(name1 == name2) {
			System.out.println("name1과 name2는 참조가 같음");
		} else {
			System.out.println("name1과 name2는 참조가 다름");
		}
		
		if(name1.equals(name2)) {
			System.out.println("name1과 name2는 문자열이 같음");
		}
		
		System.out.println("---------------------------");
		
		if(name3 == name4) {
			System.out.println("name3과 name4는 참조가 같음");
		} else {
			System.out.println("name3과 name4는 참조가 다름");
		}
		
		if(name3.equals(name4)) {
			System.out.println("name3과 name4는 문자열이 같음");
		}
	}

}
