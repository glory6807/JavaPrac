package part01;

public class Prac7 {
	public static void main(String[] args) {
//		while(true) {
//			int num = (int)(Math.random()*6) + 1;
//			System.out.println(num);
//			
//			if(num == 6) {
//				break;
//			}//END if
//			
//		}//END while
		
//		Outter : for(char upper = 'A'; upper <= 'Z'; upper++) {
//					for(char lower = 'a'; lower <='z'; lower++) {
//						System.out.println(upper + "-" + lower);
//							if(lower == 'g') {
//								break Outter;
//							}
//					}
//		}//END Outter
//			System.out.println("프로그램 실행 종료");
			
		for(int i = 1; i <=10; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);	//홀수는 실행되지 않음
		}
	}//END main
}//END Prac7
