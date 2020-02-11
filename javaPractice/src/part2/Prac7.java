package part2;

public class Prac7 {

	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		String name = today.name();		//name() 메소드
		int ordinal = today.ordinal();	//ordinal() 메소드
		
		System.out.println(name);
		System.out.println(ordinal);
		
		//compareTo() 메소드
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		
		//values() 메소드
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
		
	}//END main

}//END Prac7
