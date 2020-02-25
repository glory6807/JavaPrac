package part01;

public class Prac2 {

	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		
		for(int i = 0; i < 5; i++) {
			var1++;	//127이 넘어서는 순간 최소값인 -128부터 다시 저장됨
			var2++;
			System.out.println("var1 : " + var1 + "\t" + "var2 : " + var2);
		}//END for
		
		boolean stop = true;
		
		if(stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}//END if
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		int i = 128;
		
		if(i < Byte.MIN_VALUE || i > Byte.MAX_VALUE) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요.");
		} else {
			byte b = (byte) i;
			System.out.println(b);
		}//END if
		
	}//END main

}//END PracC	//~p.63
