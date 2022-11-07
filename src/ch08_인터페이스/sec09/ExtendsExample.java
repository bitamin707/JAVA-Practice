package ch08_인터페이스.sec09;

public class ExtendsExample {

	public static void main(String[] args) {
		
		InterfaceImpl impl = new InterfaceImpl();
		
		InterfaceA ia = impl;
		ia.methodA();
//		ia.methodB(); //선언 불가
		System.out.println();
		
		InterfaceB ib = impl;
//		ib.methodA(); //선언 불가
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}

}
