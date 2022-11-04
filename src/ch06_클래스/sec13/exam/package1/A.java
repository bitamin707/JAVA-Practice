package ch06_클래스.sec13.exam.package1;

public class A {
	A a = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	//public 접근 제한 생성자
	public A(boolean b) {
		
	}
	
	//default 접근 제한 생성자
	A(int b) {
	}
	
	//private 접근 제한 생성자
	private A(String s) {
	}
}
