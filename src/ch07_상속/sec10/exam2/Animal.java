package ch07_상속.sec10.exam2;

public abstract class Animal {
	//메소드 선언
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}
	
	//추상 메소드 선언
	public abstract void sound();
}
