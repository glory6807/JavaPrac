package part05;

public class Earth {
	//static final 필드는 객체마다 저장되지 않고, 클래스에만 포함되고, 한 번 초기값이 저장되면 변경할 수 없음
	static final double Earth_radius = 6400;
	static final double Earth_surface_area;
	
	static {
		Earth_surface_area = 4 * Math.PI * Earth_radius * Earth_radius;
	}
}
