package part08;

public class PracA {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("-------");
		
		Animal animal = null;	//Animal 변수로 타입 변환해서 호출
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("-------");
		
		animalSound(new Dog());
		animalSound(new Cat());
	}	
	
		//메소드의 다형성
		public static void animalSound(Animal animal) {	//부모 타입의 매개변수에 자식 객체를 대입해서 메소드의 다형성을 적용
			animal.sound();	//재정의된 메소드 호출
		}

	

}
