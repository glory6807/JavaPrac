package part01;

import java.util.Scanner;

public class Prac6 {

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner scan = new Scanner(System.in);	//스캐너 객체 생성
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scan.nextLine();
			System.out.println(inputString);
		} while(!inputString.equals("q")); 
			System.out.println();
			System.out.println("프로그램 종료");
	}//END main

}//END Prac6
