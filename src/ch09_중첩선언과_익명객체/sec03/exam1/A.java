package ch09_중첩선언과_익명객체.sec03.exam1;

public class A {
	//인스턴스 멤버 클래스
	static class B{
		void methodB() {
			System.out.println("methodB 실행");
		}
	}
	
	//인스턴스 필드 값으로 B 객체 대입
	B field1 = new B();
	
	//정적 필드 값으로 B 객체 대입
	static B field2 = new B();
	
	//생성자
	A() {
		B b = new B();
	}
	
	//인스턴스 메소드
	void method1() {
		B b = new B();
	}
	
	//정적 메소드
	static void method2() {
		B b = new B();
	}
}
