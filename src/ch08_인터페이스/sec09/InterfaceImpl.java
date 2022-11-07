package ch08_인터페이스.sec09;

public class InterfaceImpl implements InterfaceC {

	@Override
	public void methodA() {
		System.out.println("InterfaceCImple-methodA() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("InterfaceCImple-methodB() 실행");
	}

	@Override
	public void methodC() {
		System.out.println("InterfaceCImple-methodC() 실행");
	}

}
