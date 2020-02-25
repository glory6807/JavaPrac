package part01;

public class Prac4 {

	public static void main(String[] args) {
		//조건문 : if문, switch문
		//반복문 : for문, while문, do-while문
		
		int num = (int)(Math.random()*6) + 1;
		
		switch(num) {
			case 1 : 
				System.out.println("1번이 나왔습니다.");
				break;
			case 2 : 
				System.out.println("2번이 나왔습니다.");
				break;
			case 3 : 
				System.out.println("3번이 나왔습니다.");
				break;
			case 4 : 
				System.out.println("4번이 나왔습니다.");
				break;
			case 5 : 
				System.out.println("5번이 나왔습니다.");
				break;
			default : 
				System.out.println("6번이 나왔습니다.");
				break;
		}//END switch
		
		int time = (int)(Math.random()*4) + 8;
		System.out.println("[현재시간: " + time + " 시]");
		
		switch(time) {
			case 8 :
				System.out.println("출근을 합니다");
			case 9 :
				System.out.println("회의를 합니다");
			case 10 :
				System.out.println("업무를 봅니다");
			default :
				System.out.println("외근을 나갑니다");
		}//END switch
		
		System.out.println("-------------------------------------");
		
//		int sum = 0;	//for문 밖에 선언
//		
//		for(int i = 1; i <= 100; i++) {
//			sum+=i;		//i는 for문 밖에서 못쓴다(i를 밖에서 선언했으면 사용 가능)				
//		}		
//			System.out.println("1~10의 합 : " + sum);	//END sum
		
		for(int m = 2; m <= 9; m++) {
			System.out.println("****** " + m + "단 ******");
			
			for(int n = 1; n <=9; n++) {
				System.out.println(m + "X" + n + "=" + (m*n));
			}
		}//END 구구단
		
		int sum = 0;
		
		int i = 1;
		
		while(i<=100) {
			sum+=i;
			i++;	//빼먹지 말기!
		}
			System.out.println("1~100의 합계 : " + sum);	//END sum
	}//END main

}//END Prac4
