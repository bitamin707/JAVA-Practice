package ch08_인터페이스.sec13;

public sealed interface InterfaceA permits InterfaceB {
	void methodA();
}
