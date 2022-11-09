package ch09_중첩선언과_익명객체.sec02.exam1;

public class AExample {

	public static void main(String[] args) {
		A a = new A();

		A.B b = a.new B();
		b.methodB();
	}
	
}
