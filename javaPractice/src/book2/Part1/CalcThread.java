package book2.Part1;

public class CalcThread extends Thread{
	public CalcThread(String name) {
		setName(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 100000000; i++) {
			
		}
		System.out.println(getName());
	}
	
	
}
