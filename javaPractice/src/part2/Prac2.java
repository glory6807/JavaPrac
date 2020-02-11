package part2;

public class Prac2 {

	public static void main(String[] args) {
		int sum = 0;
		int scores[] = {83, 90, 87};
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		for(int i = 0; i <3; i++) {
			sum += scores[i];
		}
		
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 : " + avg);
		
		double avg2 = (double) sum / scores.length;
		System.out.println("평균 : " + avg2);
		
		String[] names = null;
		names = new String[] {"홍길동", "길동홍", "동홍길"};
		
	}//END main

}//END Prac2
