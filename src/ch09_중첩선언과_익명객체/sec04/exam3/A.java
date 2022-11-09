package ch09_중첩선언과_익명객체.sec04.exam3;

public class A {
	public void method(int arg) {	//final int arg (final 생략)
		//로컬 변수
		int var = 1;	//final int var = 1; (final 생략)
		
		//로컬 클래스
		class B {
			void method2() {
				//로컬 변수 읽기
				System.out.println("arg : " + arg);
				System.out.println("var : " + var);
			}
			
		}
		
//		arg = 2;
//		var = 2;
		
		System.out.println("arg : " + arg);
		System.out.println("var : " + var);
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.method(3);
	}
}
