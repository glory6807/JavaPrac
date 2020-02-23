package part10;

public class A {
	
	A() {
		System.out.println("A객체가 생성됨");
	}
	
	/** 인스턴스 멤버 클래스 **/
	class B {
		//생성자
		B() {
			System.out.println("B객체가 생성됨");
		}
		
		//인스턴스 필드
		int field1;
		
		//정적 필드(X)
		//static int field2; 
		
		//인스턴스 메소드 : 객체를 생성한 뒤 사용할 수 있음
		void method1() {}
		
		//정적 메소드 : 객체를 생성하지 않고 호출이 가능함
		//static void method2() {}
	}
	
	/** 정적 멤버 클래스 **/
	static class C {
		//생성자
		C() {
			System.out.println("C객체가 생성됨");
		}
		
		//인스턴스 필드
		int field1;
		
		//정적 필드
		static int field2; 
		
		//인스턴스 메소드 : 객체를 생성한 뒤 사용할 수 있음
		void method1() {}
		
		//정적 메소드 : 객체를 생성하지 않고 호출이 가능함
		static void method2() {}
	}
	
	void method() {
		/** 로컬 클래스 **/
		class D {
			//생성자
			D() {
				System.out.println("D객체가 생성됨");
			}
			
			//인스턴스 필드
			int field1;
			
			//정적 필드(X)
			//static int field2; 
			
			//인스턴스 메소드 : 객체를 생성한 뒤 사용할 수 있음
			void method1() {}
			
			//정적 메소드 : 객체를 생성하지 않고 호출이 가능함
			//static void method2() {}		
		}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
