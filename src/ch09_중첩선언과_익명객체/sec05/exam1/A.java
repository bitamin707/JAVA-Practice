package ch09_중첩선언과_익명객체.sec05.exam1;

public class A {
	//A의 인스턴스 필드와 메소드
	int field1;
	void method1() {}
	
	//A의 정적 필드와 메소드
	static int field2;
	static void method2() {}
	
	//인스턴스 멤버 클래스
	class B {
		void method() {
			//A의 인스턴스 필드와 메소드 사용 가능
			field1 = 10;
			method1();
			
			//A의 정적 필드와 메소드 사용 가능
			field2 = 20;
			method2();
		}
	}
	
	//정적 멤버 클래스
	static class C {
		void method() {
			//A의 인스턴스 필드와 메소드 사용 불가
//			field1 = 10;
//			method1();
			
			//A의 정적 필드와 메소드 사용 가능
			field2 = 20;
			method2();
		}
	}
}
