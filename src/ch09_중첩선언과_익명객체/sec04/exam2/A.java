package ch09_중첩선언과_익명객체.sec04.exam2;

public class A {
	//메소드
	void useB() {
		//로컬 클래스
		class B {
			int field1 = 1;

			//정적 필드(Java 17부터 허용)
			static int field2 = 2;
			
			//생성자
			B() {
				System.out.println("B 생성자 실행");
			}
			
			//인스턴스 메소드
			void method1() {
				System.out.println("B method1 실행");
			}
			
			//정적 메소드(Java 17부터 허용)
			static void method2() {
				System.out.println("B method2 실행");
			}
		}
		
		B b = new B();
		
		System.out.println(b.field1);
		b.method1();
		
		System.out.println(B.field2);
		B.method2();
	}
}
