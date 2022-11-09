package ch09_중첩선언과_익명객체.sec02.exam1;

public class A {
	//인스턴스 멤버 클래스
	class B{
		void methodB() {
			System.out.println("methodB() 실행");
		}
	}
	
	//인스턴스 필드 값으로 B 객체 대입
	B field = new B();

	//생성자
	public A() {
		B b = new B();
	}
	
	//인스턴스 메소드
	void method() {
		B b = new B();
	}
}
