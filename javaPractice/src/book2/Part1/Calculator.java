package book2.Part1;

public class Calculator {
	
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
//	public void setMemory(int memory) {
//		this.memory = memory;
//		try {
//			Thread.sleep(2000);
//		} catch (Exception e) {
//			
//		}
//		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
//	}

	public void setMemory(int memory) {
		
		synchronized (this) {	//공유 객체인 Calculator의 참조(잠금 대상)		
			
			this.memory = memory;
			
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				
			}
			System.out.println(Thread.currentThread().getName() + " : " + this.memory);
		}
		
	}
}
