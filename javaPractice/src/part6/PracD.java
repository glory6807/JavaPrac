package part6;

public class PracD {

	public static void main(String[] args) {
		DmbCellPhone dmb = new DmbCellPhone("자바폰", "purple", 10);	//사실은 내부적으로 부모인 CellPhone 객체가 먼저 생성되고, DmbCellPhone 객체가 생성됨
		
		//CellPhone으로부터 상속받은 필드
		System.out.println("모델 : " + dmb.model);
		System.out.println("색상 : " + dmb.color);
		
		//DmbCellPhone의 필드
		System.out.println("채널 : " + dmb.channel);
		
		//CellPhone으로부터 상속받은 메소드 호출
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("여보세요");
		dmb.receiveVoice("안녕하세요! 저는 홍길동입니다~");
		dmb.sendVoice("아 네;");
		dmb.hangUp();
		
		//DmbCelPhone의 메소드 호출
		dmb.turnOnDmb();
		dmb.changeChannelDmb(15);
		dmb.turnOffDmb();

	}

}
