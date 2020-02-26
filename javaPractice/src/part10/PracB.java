package part10;

public class PracB {

	public static void main(String[] args) {
		Button button = new Button();
		button.setOnClickListener(new CallListener());
		button.onClick();
		
		button.setOnClickListener(new MessageListener());
		button.onClick();
	}

}
