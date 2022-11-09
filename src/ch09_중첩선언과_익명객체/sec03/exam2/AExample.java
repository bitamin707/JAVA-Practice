package ch09_중첩선언과_익명객체.sec03.exam2;

import ch09_중첩선언과_익명객체.sec03.exam2.A.B;

public class AExample {

	public static void main(String[] args) {
		
		A.B b = new A.B();
		System.out.println(b.field1);
		b.method1();
		
		//B 클래스의 정적 필드 및 메소드 사용
		System.out.println(B.field2);
		B.method2();
		
	}
	
}
