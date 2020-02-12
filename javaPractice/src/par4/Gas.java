package par4;

public class Gas {
	
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isGasLeft() {
		if(gas == 0) {
			System.out.println("가스가 없습니다");
			return false;
		} 
			System.out.println("가스가 남아있습니다");
			return true;
	}
	
	//void로 선언된 메소드라도 return을 사용할 수 있음 -> 메소드를 즉시 종료하고 싶을 때
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다! 가스잔량 : " + gas);
				gas -= 1;
			} else {
				System.out.println("멈춥니다! 가스잔량 : " + gas);
				return;
			}		
		}
	}
	
}
