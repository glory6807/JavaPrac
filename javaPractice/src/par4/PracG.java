package par4;

public class PracG {

	public static void main(String[] args) {
		Gas gas = new Gas();
		
		gas.setGas(5);	//setGas 메소드를 호출하여 필드값을 5로 변경해줌
		
		boolean gasCheck = gas.isGasLeft();	//isGasLeft 메소드를 호출하여 리턴값을 gasCheck 변수에 저장
		
		if(gasCheck) {	//gasCheck 변수값이 true일 경우 run메소드를 호출
			System.out.println("출발합니다");
			gas.run();
		} 
		
		if(gas.isGasLeft()) {
			System.out.println("가스를 주입할 필요가 없습니다..");
		} else {
			System.out.println("가스를 주입해주세요");
		}

	}

}
