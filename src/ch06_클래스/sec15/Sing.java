package ch06_클래스.sec15;

public class Sing {
	//private 접근 권한을 갖는 정적 필드 선언과 초기화
	private static Sing singleton = new Sing();
	
	//생성자 선언
	private Sing() {
	}
	
	//정적 메소드 선언
	static Sing getInstance() {
		return singleton;
	}
}
