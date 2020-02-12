package part1;

public class Prac1 {

	public static void main(String[] args) {
		//System.out.println("Hello");	
		
		int x = 1;
		int y = 2;
		int z = x + y;
		
		System.out.println(z);	//3
		
		int value = 10;
		int result = value + 10;
		
		System.out.println(result);	//20
		
		//변수는 선언된 블록 내에서만 사용이 가능함
		
		int v1 = 15;	//메소드 블록에서 선언
		if(v1 > 10) {
			int v2 = v1 - 10;	//if블록에서 선언
		}
			//int v3 = v1 + v2 + 5;	//v2 변수를 사용할 수 없으므로 컴파일 에러가 생김
	}//END main

}//END PracS	//~p.37
